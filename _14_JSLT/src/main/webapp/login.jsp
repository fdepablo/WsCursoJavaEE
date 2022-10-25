<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 		
		Siempre que queramos usar etiquetas de librería JSTL, usaremos
		la etiqueta "c:" y luego ponemos la etiqueta que queremos usar 
		
		Cuando queriamos escribir codigo HTML dentro de una página JSP
		usabamos espresiones JSP o el objeto "out". 
	 -->
	<h1><c:out value="Librerías JSTL"></c:out></h1>
		
	<form action="LoginServlet" method="post">
		Nombre: <input type="text" name="nombre"/>
		Password: <input type="password" name="password"/>
		<input type="submit" value="Entrar"/>
	</form>

	<h2 style="color:red">${param["error"]}</h2>

</body>
</html>