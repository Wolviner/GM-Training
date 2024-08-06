<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to QuickDelivery</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            color: #212529;
            text-align: center;
            padding: 50px;
        }
        .container {
            background: white;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 600px;
            margin: auto;
        }
        h1 {
            color: #007bff;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            color: white;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            text-decoration: none;
        }
        .btn-secondary {
            background-color: #6c757d;
        }
    </style>
</head>
<body>
    <div class="container"> 
        <h1>Welcome to GoFoodie Food Delivery Services</h1>
        <p>Dear Customer,</p>
        <p>You can now enjoy our services.</p>
        <a href="Login.jsp" class="btn">Login</a>
        <a href="signup.jsp" class="btn btn-secondary">Sign Up</a>
    </div>
</body>
</html>