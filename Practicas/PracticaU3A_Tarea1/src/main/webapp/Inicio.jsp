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
	if (session.isNew()) {
	%>
	<form method="post">
		<p>
			<label for="usuario">Usuario</label> <input type="text"
				name="usuario" required />
		</p>
		<p>
			<label for="password">Contraseña</label> <input type="password"
				name="password" required />
		</p>
		<p>
			<label for="passwordConfirm">Comprobar Contraseña</label> <input
				type="password" name="passwordConfirm" required />
		</p>
		<p>
			<label for="correo">Correo</label> <input type="email" name="correo"
				required />
		</p>
		<p>
			<input type="submit" name="boton" value="Registrar">
		</p>
	</form>
	<%
	} else {
	%>
	<jsp:include page="barra.jsp" />
	<img src="<%=request.getContextPath()%>/montana2.jpg" id="imagen">
	<%
	}
	%>
</body>
</html>