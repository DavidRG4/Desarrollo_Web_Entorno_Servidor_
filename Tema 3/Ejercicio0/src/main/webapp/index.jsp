<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (request.getMethod().equals("POST") && request.getParameter("nombre").equals("admin")
			&& request.getParameter("password").equals("admin")) {
	%>
	<jsp:forward page="admin.jsp"></jsp:forward>
	<%
	} else if (request.getMethod().equals("POST") && request.getParameter("nombre").equals("usuario")
			&& request.getParameter("password").equals("usuario")) {
	%>
	<jsp:forward page="usuario.jsp"></jsp:forward>
	<%
	}else if(request.getMethod().equals("POST")){
		
	%>
		<h1 style="color: red">Datos Erroneos, Repitalos:</h1>
	<%}
	%>
	
<%-- 	<% --%>
// 	if (request.getParameter("error") != null) {
<%-- 	%> --%>
<!-- 	<h1 style="color: red">Datos Erroneos, Repitalos:</h1> -->
<%-- 	<% --%>
// 	} else {
<%-- 	%> --%>
<!-- 	<h1>Inicio Sesion</h1> -->
<%-- 	<% --%>
// 	}
<%-- 	%> --%>
	<form method="post">

		<label for=nombre>Nombre:</label> <input id=nombre type=text
			name=nombre><br> <label for=password>Contraseña:</label>
		<input id=password type=password name=password><br>
		<button type=submit name=submit>Iniciar Sesion</button>

	</form>

</body>
</html>