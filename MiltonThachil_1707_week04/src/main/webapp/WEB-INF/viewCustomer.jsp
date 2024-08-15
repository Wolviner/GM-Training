<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Customers</title>
    <style>
        *,
        *:before,
        *:after {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Poppins', sans-serif;
            background-color: #080710;
            color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            width: 80%;
            max-width: 1000px;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ffffff;
            color: #ffffff;
        }
        th {
            background-color: rgba(255, 255, 255, 0.2);
        }
        tr:nth-child(even) {
            background-color: rgba(255, 255, 255, 0.1);
        }
        tr:hover {
            background-color: rgba(255, 255, 255, 0.2);
        }
        form {
            margin-top: 20px;
        }
        input[type="submit"] {
            background-color: #ffffff;
            color: #080710;
            padding: 10px 20px;
            font-size: 16px;
            font-weight: 600;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #e0e0e0;
        }
        input[type="submit"]:active {
            background-color: #c0c0c0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Customer List</h1>
        <table>
            <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cus" items="${cus}">
                    <tr>
                        <td><c:out value="${cus.id}"/></td>
                        <td><c:out value="${cus.name}"/></td>
                        <td><c:out value="${cus.email}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <form action="back">
            <input type="submit" value="Back">
        </form>
    </div>
</body>
</html>
