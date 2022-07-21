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
	<h1>Lead | Form</h1>
	
	<form action="createLead" method="post">
	<table>
			<tr>
				<td>First Name :</td>
				<td> <input type="text" name="firstName"> </td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName"> </td>
			</tr>
			<tr>
				<td> Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td> <input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Lead Source :</td>
				<td>
					<select name="leadSource">
						<option value="Radio">Radio</option>
						<option value="Tv">Television</option>
						<option value="News Paper">News Paper</option>
						<option value="Trade Show">Trade Show</option>
					</select>
				</td>
			</tr>
		</table>
		Gender : 
		<input type="radio" name="gender" value="Male">Male 
		<input type="radio" name="gender" value="Female">Female 
		<input type="radio" name="gender" value="Other">Other
		
		<br><input type="submit" value="Submit">
	</form>
	
	${save}
</body>
</html>