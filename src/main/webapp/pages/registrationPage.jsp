<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body align="center">
<h3 style="color: navy;">Employee Form Registration</h3>
<br>
	<form:form action="store" method="POST" modelAttribute="emp">
		<table align="center">
			<tr>
				<td>Employee Id</td>
				<td><form:input path="empId" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>DOB</td>
				<!--  <td><input type="date" name="dob" placeholder="DD/MM/YYYY" ></td>-->
				<td><form:input path="dob" placeholder="DD/MM/YYYY" /></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><form:input path="designation" /></td>
			</tr>
		</table>
		<br> 
	<h3 style="color: navy;">	Present Address</h3>
	<br>
		<table align="center">
			<tr>
				<td>Address Line1</td>
				<td><form:input path="psAddressLine1" /></td>
			</tr>
			<tr>
				<td>Address Line2</td>
				<td><form:input path="psAddressLine2" /></td>
			</tr>

			<tr>
				<td>City</td>
				<td><form:input path="psCity" /></td>
			</tr>

			<tr>
				<td>Pin</td>
				<td><form:input path="psPin" /></td>
			</tr>

			<tr>
				<td>State</td>
				<td><form:input path="psState" /></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><form:input path="psCountry" /></td>
			</tr>
		</table>
			<br>
			<h3 style="color: navy;">Permanent Address</h3>
			<br>
			<table align="center">
			<tr>
				<td>Address Line1</td>
				<td><form:input path="pmAddressLine1" /></td>
			</tr>

			<tr>
				<td>Address Line2</td>
				<td><form:input path="pmAddressLine2" /></td>
			</tr>

			<tr>
				<td>City</td>
				<td><form:input path="pmCity" /></td>
			</tr>

			<tr>
				<td>Pin</td>
				<td><form:input path="pmPin" /></td>
			</tr>

			<tr>
				<td>State</td>
				<td><form:input path="pmState" /></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><form:input path="pmCountry" /></td>
			</tr>
		</table>
			<br>
		<h3 style="color: navy;">	Office Address</h3>
		<br>
		<table align="center">
			<tr>
				<td>Address Line1</td>
				<td><form:input path="ofAddressLine1" /></td>
			</tr>

			<tr>
				<td>Address Line2</td>
				<td><form:input path="ofAddressLine2" /></td>
			</tr>

			<tr>
				<td>City</td>
				<td><form:input path="ofCity" /></td>
			</tr>

			<tr>
				<td>Pin</td>
				<td><form:input path="ofPin" /></td>
			</tr>

			<tr>
				<td>State</td>
				<td><form:input path="ofState" /></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><form:input path="ofCountry" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="register">
	</form:form>
	<a href="home">home</a>
</body>
</html>