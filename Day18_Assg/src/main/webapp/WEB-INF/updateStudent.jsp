<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="updateStudent" method="post">
        
       ID: <input type="text" name="id" required><br>
        
        New Email: <input type="email" name="newEmail" required><br>
        <input type="submit" value="Update Student">
    </form>
    <form action="welcome">
  <input type="submit" value="Back" name="Back">
</form>
</body>
</html>