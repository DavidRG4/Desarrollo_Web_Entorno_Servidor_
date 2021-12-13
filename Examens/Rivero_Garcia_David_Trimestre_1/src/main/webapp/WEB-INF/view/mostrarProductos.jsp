<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${productos!=null}">
		<h1>Productos de la Categoria "${productos.productLine}"</h1>
		<table>
			<tr>
				<th><fmt:message key="nombre" /></th>
				<th><fmt:message key="descripcion" /></th>
				<th><fmt:message key="fabricante" /></th>
				<th><fmt:message key="precio" /></th>
				<th><fmt:message key="stock" /></th>
			</tr>
			<c:forEach items="${productos}" var="p">
				<tr>
					<td>${p.productName}</td>
					<td>${p.productDescription}</td>
					<td>${p.productVendor}</td>
					<td>${p.buyPrice}</td>
					<td>${p.quantityInStock}</td>
				</tr>

			</c:forEach>

		</table>
	</c:if>
	<c:if test="${productos==null }">
		<a href="Home">Categoria no selecionada</a>
	</c:if>
</body>
</html>