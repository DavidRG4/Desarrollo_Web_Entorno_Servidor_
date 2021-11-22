<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${sessionScope.usuario!=null}">
	Esta usted logeado como<c:out value="${sessionScout.firstName } "></c:out>
	<c:out value="${sessionScout.lastName } "></c:out>
	<a class="text-white" href="${pageContext.request.contextPath}/LogOut">Salir</a>

</c:if>