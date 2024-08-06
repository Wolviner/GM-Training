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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");

        if ("admin".equals(role)) {
            
            response.sendRedirect("admin.jsp");
        } else if ("customer".equals(role)) {
            
            List<Integer> orderIds = new ArrayList<>();
            List<String> dates = new ArrayList<>();
            List<Integer> itemIds = new ArrayList<>();
            List<Integer> quantities = new ArrayList<>();
            List<Double> costs = new ArrayList<>();

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
                    orderIds.add(rs.getInt("order_id"));
                    dates.add(rs.getString("date"));
                    itemIds.add(rs.getInt("item_id"));
                    quantities.add(rs.getInt("quantity"));
                    costs.add(rs.getDouble("cost"));
                }

                request.setAttribute("orderIds", orderIds);
                request.setAttribute("dates", dates);
                request.setAttribute("itemIds", itemIds);
                request.setAttribute("quantities", quantities);
                request.setAttribute("costs", costs);

                request.getRequestDispatcher("orderList.jsp").forward(request, response);

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
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
