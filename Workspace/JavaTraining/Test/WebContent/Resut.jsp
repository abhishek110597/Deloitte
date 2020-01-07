<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank You</title>
</head>
<body>
<%
String name=(String)session.getAttribute("name");
String selectedAnswer1=(String)session.getAttribute("selectedAnswer1");
String selectedAnswer2=(String)session.getAttribute("selectedAnswer2");
String selectedAnswer3=(String)session.getAttribute("selectedAnswer3");
%>
<%-- <%=selectedAnswer1 %><br/>
<%=selectedAnswer2 %><br/>
<%=selectedAnswer3 %><br/> --%>
<h2 style="color:blue;"><%=name+" , Thank you for answering" %></h2><br/>
<hr/>
 <%! public int verify(String correct , String ans){
    	if(correct.equals(ans))
    		return 10;
    	return 0;
    }
 %>
 
 <% 
int marks1=verify(selectedAnswer1,"A");
int marks2=verify(selectedAnswer2,"B");
int marks3=verify(selectedAnswer3,"C");
int total=marks1+marks2+marks3;
%>
<div align="center">
<table cellspacing="10" cellpadding="10" border solid><tr>
<td><%="Your Answer" %></td>
<td><%="Correct Answer" %></td>
<td><%="Marks" %></td>
</tr>
<tr>
<td><%=selectedAnswer1 %></td>
<td><%="A" %></td>
<td><%=marks1 %></td>
</tr>
<tr>
<td><%=selectedAnswer2 %></td>
<td><%="B" %></td>
<td><%=marks2%></td>
</tr>
<tr>
<td><%=selectedAnswer3 %></td>
<td><%="C" %></td>
<td><%=marks3 %></td>
</tr>
</table>
<br/>
<h1 style="color:green;">Total Score :<%=total %></h1>
</div>
</body>
</html>