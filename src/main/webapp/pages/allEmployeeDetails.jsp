<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee Details</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty data}">
       <h2>Employee details</h2>
        <table>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Date Of Birth</th>
					<th>Designation</th>
					<th>Present Address</th>
					<th>Premanent Address</th>
					<th>Office Address</th>
					<th>action</th>
					
				</tr>
				<c:forEach var="employee" items="${data}">
					<tr>
						<td><c:out value="${employee.empId}" /></td>
						<td><c:out value="${employee.firstName}" /></td>
						<td><c:out value="${employee.lastName}" /></td>
						<td><c:out value="${employee.dob}" /></td>
						<td><c:out value="${employee.designation}" /></td>
						<td><a href="getPsAdd">Get Present Address</a></td>	
						<td><a href="getPrAdd">Get Premanent Address</a></td>	
						<td><a href="getOffAdd">Get Office Address</a></td>
						<td><a href="deleteData?sno=${employee.empId}" onclick="checkOnce(${employee.empId})">Delete</a></td>	
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h1>Record Not Found</h1>
		</c:otherwise>
	</c:choose>
	<a href="home">home</a>
</body>
</html>