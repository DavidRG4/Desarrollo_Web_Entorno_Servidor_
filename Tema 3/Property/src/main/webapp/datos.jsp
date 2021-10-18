<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Mostramos datos</h1>
<ul>
	<%
	ArrayList<String> lista=(ArrayList<String>)request.getAttribute("propiedades");
	out.println(lista);
%>
</ul>
</body>
</html>