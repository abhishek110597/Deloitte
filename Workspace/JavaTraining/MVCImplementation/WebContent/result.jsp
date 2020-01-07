<%@page import="com.CMS.Deloitte.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<% 
Customer customer=new Customer();
customer=(Customer)session.getAttribute("custDetails");
%>
<%="Customer Details are" %><br/>
<%
out.println("Customer Id = "+customer.getCustomerId()+"<br/>");
out.println("Customer Name = "+customer.getCustomerName()+"<br/>");
out.println("Customer Address = "+customer.getCustomerAddress()+"<br/>");
out.println("Customer Bill Amount = "+customer.getBillAmount()+"<br/>");
%>
</body>
</html>