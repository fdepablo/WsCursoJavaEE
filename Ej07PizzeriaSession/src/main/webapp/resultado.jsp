<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pasa por caja</title>
</head>
<body>
	<h1>Este es tu pedido</h1>
	<h2>${sessionScope.pedido.listaPizzas}</h2>
	<table border="1">
		<tr>
			<th>Size</th>
			<th>Ingredientes</th>
			<th>precio</th>	
		</tr>
		<c:forEach items="${sessionScope.pedido.listaPizzas}" var="p">
   			<tr>
				<td><c:out value="${p.size}"/></td>
				<td><c:out value="${p.ingredientes}"/></td>
				<td><c:out value="${p.precio}"/></td>
			</tr>
		</c:forEach>
	</table>
	<p>El total son <span style="color:red">${sessionScope.pedido.precioTotal} Euros</span></p>
</body>
</html>