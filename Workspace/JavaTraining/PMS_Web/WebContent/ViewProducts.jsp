<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.pms.dao.ProductDAO, com.pms.dao.impl.ProductDAOImpl, com.pms.deloitte.model.Product ,java.util.List,java.util.Iterator"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>
<div align="center">
<form>
<table border solid cellpadding="10" cellspacing="10">
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>QOH</th>
<%
ProductDAO productDAO=new ProductDAOImpl();
List<Product> allProducts=productDAO.listProducts();
Iterator itr = allProducts.iterator();
for(Product p:allProducts){
	out.println("<tr>");
	out.println("<td>"+p.getProductId()+"</td>");
	out.println("<td>"+p.getProductName()+"</td>");
	out.println("<td>"+p.getPrice()+"</td>");
	out.println("<td>"+p.getQoh()+"</td>");
	out.println("</tr>");
}
%>
</table>
</form>
</div>
</body>
</html>