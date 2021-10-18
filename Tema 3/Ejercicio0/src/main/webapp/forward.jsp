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
	if (request.getParameter("nombre").equals("admin") && request.getParameter("password").equals("admin")) {
	%>
	<jsp:forward page="admin.jsp">
		<jsp:param value="admin" name="nombre" />
		<jsp:param value="admin" name="password" />
	</jsp:forward>
	<%
	} else if (request.getParameter("nombre").equals("usuario") && request.getParameter("password").equals("usuario")) {
	%>
	<jsp:forward page="usuario.jsp">
		<jsp:param value="usuario" name="nombre" />
		<jsp:param value="usuario" name="password" />
	</jsp:forward>
	<%
	} else {
	%>
	<jsp:forward page="login.jsp">
	<jsp:param value="True" name="error"/>
	</jsp:forward>
	<%}%>
</body>
</html>