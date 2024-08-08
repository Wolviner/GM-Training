package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username=request.getParameter("username");

        try {
            if (validateUser(email, password)) {
                HttpSession session = request.getSession();
                session.setAttribute("userEmail", email);
                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("Login.jsp?error=invalid");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new ServletException(e);
        }
    }

    private boolean validateUser(String email, String password) throws SQLException, ClassNotFoundException {
        Connection con = new DataSourceClass().getConnection();
        String query = "SELECT * FROM customers WHERE email = ? AND password = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        boolean isValid = rs.next();
        rs.close();
        stmt.close();
        con.close();
        return isValid;
    }
}
