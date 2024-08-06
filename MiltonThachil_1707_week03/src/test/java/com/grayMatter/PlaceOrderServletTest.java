package com.grayMatter;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static org.mockito.Mockito.*;

public class PlaceOrderServletTest {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Test
    public void testDoPost() throws Exception {
        MockitoAnnotations.initMocks(this);
        PlaceOrderServlet servlet = new PlaceOrderServlet();

        when(request.getParameter("itemId")).thenReturn("1");
        when(request.getParameter("quantity")).thenReturn("2");

        servlet.doPost(request, response);

        verify(response).sendRedirect("home.jsp");
    }
}
