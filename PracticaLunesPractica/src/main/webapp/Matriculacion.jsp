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
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<fmt:setBundle basename="interface" />

	
	<%
	if (session.isNew()) {
	%>
	<form method="post">
		<input type="submit" name="boton" value="<fmt:message key="entrar" />">
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