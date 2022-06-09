<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register!</title>
</head>
<body>
	<h1>Registration form!</h1>
	<div style="width: 300px;">
		<fieldset>
			<form action="register2" method="POST">
				<table>
					<tr>
						<td><input type="text" placeholder="Enter name: " name="name"></td>
					</tr>
					<tr>
						<td><input type="email" placeholder="Enter email: " name="email"></td>
					</tr>
					<tr>
						<td><input type="number" placeholder="Enter age: " name="age"></td>
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