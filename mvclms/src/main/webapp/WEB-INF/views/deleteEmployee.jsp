<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete employee by employee id!</h1>
	<div style="width: 300px;">
		<fieldset>
			<form action="delete" method="POST">
				<table>
					<tr>
						<td><input type="number" placeholder="Enter employee id: " name="employeeId"></td>
					</tr>
					<tr>
						<td><button type="submit">SUBMIT</button></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div>
</body>
</html>