<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instruction</title>
</head>
<body>
<%
String name=(String)session.getAttribute("name");
%>
<h1><%="Welcome "+name %></h1>
<%="Instructions are as follows:" %><br/>
<%="Just don't copy" %>
<br/>
<br/>
<br/>
<br/>
<a href="question1.html">Start Test</a>
</body>
</html>