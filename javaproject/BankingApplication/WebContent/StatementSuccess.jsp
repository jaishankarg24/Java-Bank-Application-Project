<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Statement Success Page</title>
</head>
<body>
<%  
	session = request.getSession();
	out.println("Send By           :"     +session.getAttribute("sal"));
	out.println("<br>");
	out.println("Transfered to     :"     +session.getAttribute("ral"));
	out.println("<br>");
	out.println("Amount transfered :"      +session.getAttribute("al"));
	out.println("<br>");
%>

</body>
</html>