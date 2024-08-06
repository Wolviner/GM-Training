package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            DataSourceClass ds = new DataSourceClass();
            Connection con = ds.getConnection();
            PreparedStatement ps = null;

            if ("addItem".equals(action)) {
                String name = request.getParameter("name");
                double cost = Double.parseDouble(request.getParameter("cost"));
                String sql = "INSERT INTO items (name, cost) VALUES (?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setDouble(2, cost);
                ps.executeUpdate();

            } else if ("removeItem".equals(action)) {
                int id = Integer.parseInt(request.getParameter("itemId"));
                String sql = "DELETE FROM items WHERE id = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();

            } else if ("addCustomer".equals(action)) {
                String name = request.getParameter("name");
                String mobile = request.getParameter("mobile");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String sql = "INSERT INTO customers (name, mobile, email, password, order_date) VALUES (?, ?, ?, ?, CURDATE())";
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, mobile);
                ps.setString(3, email);
                ps.setString(4, password);
                ps.executeUpdate();

            } else if ("removeCustomer".equals(action)) {
                String email = request.getParameter("email");
                String sql = "DELETE FROM customers WHERE email = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, email);
                ps.executeUpdate();
            }

            ps.close();
            con.close();
            response.sendRedirect("admin.jsp");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("admin.jsp?error=true");
        }
    }
}
