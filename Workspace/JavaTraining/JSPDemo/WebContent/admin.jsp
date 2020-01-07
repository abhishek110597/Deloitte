<%@page import="com.CMS.Deloitte.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/tlds/MyCust.tld" prefix="p"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<%="Welcome Admin" %><br/>
<br/>
<br/>
<c:forEach begin="1" end="5" step="1" var="i">
<h1>${i}</h1>
</c:forEach>
<%for(int i=0;i<6;i++){
	%>
<p:name></p:name>
<br/>
<%} %>
<br/>
<p:deladd></p:deladd>
<%-- <%="Customer Detail are "+session.getAttribute("customer")  %>
 --%></body>
</html>