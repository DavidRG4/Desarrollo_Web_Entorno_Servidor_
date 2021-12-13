<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="fmt"
	uri="http://java.sun.com/jstl/fmt_rt"%>
<fmt:setBundle basename="interface" />

<a href=<%=request.getContextPath() + "/Home"%>><fmt:message
		key="inicio" /></a>
<h1>
	<fmt:message key="usuario" />
</h1>
<a href=<%=request.getContextPath() + "/logout"%>><fmt:message
		key="salir" /></a>
