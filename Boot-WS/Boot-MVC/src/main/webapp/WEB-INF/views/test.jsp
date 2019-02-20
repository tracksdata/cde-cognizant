<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/bootstrap.css" rel="stylesheet" type="text/css">

</head>
<body class="container mt-3">

<div class="alert alert-info"><h1>My Cities</h1></div>

<c:forEach var="cityName" items="${myCities}">

<div class="card">
	<div class="card-header bg-primary">${cityName }</div>
</div>

<div class="card-body">
Information about City
</div>

</c:forEach>




</body>
</html>