package com.grayMatter;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;

public class LoginServletTest {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    HttpSession session;

    @Test
    public void testDoPostSuccess() throws Exception {
        MockitoAnnotations.initMocks(this);
        LoginServlet servlet = new LoginServlet();

        when(request.getParameter("email")).thenReturn("test@example.com");
        when(request.getParameter("password")).thenReturn("password");

        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        when(request.getSession()).thenReturn(session);

        servlet.doPost(request, response);

        verify(response).sendRedirect("home.jsp");
    }

    @Test
    public void testDoPostFailure() throws Exception {
        MockitoAnnotations.initMocks(this);
        LoginServlet servlet = new LoginServlet();

        when(request.getParameter("email")).thenReturn("test@example.com");
        when(request.getParameter("password")).thenReturn("wrongpassword");

        servlet.doPost(request, response);

        verify(response).sendRedirect("Login.jsp?error=invalid");
    }
}
