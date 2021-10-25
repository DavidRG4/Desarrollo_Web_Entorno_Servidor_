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
	
	<h1>Datos de la Reserva</h1>
	<form method="post">
		<p>
			<label for="fechainicio">Fecha Inicio</label> <input type="date"
				name="fechainicio" required />
		</p>
		<p>
			<label for="fechafinal">Fecha Fin</label> <input type="date"
				name="fechafinal" required />
		</p>
		<p>
			<label for="personas">Numero de Personas</label> <input type="number"
				name="personas" required />
		</p>

		<p>
		<h3>Servicios</h3>
		<input type="checkbox" name="servicios" value="Wifi" />Wifi <br>
		<input type="checkbox" name="servicios" value="Toallas" />Toallas <br>
		<input type="checkbox" name="servicios" value="Desayuno" />Desayuno <br>
		<input type="checkbox" name="servicios" value="Limpieza" />Limpieza <br>
		<input type="checkbox" name="servicios" value="Ruta_guiada" />Ruta_guiada
		<br> <input type="checkbox" name="servicios" value="Sauna" />Sauna
		</p>
		<p>
			<input type="submit" name="reserva" value="Reservar">
		</p>
	</form>

</body>
</html>