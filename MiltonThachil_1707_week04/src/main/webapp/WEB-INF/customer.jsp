<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Actions</title>
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
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #ffffff;
        }
        .background {
            width: 430px;
            height: 520px;
            position: absolute;
            transform: translate(-50%, -50%);
            left: 50%;
            top: 50%;
        }
        .background .shape {
            height: 200px;
            width: 200px;
            position: absolute;
            border-radius: 50%;
        }
        .shape:first-child {
            background: linear-gradient(#1845ad, #23a2f6);
            left: -80px;
            top: -80px;
        }
        .shape:last-child {
            background: linear-gradient(to right, #ff512f, #f09819);
            right: -30px;
            bottom: -80px;
        }
        .form-container {
            position: relative;
            text-align: center;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
            width: 400px;
        }
        h1 {
            font-size: 24px;
            font-weight: 600;
            color: #ffffff;
            margin-bottom: 20px;
        }
        form {
            margin: 10px 0;
        }
        input[type="submit"] {
            background-color: #ffffff;
            color: #080710;
            padding: 15px;
            font-size: 16px;
            font-weight: 600;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            width: 100%;
            margin-bottom: 10px;
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
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="form-container">
        <h1>Customer Actions</h1>
        <form action="OR" method="post">
            <input type="hidden" name="id" value="${cus.id}">
            <input type="submit" value="View Orders" name="vieword" required>
        </form>
        <form action="VPD" method="post">
            <input type="hidden" name="id" value="${cus.id}">
            <input type="submit" value="View Personal Details" name="viewPDetails" required>
        </form>
        <form action="CNO" method="post">
        <input type="hidden" name="id" value="${cus.id}">
            <input type="submit" value="Create New Order" name="neword" required>
        </form>
        <form action="UO1" method="post">
        <input type="hidden" name="id" value="${cus.id}">
            <input type="submit" value="Update Order" name="updord" required>
        </form>
    </div>
</body>
</html>
