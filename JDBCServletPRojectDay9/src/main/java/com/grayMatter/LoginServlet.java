package com.grayMatter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body bgcolor=yellow><h1>Hello Login Servlet...!</h1></body></html>");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		RequestDispatcher dispatcher;
		if(name.equals("user")&&pwd.equals("12345"))
		{
//			out.println("Welcome User: "+name);
			request.setAttribute("uname", name);
			dispatcher =request.getRequestDispatcher("WelcomeServlet");
			dispatcher.forward(request,response);
		}
		else
		{
			dispatcher=request.getRequestDispatcher("index.jsp");
//			dispatcher=request.getRequestDispatcher("Error.jsp");//for printing error when login is wrong
		    dispatcher.forward(request,response);
		}
//			out.println("Incorrect credentials");
		out.close();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
