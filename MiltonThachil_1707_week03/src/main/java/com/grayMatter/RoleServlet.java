package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleServlet extends HttpServlet {
    private static final int STATIC_QUANTITY = 12;  // Static quantity value

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");

        if ("admin".equals(role)) {
            response.sendRedirect("admin.jsp");
        } else if ("customer".equals(role)) {
            List<Integer> orderIds = new ArrayList<>();
            List<String> dates = new ArrayList<>();
            List<Integer> itemIds = new ArrayList<>();
            List<String> itemNames = new ArrayList<>();
            List<Double> itemCosts = new ArrayList<>();
            List<Double> totalCosts = new ArrayList<>();

            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                DataSourceClass ds = new DataSourceClass();
                con = ds.getConnection();

                // SQL query to get order and item details
                String query = "SELECT o.id AS order_id, o.date AS order_date, " +
                               "i.id AS item_id, i.name AS item_name, i.cost AS item_cost " +
                               "FROM orders o " +
                               "JOIN items i ON o.id = i.id";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int orderId = rs.getInt("order_id");
                    String date = rs.getString("order_date");
                    int itemId = rs.getInt("item_id");
                    String itemName = rs.getString("item_name");
                    double itemCost = rs.getDouble("item_cost");
                    double totalCost = itemCost * STATIC_QUANTITY;  // Calculate total cost using static quantity

                    // Store details
                    orderIds.add(orderId);
                    dates.add(date);
                    itemIds.add(itemId);
                    itemNames.add(itemName);
                    itemCosts.add(itemCost);
                    totalCosts.add(totalCost);
                }

                request.setAttribute("orderIds", orderIds);
                request.setAttribute("dates", dates);
                request.setAttribute("itemIds", itemIds);
                request.setAttribute("itemNames", itemNames);
                request.setAttribute("itemCosts", itemCosts);
                request.setAttribute("quantities", STATIC_QUANTITY);  // Static quantity
                request.setAttribute("totalCosts", totalCosts);

                request.getRequestDispatcher("orderList.jsp").forward(request, response);

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error: " + e.getMessage());
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (ps != null) ps.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            response.sendRedirect("home.jsp?error=invalidRole");
        }
    }
}
