<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 3</title>
</head>
<body>
	<%
	int rs = 0;
	if (request.getMethod().equals("POST")) {
		int n1 = Integer.valueOf(request.getParameter("n1"));
		int n2 = Integer.valueOf(request.getParameter("n2"));
		int n3 = Integer.valueOf(request.getParameter("n3"));
		rs = (n1 + n2 + n3) / 3;
	%>
	<h1>
		La media es :<%=rs%></h1>
	<%
	}
	%>


	<form method="post">
		<p>
			<label for=n1>Numero 1:</label> <input id=n1 type=number name=n1>
		</p>

		<p>
			<label for=n2>Numero 2:</label> <input id=n2 type=number name=n2>
		</p>
		<p>
			<label for=n3>Numero 3:</label> <input id=n3 type=number name=n3>
		</p>
		<button type=submit name=submit>Calcular</button>
	</form>

</body>
</html>