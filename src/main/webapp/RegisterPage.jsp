<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2016.11.20.
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>

<form action="userRegistration" method="post">
    <input type="text" placeholder="Login" name="user_login"><br>
    <input type="password" placeholder="Password" name="user_password"><br>
    <input type="text" placeholder="First Name" name="user_firstname"> <br>
    <input type="text" placeholder="LastName" name="user_lastname"><br>
    <input type="email" placeholder="Email"  name="user_email"><br>
    <input type="submit" value="Register">
</form>
</body>
</html>
