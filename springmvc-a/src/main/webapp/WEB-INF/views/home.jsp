<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home!</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
	int age = (int) request.getAttribute("age");
	String phoneNumber = (String) request.getAttribute("phone_number");
	%>
	<h1>
		<%=name%></h1>
	<h3>
		<%=age%>
	</h3>
	<h3><%=phoneNumber%></h3>
	<h1>Welcome to home page!</h1>
</body>
</html>