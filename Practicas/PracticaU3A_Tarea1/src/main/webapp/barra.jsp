<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<a href=<%=request.getContextPath()%>>Volver</a>
<a href="Logout">Salir</a>
<h1>
	Usuario:<%=session.getAttribute("usuario")%>
	Sesion:<%=session.getAttribute("tiempo")%>
</h1>
