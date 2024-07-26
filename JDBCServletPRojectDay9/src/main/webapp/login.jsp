<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label for="uname">Username:</label>
        <input type="text" name="uname" required><br><br>
        
        <label for="upswrd">Password:</label>
        <input type="password" name="upswrd" required><br><br>
        
        <input type="submit" value="Login">
    </form>
</body>
</html>
