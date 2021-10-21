<%@page import="org.iesalixar.servidor.david.UsuarioModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="usuariobean"
		class="org.iesalixar.servidor.david.UsuarioModel" scope="request" />
	<%
	if (session.isNew()) {
	%>
	<form method="post">
		<input type="submit" name="boton" value="Entrar">
	</form>
	<%
	} else {
	%>
	<a href="Logout"> <input type="submit" name="boton" value="Salir">
	</a><%=session.getAttribute("nombre")%>
	<%
	}
	%>
</body>
</html>