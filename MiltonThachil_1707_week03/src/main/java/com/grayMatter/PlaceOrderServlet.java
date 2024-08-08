package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;


public class PlaceOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            DataSourceClass ds = new DataSourceClass();
            con = ds.getConnection();

            
            con.setAutoCommit(false);

            
            String insertOrderSQL = "INSERT INTO orders (date, total_cost) VALUES (?, ?)";
            ps = con.prepareStatement(insertOrderSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDate(1, new Date(System.currentTimeMillis()));
            ps.setDouble(2, 0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            int orderId = 0;
            if (rs.next()) {
                orderId = rs.getInt(1);
            }
            rs.close();
            ps.close();

            
            double totalCost = 0;
            Enumeration<String> parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                String paramName = parameterNames.nextElement();
                if (paramName.startsWith("quantity_")) {
                    int itemId = Integer.parseInt(paramName.substring("quantity_".length()));
                    int quantity = Integer.parseInt(request.getParameter(paramName));
                    if (quantity > 0) {
                        String itemQuery = "SELECT cost FROM items WHERE id = ?";
                        ps = con.prepareStatement(itemQuery);
                        ps.setInt(1, itemId);
                        ResultSet itemRs = ps.executeQuery();
                        double cost = 0;
                        if (itemRs.next()) {
                            cost = itemRs.getDouble("cost");
                        }
                        itemRs.close();
                        ps.close();

                        String insertOrderItemSQL = "INSERT INTO order_items (order_id, item_id, quantity) VALUES (?, ?, ?)";
                        ps = con.prepareStatement(insertOrderItemSQL);
                        ps.setInt(1, orderId);
                        ps.setInt(2, itemId);
                        ps.setInt(3, quantity);
                        ps.executeUpdate();
                        totalCost += cost * quantity;
                    }
                }
            }

            // Update total_cost in orders
            String updateOrderSQL = "UPDATE orders SET total_cost = ? WHERE id = ?";
            ps = con.prepareStatement(updateOrderSQL);
            ps.setDouble(1, totalCost);
            ps.setInt(2, orderId);
            ps.executeUpdate();

            // Commit transaction
            con.commit();
            response.sendRedirect("orderList.jsp");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            response.sendRedirect("order.jsp?error=true");
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
