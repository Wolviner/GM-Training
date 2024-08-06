<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order List</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Order List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Order ID</th>
                <th>Date</th>
                <th>Item ID</th>
                <th>Quantity</th>
                <th>Cost</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Integer> orderIds = (List<Integer>) request.getAttribute("orderIds");
                List<String> dates = (List<String>) request.getAttribute("dates");
                List<Integer> itemIds = (List<Integer>) request.getAttribute("itemIds");
                List<Integer> quantities = (List<Integer>) request.getAttribute("quantities");
                List<Double> costs = (List<Double>) request.getAttribute("costs");

                if (orderIds != null && !orderIds.isEmpty()) {
                    for (int i = 0; i < orderIds.size(); i++) {
            %>
                <tr>
                    <td><%= orderIds.get(i) %></td>
                    <td><%= dates.get(i) %></td>
                    <td><%= itemIds.get(i) %></td>
                    <td><%= quantities.get(i) %></td>
                    <td><%= costs.get(i) %></td>
                </tr>
            <% 
                    }
                } else {
            %>
                <tr>
                    <td colspan="5">No orders found</td>
                </tr>
            <% 
                }
            %>
        </tbody>
    </table>
    <a href="home.jsp">Back to Home</a>
</body>
</html>
