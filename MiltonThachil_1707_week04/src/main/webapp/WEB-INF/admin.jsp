<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
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
        .container {
            position: relative;
            text-align: center;
            background-color: rgba(255, 255, 255, 0.13);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
            backdrop-filter: blur(10px);
        }
        h1 {
            font-size: 32px;
            font-weight: 600;
            color: #ffffff;
            margin-bottom: 20px;
        }
        .button-container {
            margin-top: 20px;
        }
        .button {
            background-color: #ffffff;
            color: #080710;
            border: none;
            border-radius: 5px;
            padding: 15px 25px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            margin: 5px;
            transition: background-color 0.3s ease;
            text-transform: uppercase;
        }
        .button:hover {
            background-color: #e0e0e0;
        }
        .button:active {
            background-color: #c0c0c0;
        }
        .button-signup {
            background-color: #080710;
            color: #ffffff;
        }
        .button-signup:hover {
            background-color: #1a1a1a;
        }
        .button-signup:active {
            background-color: #333333;
        }
    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="container">
        <h1>Admin</h1>
        <div class="button-container">
            <form action="VC" method="post" style="display:inline;">
                <button class="button">View Customers</button> 
            </form>
            <form action="AC" method="post" style="display:inline;">
                <button class="button">Add Customers</button> 
            </form>
            <form action="UC" method="post" style="display:inline;">
                <button class="button">Update Customers</button> 
            </form>
            <form action="DC" method="post" style="display:inline;">
                <button type="submit" class="button">Delete Customer</button>
            </form>
            <form action="UO" method="post" style="display:inline;">
                <button class="button">Update Orders</button> 
            </form>
            <form action="DO" method="post" style="display:inline;">
                <button class="button">Delete Orders</button> 
            </form>
            <form action="VO" method="post" style="display:inline;">
                <button class="button">View Orders</button> 
            </form>
        </div>
    </div>
</body>
</html>
