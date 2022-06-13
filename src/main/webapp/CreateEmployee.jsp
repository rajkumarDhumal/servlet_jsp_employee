<%@page import="EMPLOYEE_Servlet_JSP_prc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<h3><%=message%></h3>
	<%
	}
	%>
	<form action="createemployee" >
		<table>

			<tr>
				<td>Name:</td>
				<td><input type="text" placeholder="Enter your Name"
					name="name"></td>
			</tr>

			<tr>
				<td>id:</td>
				<td><input type="text" placeholder="Enter your id"
					name="id"></td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="tel" placeholder="Enter your Phone"
					name="pno"></td><%
					%>
			</tr>

			
			<tr>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>