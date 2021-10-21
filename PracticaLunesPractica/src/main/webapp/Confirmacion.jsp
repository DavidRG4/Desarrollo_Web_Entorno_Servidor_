<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Barra.jsp" />
<p></p>
	<%
	String nombre = (String) session.getAttribute("nombre");
	String apellido = (String) session.getAttribute("apellido");
	String correo = (String) session.getAttribute("correo");
	%>
	<div>
		<p>
			Nombre:
			<%= nombre %></p>
		<p>
			Apellido:
			<%=apellido%></p>
		<p>
			correo:
			<%=correo%></p>
	</div>
	<div>

		<p>
			Curso:<%=request.getAttribute("curso")%>
		</p>
	</div>

	<ul>
		<%
		String[] modulos = (String[]) session.getAttribute("modulos");
		for (String i : modulos) {
		%>
		<li><%=i%></li>
		<%
		}
		%>
	</ul>
</body>
</html>