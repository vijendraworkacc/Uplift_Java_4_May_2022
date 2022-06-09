<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		String email = (String) request.getAttribute("email");
		int age = (int) request.getAttribute("age");
	%>
	<h1>Welcome to this application!</h1>
	<h2>
		<%=name%>
	</h2>
	<h2>
		<%=email%>
	</h2>
	<h2>
		<%=age%>
	</h2>
</body>
</html>