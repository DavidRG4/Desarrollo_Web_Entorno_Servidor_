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
		int n1 = Integer.valueOf(request.getParameter("n1"));
		rs=n1*0.86;
	%>
	<h1>
		Son un total de :<%=rs%> dolares</h1>
	<%
	}else{
	%>
	<form method="post">
		<p>
			<label for=n1>Dime cuanto dinero quieres pasar a dolares:</label> <input id=n1 type=number name=n1>
		</p>
		<button type=submit name=submit>Calcular</button>
	</form>
	<%} %>
</body>
</html>