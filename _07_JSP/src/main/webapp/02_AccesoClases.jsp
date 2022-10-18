<%@page import="util.NumeroAleatorio"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Accediendo a las clases java</h1>
	<!-- Podemos ver arriba como se nos han creado dos directivas, que son de las más importantes
	
		Por un lado tenemos la directiva de pagina "page" que sirve para dar instrucciónes al 
		contenedor.
		
	 -->
	
	<%
		int numeroAleatorio = NumeroAleatorio.generarNumero(1, 100);
	%>
	<h2 style="color:blue"><%=numeroAleatorio%></h2>

    <% if (numeroAleatorio > 75) { %>
       <p> El numero es muy alto!</p>
    <% } else if(numeroAleatorio < 25) { %>
       <p> El numero es de rango bajo</p>
    <% } else { %>
       <p> El numero es rango medio</p>
    <% } %>

	<a href="02_AccesoClases.jsp">Recargar</a>
</body>
</html>