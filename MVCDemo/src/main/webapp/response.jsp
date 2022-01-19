<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body>

<h2> Login Status:
<% boolean status=(Boolean) request.getAttribute("status");
if(status){
%> <font color="green"> <%=status%></font> 
<br>
<h1>Welcome: ${username} </h1>

<% 	
} else {
	%> <font color="red"> <%=status%></font> 
	<br>
	<a href="login.html">Click here </a> to Login again !!!
<%
}
%>
</h2>
</body>
</html>