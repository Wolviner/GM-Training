<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <h1>Sign Up</h1>
    <form action="SignupServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <label for="mobile">Mobile:</label>
        <input type="text" id="mobile" name="mobile" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <input type="submit" value="Sign Up">
    </form>
    <a href="Welcome.jsp">Back to Home</a>
</body>
</html>
