<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h1>Add Student</h1>
    <form action="addStudent" method="post">
        Name: <input type="text" name="name" required><br>
        ID: <input type="text" name="id" required><br>
        Password: <input type="password" name="pwd" required><br>
        Age: <input type="number" name="age" required><br>
        Email: <input type="email" name="email" required><br>
        <input type="submit" value="Add Student">
    </form>
    <form action="welcome">
  <input type="submit" value="Back" name="Back">
</form>
</body>
</html>
