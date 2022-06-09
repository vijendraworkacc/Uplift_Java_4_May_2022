<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
	<%
		String username = (String) request.getAttribute("username");
	%>
	<h1>Hi <%=username%>,</h1>
	<h1>Hi ${username},</h1>
	<h1>Welcome to this application!</h1>
</body>
</html>