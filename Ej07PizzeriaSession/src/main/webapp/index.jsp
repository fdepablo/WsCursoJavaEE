<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizzeria</title>
<style type="text/css">
	/* 
		Selectores CSS, con esto hacemos que todas las etiquetas que cumplan la
		la condición del selector se le aplicque las reglas CSS
		
		El siguiente selector aplica a todas las etiqueta label
	*/
	label{
		/* La siguiente propiedad hace que los elementos se muestren en bloque */
		display: block;
	}
</style>
</head>
<body>
	<form action="PedidoServlet" method="get">
		<label for="nombre">Nombre Completo: <input type="text" name="nombre"></label>
		<fieldset>
			<legend>Seleccione el tamaño de su pizza.</legend>			
			<label for="peque"><input id="peque" type="radio" name="size" value="peque" checked> Pequeña</label>			
			<label for="mediana"><input id="mediana" type="radio" name="size" value="mediana"> Mediana</label>			
			<label for="grande"><input id="grande" type="radio" name="size" value="grande"> Grande</label>
		</fieldset>
		<fieldset>
			<legend>Seleccione sus ingredientes</legend>
			<label><input type="checkbox" name="ingredientes" value="Anchoas"> Anchoas</label>
			<label><input type="checkbox" name="ingredientes" value="Aceitunas"> Aceitunas</label>
			<label><input type="checkbox" name="ingredientes" value="Queso"> Queso</label>
			<label><input type="checkbox" name="ingredientes" value="Brócoli"> Brócoli</label>
		</fieldset>
		<input type="submit" value="Pedir Pizza">
	</form>
	
	<c:if test = "${requestScope.completado != null}">
	        <p style="color:blue">Pizza add al carrito</p>
    </c:if>
	<a href="ProcesarPedido">Ir a pagar</a>
</body>
</html>