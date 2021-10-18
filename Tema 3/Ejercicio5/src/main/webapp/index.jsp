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
	Double rs;
	if (request.getMethod().equals("POST")) {
		if (request.getParameter("dolares") != null) {
			int n1 = Integer.valueOf(request.getParameter("n1"));
			rs = n1 * 0.86;
		} else {
			int n1 = Integer.valueOf(request.getParameter("n1"));
			rs = n1 * 1.16;
		}
	%>
	<h1>
		Son un total de :<%=rs%>
		dolares
	</h1>
	<%
	} else {
	%>
	<form method="post">
		<p>
			<label for=n1>Dime cuanto dinero quieres pasar:</label> <input id=n1
				type=number name=n1>
		</p>
		<div>
			<img
				src="https://papelmatic.com/wp-content/uploads/2020/03/papelmatic-higiene-profesional-microbios-en-el-dinero-1200x900.jpg">
		</div>
		<button type=submit name=dolares value="dolares">Calcular
			dolares</button>
		<button type=submit name=euros value="euros">Calcular euros</button>

	</form>
	<%
	}
	%>
</body>
</html>