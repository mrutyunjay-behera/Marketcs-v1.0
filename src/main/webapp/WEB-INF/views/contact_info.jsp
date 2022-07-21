<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Contact | info</h1>
	First Name : ${contact.firstName} <br>
	Last Name : ${contact.lastName} <br>
	Mobile : ${contact.mobile} <br>
	Email : ${contact.email} <br>
	Lead Source : ${contact.leadSource} <br>
	Gender : ${contact.gender} <br>
</body>
</html>