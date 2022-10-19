<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a nuestra tabla de multiplicar</h1>
	<form action="MultiplicarServlet">
		Numero: <input type="number" 
			name="numero" required="required" placeholder="Introduzca numero"/>
		<input type="submit" value="Calcular"/>
	</form>
	
	<%
	//Esta parte quiero ejecutarla en caso de que haya algún error
	//En caso de que venga informado el atributo "error" desde el servlet
	//entonces habrá algún error y lo quiero notificar al usuario
	
	//En caso de que no haya ese atributo error, entonces no notifico nada
	if(request.getAttribute("error") != null){
	%>
		<h2 style="color:red">No se admiten numeros menores o iguales que 0</h2>
	<%
	}
	%>
</body>
</html>