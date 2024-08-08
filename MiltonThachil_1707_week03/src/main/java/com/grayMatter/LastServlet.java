package com.grayMatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/placeOrder")
public class LastServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Here you would add the code to process the order (e.g., save to database)
        // For simplicity, we'll just redirect to a confirmation page

        response.sendRedirect("orderConfirmation.jsp");
    }
}
