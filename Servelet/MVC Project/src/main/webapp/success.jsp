<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>
    <style>
        body {
            background-color: #f4f7f6;
            font-family: Arial, sans-serif;
            text-align: center;
            padding-top: 15%;
        }
        .container {
            background-color: white;
            padding: 30px;
            display: inline-block;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        h1 {
            color: #2c3e50;
        }
        p {
            color: #7f8c8d;
            font-size: 18px;
        }
        .btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .btn:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>

<%
String name = (String) session.getAttribute("name");
if (name == null) {
name = "User";
}
%>

<div class="container">
    <h1>Registration Successful!</h1>
    <p>Hello <b><%= name %></b>, you have successfully registered to this webapp.</p>
    <!-- Changed link to go to your home/login page instead of a dashboard -->
    <a href="index.jsp" class="btn">Proceed to Login</a>
</div>

</body>
</html>
