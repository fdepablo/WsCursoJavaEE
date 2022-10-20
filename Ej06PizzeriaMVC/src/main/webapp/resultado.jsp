<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pasa por caja</title>
</head>
<body>
	<h1>Este es tu pedido ${param["nombre"]}</h1>
	<p>Tamaño: ${param["size"]}</p>
	<p>Los ingredientes elegidos son: <span style="color:blue">${requestScope.pizza.ingredientes}</span></p>
	<p>En total son <span style="color:red">${requestScope.pizza.precio} Euros</span></p>
</body>
</html>