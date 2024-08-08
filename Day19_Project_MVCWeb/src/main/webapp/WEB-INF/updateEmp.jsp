<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="update" method="post">
        Name: <input type="text" name="empName" required><br>
        ID: <input type="text" name="empId" required><br>
       
        Salary: <input type="number" name="empSal" required><br>
        
        <input type="submit" value="Update Employee">
    </form>
</body>
</html>