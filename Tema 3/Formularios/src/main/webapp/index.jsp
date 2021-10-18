<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/formulario">
		<p>
			<label for="simple">Dime tu nombre</label> <input type="text"
				name="simple" id="simple"></input>
		</p>
		<button type="submit" name="submit">Enviar</button>
		<p>Elige una o menos</p>
		<label for="checkbox">Checkbox</label> <br> <input
			type="checkbox" name="checkbox" value="A">Opcion A</input> <br>
		<input type="checkbox" name="checkbox" value="B">Opcion B</input> <br>
		<input type="checkbox" name="checkbox" value="C">Opcion C</input> <br>
		<input type="checkbox" name="checkbox" value="D">Opcion D</input> <br>
		<input type="checkbox" name="checkbox" value="E">Opcion E</input> <br>

		<p>Elige una o menos</p>
		<select for="select" multiple>
			<option>Valor A</option>
			<option>Valor B</option>
			<option>Valor C</option>
			<option>Valor D</option>
			<option>Valor E</option>

		</select>
	</form>
</body>
</html>