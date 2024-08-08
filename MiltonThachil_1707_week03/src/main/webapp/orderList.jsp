<%@ page import="java.util.List" %>
<%@ page import="java.text.DecimalFormat" %>

<%
    List<Integer> orderIds = (List<Integer>) request.getAttribute("orderIds");
    List<String> dates = (List<String>) request.getAttribute("dates");
    List<Integer> itemIds = (List<Integer>) request.getAttribute("itemIds");
    List<String> itemNames = (List<String>) request.getAttribute("itemNames");
    List<Double> itemCosts = (List<Double>) request.getAttribute("itemCosts");
    List<Double> totalCosts = (List<Double>) request.getAttribute("totalCosts");
    Integer quantity = (Integer) request.getAttribute("quantities");  // Static quantity

    DecimalFormat df = new DecimalFormat("#.##");

    // Ensure that all lists have the same size
    int size = orderIds != null ? orderIds.size() : 0;
%>

<html>
<head>
    <title>Order List</title>
</head>
<body>
    <h1>Order List</h1>
    <table border="1">
        <tr>
            <th>Order ID</th>
            <th>Date</th>
            <th>Item ID</th>
            <th>Item Name</th>
            <th>Quantity</th>
            <th>Cost</th>
            <th>Total Cost</th>
        </tr>
        <% for (int i = 0; i < size; i++) { %>
            <tr>
                <td><%= orderIds.get(i) %></td>
                <td><%= dates.get(i) %></td>
                <td><%= itemIds.get(i) %></td>
                <td><%= itemNames.get(i) %></td>
                <td><%= quantity %></td>  <!-- Display static quantity -->
                <td><%= df.format(itemCosts.get(i)) %></td>
                <td><%= df.format(totalCosts.get(i)) %></td>
            </tr>
        <% } %>
    </table>

    <form action="placeOrder" method="post">
        <input type="submit" value="Place Order" />
    </form>
</body>
</html>
