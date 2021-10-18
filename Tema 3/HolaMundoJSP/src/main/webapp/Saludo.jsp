<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saludos</title>
</head>
<body>
	<p>
		Saludos:
		<%=request.getParameter("nombre")%></p>
	<!--
String s1 = request.getParameter("nombre");
	out.println("Saludos " + s1);;

	%>
 -->
</body>
</html>