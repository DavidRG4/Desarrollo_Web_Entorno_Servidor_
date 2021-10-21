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
	<form method="post">
		<div>
			<label for="nombre">Nombre: </label> <input type="text" name="nombre"
				required><br> <label for="apellido">Apellido: </label>
			<input type="text" name="apellido" required><br> <label
				for="correo">Correo: </label> <input type="text" name="correo"
				required>
		</div>
		<div>
			<p>Curso</p>
			<label for="curso">1º </label> <input type="radio" name="curso"
				value="1"> <label for="curso">2º </label> <input
				type="radio" name="curso" value="2">
		</div>
		<p>Modulos para elegir</p>
		<select name="modulos" multiple>
			<option>modulo 1</option>
			<option>modulo 2</option>
			<option>modulo 3</option>
			<option>modulo 4</option>
			<option>modulo 5</option>
		</select>
		<p>
			<input type="submit" value="Matricular" />
		</p>
	</form>
</body>
</html>