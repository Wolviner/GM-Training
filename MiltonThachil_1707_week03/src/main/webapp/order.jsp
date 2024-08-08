<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.grayMatter.beans.Item" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Items</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Order Items</h1>
    <form action="PlaceOrderServlet" method="post">
        <table border="1">
            <thead>
                <tr>
                    <th>Select</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>Quantity</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    List<Item> items = (List<Item>) request.getAttribute("items");
                    if (items != null) {
                        for (Item item : items) {
                %>
                <tr>
                    <td><input type="checkbox" name="selectedItems" value="<%= item.getId() %>"></td>
                    <td><%= item.getId() %></td>
                    <td><%= item.getName() %></td>
                    <td><%= item.getCost() %></td>
                    <td>
                        <input type="number" name="quantity_<%= item.getId() %>" min="1" value="1">
                    </td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5">No items available</td>
                </tr>
                <% 
                    }
                %>
            </tbody>
        </table>
        <input type="submit" value="Place Order">
    </form>
    <a href="home.jsp">Back to Home</a>
</body>
</html>
