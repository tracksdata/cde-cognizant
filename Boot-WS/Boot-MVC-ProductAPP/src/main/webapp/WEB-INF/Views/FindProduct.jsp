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
<hr/>
<form action="findById" method="post">

<table>

<tr>
<td>Product Id</td>
<td><input name="productId"/></td>

</tr>

<tr>
<th colspan="2">
${msg}
</th>
</tr>
<tr>
<th colspan="2">
<button type="submit">Find</button>
</th>
</tr>



</table>


</form>

</body>
</html>