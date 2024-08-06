package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OrderListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<OrderDetail> orderDetails = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            DataSourceClass ds = new DataSourceClass();
            con = ds.getConnection();
            String query = "SELECT o.id AS order_id, o.date, oi.item_id, oi.quantity, (oi.quantity * i.cost) AS cost " +
                           "FROM orders o " +
                           "JOIN order_items oi ON o.id = oi.order_id " +
                           "JOIN items i ON oi.item_id = i.id";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                OrderDetail detail = new OrderDetail(
                    rs.getInt("order_id"),
                    rs.getString("date"),
                    rs.getInt("item_id"),
                    rs.getInt("quantity"),
                    rs.getDouble("cost")
                );
                orderDetails.add(detail);
            }

            request.setAttribute("orderDetails", orderDetails);
            request.getRequestDispatcher("orderList.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
