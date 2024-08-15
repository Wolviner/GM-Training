<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Order</title>
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
            width: 90%;
            max-width: 500px;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
            text-align: center;
        }
        h1 {
            margin-bottom: 20px;
            color: #ffffff;
        }
        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
            align-items: center;
        }
        label {
            font-size: 16px;
            font-weight: 500;
        }
        input[type="text"] {
            width: 100%;
            height: 40px;
            background-color: rgba(255, 255, 255, 0.07);
            border: none;
            border-radius: 5px;
            padding: 0 10px;
            font-size: 14px;
            color: #ffffff;
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
        <h1>Delete Order</h1>
        <form action="deleteOrder" method="post">
            <label for="orderId">Order ID:</label>
            <input type="text" id="orderId" name="orderId" required>
            
            <label for="customerId">Customer ID:</label>
            <input type="text" id="customerId" name="customerId" required>
            
            <input type="submit" value="Delete Order">
        </form>
    </div>
</body>
</html>
