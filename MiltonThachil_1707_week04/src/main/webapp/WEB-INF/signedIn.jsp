<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Placed</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background-color: #080710;
            color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            position: relative;
        }

        .container {
            text-align: center;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
            position: relative;
            z-index: 1;
        }

        .background {
            position: absolute;
            width: 100%;
            height: 100%;
            top: 0;
            left: 0;
            pointer-events: none;
        }

        .shape {
            position: absolute;
            border-radius: 50%;
            z-index: -1;
        }

        .shape:first-child {
            width: 200px;
            height: 200px;
            background: linear-gradient(135deg, #1845ad, #23a2f6);
            left: -100px;
            top: -100px;
        }

        .shape:last-child {
            width: 200px;
            height: 200px;
            background: linear-gradient(135deg, #ff512f, #f09819);
            right: -100px;
            bottom: -100px;
        }

        h1 {
            color: #ffffff;
            margin-bottom: 20px;
        }

        .button-container {
            margin-top: 20px;
        }

        .button {
            background-color:#ffffff;
            color: #080710;
            border: none;
            border-radius: 4px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            margin: 5px;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color: #0056b3;
        }

        .button:active {
            background-color: #004494;
        }

        .button-back {
            background-color: #28a745;
        }

        .button-back:hover {
            background-color: #218838;
        }

        .button-back:active {
            background-color: #1e7e34;
        }
    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="container">
        <h1>Signed Up</h1>
        <p>Your have signed in successfully!</p>
        
        </div>
    </div>
</body>
</html>
	