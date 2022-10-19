<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a nuestra tabla de multiplicar con redirect</h1>
	
	<a href="https://www.google.es">Ir a google</a>
	<!-- Queremos en este caso ir a traves del Servlet a google para 
		llevar un registro
	 -->
	<a href="RedirectServlet">Ir a google a traves de un servlet</a>
	
	<h1>Elija el numero</h1>
	<form action="MultiplicarServlet">
		Numero: <input type="number" 
			name="numero" required="required" placeholder="Introduzca numero"/>
		<input type="submit" value="Calcular"/>
	</form>
	
	<%
	//En este caso NO funcionará el atributo ya que la request cambia
	if(request.getAttribute("error") != null){
	%>
		<h2 style="color:red">No se admiten numeros menores o iguales que 0</h2>
	<%
	}
	%>
	
	<!-- Ahora desde el servlet le envio este parametro -->
	<h2 style="color:red">${param["parametroError"]}</h2>
</body>
</html>