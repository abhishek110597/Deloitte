<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Color Assign</title>
</head>
<body>
<%@include file="Demo.jsp" %><%--Static--%>
<jsp:include page="Demo.jsp"></jsp:include>
<% 
String userName=request.getParameter("name");
String color[]=request.getParameterValues("color");

if(color==null){
	out.println("Select a color");
}else{
for(int i=0;i<color.length;i++){
	out.println("<h1 style= color:"+color[i]+">Hello "+userName+"</h1>");
	//out.println("<h1>"+userName+"</h1>");
}
}
%>
</body>
</html>