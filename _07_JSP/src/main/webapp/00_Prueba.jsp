<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prueba de JSP</title>
</head>
<body>
	<p>Un JSP <b>ES UN SERVLET</b> </p>
	<h1>Podemos incluir cualquier tipo de etiqueta HTML</h1>
	
	<!-- Podemos poner scriplets para generar contenido dinamico 
	
	-->
	<%
		Date date = new Date();
		String fecha = date.toLocaleString();
	%>
	
	<!-- Mediante expresiones JSP podemos generar contenido dinamico -->
	
	<h1 style="color:red"><%=fecha %></h1>
	
</body>
</html>