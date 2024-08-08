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

@WebServlet("/viewItems")
public class ViewItemsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Integer> itemIds = new ArrayList<>();
        List<String> itemNames = new ArrayList<>();
        List<Double> itemCosts = new ArrayList<>();
        
        List<Integer> customerIds = new ArrayList<>();
        List<String> customerNames = new ArrayList<>();
        List<String> customerMobiles = new ArrayList<>();
        List<String> customerEmails = new ArrayList<>();
        List<String> customerOrderDates = new ArrayList<>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            DataSourceClass ds = new DataSourceClass();
            con = ds.getConnection();

            // Fetching items
            String itemsQuery = "SELECT id, name, cost FROM items";
            ps = con.prepareStatement(itemsQuery);
            rs = ps.executeQuery();

            while (rs.next()) {
                int itemId = rs.getInt("id");
                String itemName = rs.getString("name");
                double itemCost = rs.getDouble("cost");

                itemIds.add(itemId);
                itemNames.add(itemName);
                itemCosts.add(itemCost);
            }
            
            rs.close();
            ps.close();
            
            // Fetching customers
            String customersQuery = "SELECT id, name, mobile, email, order_date FROM customers";
            ps = con.prepareStatement(customersQuery);
            rs = ps.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt("id");
                String customerName = rs.getString("name");
                String customerMobile = rs.getString("mobile");
                String customerEmail = rs.getString("email");
                String customerOrderDate = rs.getString("order_date");

                customerIds.add(customerId);
                customerNames.add(customerName);
                customerMobiles.add(customerMobile);
                customerEmails.add(customerEmail);
                customerOrderDates.add(customerOrderDate);
            }

            request.setAttribute("itemIds", itemIds);
            request.setAttribute("itemNames", itemNames);
            request.setAttribute("itemCosts", itemCosts);

            request.setAttribute("customerIds", customerIds);
            request.setAttribute("customerNames", customerNames);
            request.setAttribute("customerMobiles", customerMobiles);
            request.setAttribute("customerEmails", customerEmails);
            request.setAttribute("customerOrderDates", customerOrderDates);

            request.getRequestDispatcher("itemsList.jsp").forward(request, response);

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
    }
}
