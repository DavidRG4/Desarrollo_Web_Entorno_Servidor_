<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Mostrando el usuario
	</p>
	<p>Usuario: <%=request.getAttribute("simple") %></p>
	<p>Mostrando checkbox</p>
	<p>Opciones Checkbox: <%= request.getAttribute("checkbox") %></p>
	<p>Mostrando Selects</p>
	<p>Opciones Select:<%=request.getAttribute("select") %></p>

</body>
</html>