<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.grayMatter.beans.Item" %>s
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View List</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Items List</h1>
    <table border="1">
        <tr>
            <th>Item ID</th>
            <th>Item Name</th>
            <th>Cost</th>
        </tr>
        <% 
            List<Integer> itemIds = (List<Integer>) request.getAttribute("itemIds");
            List<String> itemNames = (List<String>) request.getAttribute("itemNames");
            List<Double> itemCosts = (List<Double>) request.getAttribute("itemCosts");
            
            for (int i = 0; i < itemIds.size(); i++) {
        %>
        <tr>
            <td><%= itemIds.get(i) %></td>
            <td><%= itemNames.get(i) %></td>
            <td><%= itemCosts.get(i) %></td>
        </tr>
        <% } %>
    </table>
    
    <h1>Customers List</h1>
    <table border="1">
        <tr>
            <th>Customer ID</th>
            <th>Name</th>
            <th>Mobile</th>
            <th>Email</th>
            <th>Order Date</th>
        </tr>
        <% 
            List<Integer> customerIds = (List<Integer>) request.getAttribute("customerIds");
            List<String> customerNames = (List<String>) request.getAttribute("customerNames");
            List<String> customerMobiles = (List<String>) request.getAttribute("customerMobiles");
            List<String> customerEmails = (List<String>) request.getAttribute("customerEmails");
            List<String> customerOrderDates = (List<String>) request.getAttribute("customerOrderDates");
            
            for (int i = 0; i < customerIds.size(); i++) {
        %>
        <tr>
            <td><%= customerIds.get(i) %></td>
            <td><%= customerNames.get(i) %></td>
            <td><%= customerMobiles.get(i) %></td>
            <td><%= customerEmails.get(i) %></td>
            <td><%= customerOrderDates.get(i) %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
