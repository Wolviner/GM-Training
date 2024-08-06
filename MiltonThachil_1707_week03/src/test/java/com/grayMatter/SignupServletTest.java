package com.grayMatter;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static org.mockito.Mockito.*;

public class SignupServletTest {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Test
    public void testDoPost() throws Exception {
        MockitoAnnotations.initMocks(this);
        SignupServlet servlet = new SignupServlet();

        when(request.getParameter("name")).thenReturn("John Doe");
        when(request.getParameter("email")).thenReturn("john.doe@example.com");
        when(request.getParameter("mobile")).thenReturn("1234567890");
        when(request.getParameter("password")).thenReturn("password");

        servlet.doPost(request, response);

        verify(response).sendRedirect("Login.jsp");
    }
}
