<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<jsp:include page="include/bootstrap.jsp" />
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center mt-5">
			<div class="col-6">
				<!-- Solo saco el formulario de login si no tengo sesion -->
				<c:if test="${sessionScope.usuario==null}">
					<form method="post">
						<label for="usuario" class="form-label">Usuario</label>
						<input type="text" class="form-control" id="usuario" name="usuario"required>
						<!-- Nombre -->
						<label for="firstName" class="form-label">Nombre</label>
						<input type="text" class="form-control" id="firstName" name="firstName" required>
							
						<!-- Apellido -->
						<label for="lastName"class="form-label">Apellido </label>
						<input type="text" class="form-control" id="lastName" name="lastName" required>
						<!-- Password -->
						<label for="password" class="form-label mt-3">Password</label> 
						<input type="password" class="form-control" id="password" name="password" required>

						<c:if test="${error!=null}">
							<p class="text-danger text-small mt-3">${error}</p>
						</c:if>

						<input type="submit" class="btn btn-primary w-100 mt-3"
							value="ENTRAR" />
					</form>
				</c:if>
				<c:if test="${sessionScope.usuario!=null}">
					<jsp:include page="include/barra.jsp" />
					<img class="img-fluid" src="img/portada.jpg" />


				</c:if>
			</div>
		</div>
	</div>


</body>
</html>