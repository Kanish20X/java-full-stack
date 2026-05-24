<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Failed</title>
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
            color: #c0392b;
        }
        p {
            color: #7f8c8d;
            font-size: 18px;
        }
        .btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #e74c3c;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .btn:hover {
            background-color: #c0392b;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Registration Failed</h1>
    <p>Something went wrong or the user name might already be taken.</p>
    <a href="index.html" class="btn">Try Again</a>
</div>

</body>
</html>
