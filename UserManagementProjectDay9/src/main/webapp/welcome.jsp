<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("uname") %>!</h2>
    <p>It's good to see you.</p>
</body>
</html>
