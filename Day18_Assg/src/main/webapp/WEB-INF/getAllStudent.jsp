<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
</head>
<body>
    <h1>All Students</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>ID</th>
               
                <th>Age</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${StudentList}">
                <tr>
                    <td><c:out value="${student.name}"/></td>
                    <td><c:out value="${student.id}"/></td>
                    
                    <td><c:out value="${student.age}"/></td>
                    <td><c:out value="${student.email}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
