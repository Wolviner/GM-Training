<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome, ${name}</h1>

<form action="display" method="get">
  <input type="submit" value="Get All Employee Details" name="getempdets">
</form>
<form action="UP" method="get">
  <input type="submit" value="Update Employee Details" name="updateemp">
</form>
<form action="DE" method="get">
  <input type="submit" value="Delete Employee Details" name="deleteemp">
</form>
<form action="GEI" method="get">
  <input type="submit" value="Get Employee Details By Id" name="getbyid">
</form>
<form action="AE" method="get">
  <input type="submit" value="Add Employee" name="addEmployee">
</form>
</body>
</html>