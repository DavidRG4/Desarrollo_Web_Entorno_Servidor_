<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<input type="submit" value="AñadirEmpleado" />
</form>
	<table>
		<tr>
			<th>Numero</th>
			<th>Apellidos</th>
			<th>Nombre</th>
			<th>Puesto</th>
			<th>Oficina</th>
			<th>Jefe</th>
		</tr>
		<c:forEach items="${empleados }" var="e">
			<tr>
				<td>${e.employeeNumber }</td>
				<td>${e.lastName }</td>
				<td>${e.firsName }</td>
				<td>${e.jobTitle}</td>
				<td>${e.officeCode }</td>
				<td>${e.reportsTo}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>