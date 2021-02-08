<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<h1>Listado de Capacitaciones</h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Fecha</th>
					<th scope="col">Hora</th>
					<th scope="col">Nombre Cliente</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${lista}">
				<tr>
					<td><c:out value="${c.getIdproducto()}"></c:out></td>
					<td><c:out value="${c.getFecha()}"></c:out></td>
					<td><c:out value="${c.getHora()}"></c:out></td>
					<td><c:out value="${c.getNombreCliente()}"></c:out></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
<div>
	<a href="${pageContext.request.contextPath}/nuevacapacitacion">Ingresar Capacitación</a>
</div>

</body>
</html>