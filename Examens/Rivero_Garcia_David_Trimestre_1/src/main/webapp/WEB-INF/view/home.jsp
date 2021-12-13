<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<c:if test="${role==usuario}">
		<jsp:include page="barraUsuario.jsp" />
	
	<ul>
		<li><a href="mostrarProductos?ln=ClassicCars">Clasic Cars</a></li>
		<li><a href="mostrarProductos?ln=MotorCycles">MotorCycles</a></li>
		<li><a href="mostrarProductos?ln=Plane">Plane</a></li>
		<li><a href="mostrarProductos?ln=Ships">Ships</a></li>
		<li><a href="mostrarProductos?ln=Trains">Trains</a></li>
		<li><a href="mostrarProductos?ln=Trucks">Trucks and Buses</a></li>
		<li><a href="mostrarProductos?ln=VintageCars">Vintage Cars</a></li>
	</ul>
	</c:if>
	<c:if test="${role==admin }">
		<jsp:include page="barraAdmin.jsp" />
	
		<ul>
		<li><a href="Admin/Empleados">Mostrar Empleado</a></li>
		<li><a href="Admin/addEmpleados">Añadir Empleados</a></li>
	</ul>
	</c:if>
</body>
</html>