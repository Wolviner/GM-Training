<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Place Order</title>
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
            overflow: hidden;
        }
        .container {
            position: relative;
            width: 90%;
            max-width: 500px;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
            text-align: center;
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
        input[type="text"], input[type="submit"] {
            width: 100%;
            height: 40px;
            border-radius: 5px;
            padding: 0 10px;
            font-size: 14px;
            color: #080710;
        }
        input[type="text"] {
            background-color: rgba(255, 255, 255, 0.07);
            border: none;
        }
        input[type="submit"] {
            background-color: #ffffff;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        input[type="submit"]:active {
            background-color: #004494;
        }
    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="container">
        <h1>Place Order</h1>
        <form action="placeOrder" method="post">
            <label for="orderId">Order ID:</label>
            <input type="text" id="orderId" name="orderId" required>

            <input type="hidden" name="id" value="${id}">

            <label for="Date12">Order Date:</label>
            <input type="text" id="Date12" name="Date12" required>

            <label for="Total">Total Order Amount:</label>
            <input type="text" id="Total" name="Total" required>

            <input type="submit" value="Place Order">
        </form>
    </div>
</body>
</html>
