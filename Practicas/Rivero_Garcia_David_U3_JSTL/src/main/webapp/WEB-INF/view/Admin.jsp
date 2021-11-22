<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />
<jsp:include page="include/bootstrap.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Pagos</title>
</head>
<body>
	<div class="container mt-5">
		<jsp:include page="include/barra.jsp" />

		<div class="row justify-content-end">
			<div class="col-2">
				<a class="btn btn-primary w-100" href="Add">AÑADIR PAGO</a>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-10">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Codigo</th>
							<th>nombre</th>
							<th>Categoria</th>
							<th>stock</th>
							<th>Precio</th>
							<th>Accion</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Productos}" var="producto">
							<tr>
								<td>${producto.productCode}</td>
								<td>${producto.productName}</td>
								<td>${producto.productLine}</td>
								<td>${producto.quantityInStock}</td>
								<td>${producto.buyPrice}</td>
								<td><a href="EditarProduct?cn=${producto.productCode}"><i
										class="bi bi-pencil-fill"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>