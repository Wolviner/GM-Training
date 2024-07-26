<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup Page</title>
</head>
<body>
    <h2>Signup Form</h2>
    <form action="SignUpServlet" method="post">
        <label for="uname">UserName:</label>
        <input type="text" name="uname" required><br><br>
        
        <label for="uid">User ID:</label>
        <input type="text" name="uid" required><br><br>
        
        <label for="mailid">Email:</label>
        <input type="email" name="mailid" required><br><br>
        
        <label for="upswrd">Password:</label>
        <input type="password" name="upswrd" required><br><br>
        
        <label for="mobile_num">Mobile Number:</label>
        <input type="text" name="mobile_num" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
