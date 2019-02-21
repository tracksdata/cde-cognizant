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
<jsp:include page="usermenu.jsp"/>
<hr/>
<h2 align=center>Products</h2>
<hr/>

<table align="center" cellpadding=5 cellspacing=5 border=1>

<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Price</th>
</tr>

<c:forEach var="product" items="${products}">

<tr>
<td>	<a href="findById?productId=${product.productId}"> ${product.productId}</a></td>
	<td>${product.productName}</td>
	<td>${product.price}</td>
</tr>

</c:forEach>

</table>


</body>
</html>