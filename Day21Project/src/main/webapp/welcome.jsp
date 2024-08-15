<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<form action="employee">
<input type="submit" value="get all emps" >
</form>
 <c:forEach items="${empList}" var="emp">
 ${emp.empId}&nbsp;&nbsp;&nbsp;${emp.employee}&nbsp;&nbsp;&nbsp;${emp.empSal}&nbsp;&nbsp;&nbsp;
 </c:forEach>
 
</body>
</html>