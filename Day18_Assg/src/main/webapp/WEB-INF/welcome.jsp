<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome,${name}</h1>
<form action="addSt" method="get">
  <input type="submit" value="Add Student" name="addStudent">
</form>
<form action="getAS">
  <input type="submit" value="Get All Student Details" name="getAllStudent">
</form>
<form action="GSI">
  <input type="submit" value="Get Student Details By ID" name="getStudentID">
</form>
<form action="US">
  <input type="submit" value="Update Student Details" name="updatestudent">
</form>
<form action="DS">
  <input type="submit" value="Delete Student Details" name="deletestudent">
</form>
</body>
</html>