<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Form</title>
</head>
<body>
	<form action="saveBill" method="post"><h1>Billing | Form</h1>
		<strong>First Name: </strong><input type="text" name="firstName" value="${contact.getFirstName()}"><br>
		<strong>Last Name: </strong><input type="text" name="lastName" value="${contact.getLastName()}" ><br>
		<strong>Mobile: </strong><input type="text" name="mobile" value= "${contact.getMobile()}"> <br>
		<strong>Email: </strong><input type="text" name="email" value="${contact.getEmail()}"><br>
		<strong>Product Name :</strong><input type="text" name="productName"> <br>
		<strong>Product Price :</strong><input type="text" name="productPrice"> <br>
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>