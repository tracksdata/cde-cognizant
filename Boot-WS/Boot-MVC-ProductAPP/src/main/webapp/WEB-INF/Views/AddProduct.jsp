<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="usermenu.jsp"/>
	<form action="saveProduct" method="post">

		<table align="center">

			<tr>
				<td>Product Id</td>
				<td><input name="productId" />
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input name="productName" />
			</tr>

			<tr>
				<td>Price</td>
				<td><input name="price" type="number" />
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