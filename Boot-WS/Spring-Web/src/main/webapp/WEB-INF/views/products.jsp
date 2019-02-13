<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<table border=1>

<tr>
	<th>Id</th>
	<th>Name</th>
	<th>price</th>
	
</tr>

<c:forEach var="prod" items="${products}">

<tr>

<td>${prod.prodId}</td>
<td>${prod.prodName}</td>
<td>${prod.price}</td>
</tr>


</c:forEach>




</table>

</body>
</html>