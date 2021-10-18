<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"
	import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	PrintWriter ot=response.getWriter();
	ot.println("<ul>");
	for(int i=1;i<101;i++){
		ot.println("<li>"+i+"</li>");
	}
	ot.println("</ul>");
	
	%>
</body>
</html>