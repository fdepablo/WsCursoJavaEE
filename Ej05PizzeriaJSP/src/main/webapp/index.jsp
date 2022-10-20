<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<form action="resultado.jsp" method="get">
		<label for="nombre">Nombre Completo: <input type="text" name="nombre"></label>
		<fieldset>
			<legend>Seleccione el tamaño de su pizza.</legend>			
			<label for="peque"><input id="peque" type="radio" name="size" value="peque" checked> Pequeña</label>			
			<label for="mediana"><input id="mediana" type="radio" name="size" value="mediana"> Mediana</label>			
			<label for="grande"><input id="grande" type="radio" name="size" value="grande"> Grande</label>
		</fieldset>
		<fieldset>
			<legend>Seleccione sus ingredientes</legend>
			<label><input type="checkbox" name="anchoas"> Anchoas</label>
			<label><input type="checkbox" name="aceitunas"> Aceitunas</label>
			<label><input type="checkbox" name="queso"> Queso</label>
			<label><input type="checkbox" name="brocoli"> Brócoli</label>
		</fieldset>
		<input type="submit" value="Pedir Pizza">
	</form>
</body>
</html>