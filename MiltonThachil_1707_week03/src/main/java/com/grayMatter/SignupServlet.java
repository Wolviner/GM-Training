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

@WebServlet("/signupServlet")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");

        try {
            addUser(name, email, mobile, password);
            response.sendRedirect("login.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            throw new ServletException(e);
        }
    }

    private void addUser(String name, String email, String mobile, String password) throws SQLException, ClassNotFoundException {
        Connection con = new DataSourceClass().getConnection();
        String query = "INSERT INTO customers (name, email, mobile, password, order_date) VALUES (?, ?, ?, ?, NOW())";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setString(3, mobile);
        stmt.setString(4, password); // Ensure password is hashed in a real application
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }
}
