<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance page </title>
</head>
<body>
<%
	session = request.getSession();
	
	out.println("Your Balance is :"+session.getAttribute("bal"));
%>

</body>
</html>