<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing | details</title>
</head>
<body>
	<h2>Billing | Details</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name </th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Product Name</th>
			<th>Product Price </th>
		</tr>
		<c:forEach items="${billings}" var="billing">
		<tr>
			<td>${billing.firstName}</td>
			<td>${billing.lastName}</td>
			<td>${billing.mobile}</td>
			<td>${billing.email}</td>
			<td>${billing.productName}</td>
			<td>${billing.productPrice}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>