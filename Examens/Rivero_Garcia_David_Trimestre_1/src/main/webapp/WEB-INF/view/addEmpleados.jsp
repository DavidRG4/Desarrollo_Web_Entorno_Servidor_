<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
					<label for="employeeNumber">CustomerNumber</label>
					<input type="number" id="employeeNumber" name="employeeNumber" required>
					
					<label for="lastName" >Apellido</label>
    				<input type="text" id="lastName" name="lastName" required >	
    				
    				<label for="firstName">Nombre</label>
    				<input type="text" id="firstName" name="firstName" required>
    				
    				<label for="extension" >Extension</label>
    				<input type="text" id="extension" name="extension" required>
    				
    				<label for="email" >email</label>
    				<input type="email" id="email" name="email" required>
    								
    				<label for="jobTitle" >Puesto</label>
    				<input type="text" id="jobTitle" name="jobTitle" required>
    												
					<select id="officeCode" name="officeCode">
						<c:forEach  items="${employees}" var="e">
							<option value="${e.officeCode}">${e.officeCode}</option>
						</c:forEach>					
					</select>
					<select id="reportsTo" name="reportsTo">
						<c:forEach  items="${employees}" var="e">
							<option value="${e.reportsTo}">${c.reportsTo}</option>
						</c:forEach>					
					</select>
					 <input type="submit" value="AÑADIR" />	
					
				</form>
</body>
</html>