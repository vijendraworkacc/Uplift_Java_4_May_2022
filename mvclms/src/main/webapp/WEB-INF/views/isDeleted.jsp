<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee is deleted!</title>
</head>
<body>
	<%
		int employeeId = (int) request.getAttribute("employeeId");
	boolean isDeleted = (boolean) request.getAttribute("isDeleted");
	%>
	<h1>
		Employee at id
		<%=employeeId%>
		is deleted?
		<%=isDeleted%>
	</h1>
</body>
</html>