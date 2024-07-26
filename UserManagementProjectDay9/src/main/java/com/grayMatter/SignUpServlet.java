package com.grayMatter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher dispatcher;
        try (Connection con = new DataSourceClass().getConnection()) {
            String query = "INSERT INTO user (uname, uid, mailid, upswrd, mobile_num) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, request.getParameter("uname"));
                ps.setInt(2, Integer.parseInt(request.getParameter("uid")));
                ps.setString(3, request.getParameter("mailid"));
                ps.setString(4, request.getParameter("upswrd"));
                ps.setString(5, request.getParameter("mobile_num"));
                ps.executeUpdate();
                
            }
//            response.sendRedirect("login.jsp");// also works or use below two lines
//            sendredirect doesnt pass any request objects to next resource(login.jsp)
//            essentially it redirects the url in browser(client side)
            dispatcher =request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request,response);
			//dispatcher forwar
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
//            response.sendRedirect("error.jsp"); // Optional: Redirect to an error page
            dispatcher =request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request,response);
        }
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
