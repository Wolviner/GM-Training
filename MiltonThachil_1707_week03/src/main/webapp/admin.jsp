<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Admin Dashboard</h1>

    <!-- Add Item Form -->
    <h2>Add Item</h2>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="addItem">
        <label for="itemName">Item Name:</label>
        <input type="text" id="itemName" name="name" required>
        <label for="itemCost">Item Cost:</label>
        <input type="number" id="itemCost" name="cost" step="0.01" required>
        <input type="submit" value="Add Item">
    </form>

    <!-- Remove Item Form -->
    <h2>Remove Item</h2>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="removeItem">
        <label for="itemId">Item ID:</label>
        <input type="number" id="itemId" name="itemId" required>
        <input type="submit" value="Remove Item">
    </form>

    
    <h2>Add Customer</h2>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="addCustomer">
        <label for="customerName">Name:</label>
        <input type="text" id="customerName" name="name" required>
        <label for="customerEmail">Email:</label>
        <input type="email" id="customerEmail" name="email" required>
        <label for="customerPassword">Password:</label>
        <input type="password" id="customerPassword" name="password" required>
        <label for="customerMobile">Mobile:</label>
        <input type="text" id="customerMobile" name="mobile">
        <input type="submit" value="Add Customer">
    </form>

    <!-- Remove Customer Form -->
    <h2>Remove Customer</h2>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="removeCustomer">
        <label for="customerEmailRemove">Customer Email:</label>
        <input type="email" id="customerEmailRemove" name="email" required>
        <input type="submit" value="Remove Customer">
    </form>

    <a href="home.jsp">Back to Home</a>
</body>
</html>
