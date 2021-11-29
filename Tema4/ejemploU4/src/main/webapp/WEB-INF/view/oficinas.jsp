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
	<table>
		<thead>
			<tr>
				<th>Codigo Oficina</th>
				<th>ciudad</th>
				<th>telefono</th>
				<th>Primera direccion</th>
				<th>Segunda direccion</th>
				<th>estado</th>
				<th>pais</th>
				<th>codigo postal</th>
				<th>territorio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${oficinas}" var="of">
				<tr>
					<td>${of.officeCode}</td>
					<td>${of.city}</td>
					<td>${of.phone}</td>
					<td>${of.addressLine1}</td>
					<td>${of.addressLine2}</td>
					<td>${of.state}</td>
					<td>${of.country}</td>
					<td>${of.postalCode}</td>
					<td>${of.territory}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>