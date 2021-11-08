<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update </title>
</head>
<body>
	<div>
		<form method="post">
				<label for="usuario">CustomerNumber</label> 
				<input value=${pago.customerNumber } type="text" name="customerNumber" disabled />
				<label for="usuario">CheckNumber</label> 
				<input value=${pago.checkNumber } type="text" name="checkNumber" disabled /> 
				<label for="usuario">Date</label> 
				<input value=${pago.date } type="date" name="date" />
				<label for="usuario">Amount</label> 
				<input value=${pago.amount } type="text" name="amount"  /> 
				<input value="Editar" type="submit"  />
		</form>
	</div>
</body>
</html>
