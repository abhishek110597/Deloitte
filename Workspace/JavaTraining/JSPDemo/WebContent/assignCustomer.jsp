<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="com.CMS.Deloitte.model.Customer" id="customer" scope="session"></jsp:useBean>
<jsp:setProperty property="customerId" name="customer" param="customerId"/>
<jsp:setProperty property="customerName" name="customer" param="customerName"/>
<jsp:setProperty property="customerAddress" name="customer" param="customerAddress"/>
<jsp:setProperty property="billAmount" name="customer" param="billAmount"/>
<a href="admin.jsp">Admin</a>
</body>
</html>