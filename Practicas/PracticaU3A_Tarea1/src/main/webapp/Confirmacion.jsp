<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="barra.jsp" />
	<jsp:useBean id="reserv"
		class="org.iesalixar.servidor.david.ReservaModdel" scope="request" />

	<h1>Reserva Confirmada</h1>
	<p>
		Fecha Inicio:<%=reserv.getFinicio()%>
	</p>
	<p>
		Fecha Final:<%=reserv.getFfinal()%>
	</p>
	<p>
		Numero Personas:<%=reserv.getPersonas()%>
	</p>
	<p>Servicios Reservados
	<ul>
		<%
		for (String i : reserv.getServicios()) {
		%>
		<li><%=i%></li>
		<%
		}
		%>
	</ul>
	</p>
</body>
</html>