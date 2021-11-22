<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="include/bootstrap.jsp"/>
<title>Añadir Pagos</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center mt-3">
			<div class="col-6">
				<form method="post">
					<label for="productCode mt-3" class="form-label">productCode</label>
					<select class="form-select" id="productCode" name="productCode">
						<c:forEach  items="${productos}" var="p">
							<option value="${p.productCode}">${p.productCode}</option>
						</c:forEach>					
					</select>
									
				</form>
			</div>
		</div>
	</div>
</body>
</html>