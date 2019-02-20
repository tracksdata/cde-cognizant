<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"/>
	<form action="registerUser" method="post">

		<table>

			<tr>
				<td>First Name</td>
				<td><input name="firstName" />
			</tr>

			<tr>
				<td>Last Name</td>
				<td><input name="lastName" />
			</tr>

			<tr>
				<td>User Id</td>
				<td><input name="userId" />
			</tr>

			<tr>
				<td>Password</td>
				<td><input name="password" type="password" />
			</tr>

			<tr>
				<td>Mobile Number</td>
				<td><input name="mobileNumber" />
			</tr>

			<tr>
				<th colspan="2">${msg}</th>
			</tr>

			<tr>
				<th colspan="2">
					<button type="submit">Register</button>
					<button type="reset">Clear</button>
				</th>
			</tr>

		</table>

	</form>

	<hr />
</body>
</html>