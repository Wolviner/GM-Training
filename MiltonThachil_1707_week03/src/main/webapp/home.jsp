<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("username") %></h1>
    
    <form action="RoleServlet" method="post">
        <h2>Select Your Role</h2>
        <label>
            <input type="radio" name="role" value="admin" required> Admin
        </label>
        <label>
            <input type="radio" name="role" value="customer" required> Customer
        </label>
        <input type="submit" value="Submit">
    </form>

    <h2>Manage Your Account</h2>
    
    <a href="LogoutServlet">Logout</a>
</body>
</html>
