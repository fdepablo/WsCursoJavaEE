<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a los JSP</h1>
	<%
		//Dentro de un scriplet podemos escribir código java
		String cadena = "Esto es un texto escrito en java";
	%>
	
	<!-- Dentro de una expresión JSP podemos escribir datos -->
	<h2><%=cadena%></h2>
	
	<%
	//Podemos usar estructuras de control o cualquier componente java
	for(int i =0; i < 10; i++){
	%>
		<p>Etiqueta "p" repetitiva, numero <%=i %></p>
	<%
	}
	%>
	
	<%-- Los comentarios en JSP se ponen de esta manera, este tipo de comentarios
		no los verá el cliente en el código HTML
	--%>
	
</body>
</html>