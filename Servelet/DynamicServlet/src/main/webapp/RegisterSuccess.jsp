<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard Jsp page</title>
</head>
<body style="text-align:center; background-color:black; color:white; margin-top:15%;">

<%-- 1. Declaration tag is for Java variables/methods only --%>
<%! int a = 20; %>

<%@ page import="java.util.Date" %>

<%
    // 2. Extract parameters
    String user_name = request.getParameter("uname");
    String user_email = request.getParameter("uemail");
    String password = request.getParameter("upass");
    String city = request.getParameter("ucity");

    // 3. Initialize the date variable so it can be used below
    Date date = new Date();

    out.println("<h1> Hello " + user_name + " Registration successful! </h1>");
%>
import java.io.PrintWriter;
<%-- 4. Expression tags for displaying variables --%>
<h1>Current Date: <%= date %></h1>
<h2>City: <%= city %></h2>

</body>
</html>
