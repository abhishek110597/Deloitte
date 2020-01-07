<%@page import="com.Sum"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>JSP Demo</title>
</head>

<body>
    <%! int num1 = 200; %>

    <% String name = "Tufail";
        int num2 = 100;
   Sum sum=new Sum();
   int s=sum.addNumbers(num1, num2);
        %>
        <%="Sum="+s %>
    <h1>Deloitte welcomes you </h1>

    Printed via scriplet : <% out.println("Welcome "+name);%> <br>
    Printed via expression : <%= "Welcome "+name %> <br>

    Sum of num1 and num2 : <%= num1 + num2 %> <br>

    <%! int p; %>
    <%=new Date() %>

</body>

</html>