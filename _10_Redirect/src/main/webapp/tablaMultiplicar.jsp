<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="modelo.entidades.Multiplicacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//Obtenemos el objeto del atributo de request
		//Debemos castear el tipo objeto
		Multiplicacion multiplicacion = (Multiplicacion)
			request.getAttribute("multiplicacion");
		String otroAtributo = (String)
				request.getAttribute("otroAtributo");
		
		List<Integer> tablaMultiplicacion = 
				multiplicacion.getTablaMultiplicar();
		
		//Podemos sacar el numero de dos sitios
		String sNumero = request.getParameter("numero");
		int iNumero = multiplicacion.getNumero();
	%>
	
	<!-- Podemos tambien utilizar JSP EL para obtener los atributos -->
	<h3>El otro atibuto introducido ha sido ${requestScope.otroAtributo }</h3>
	<!-- Para obtener atributos de objetos DEBEN de seguir estructura JavaBean -->
	<h3>Tabla de multiplicar para el número ${requestScope.multiplicacion.numero}</h3>
	
	<table border=1>
		<tr>
			<th>Numero</th>
			<th>Contador</th>
			<th>Resultado</th>
		</tr>
		<%
		for(int i = 1;i<=tablaMultiplicacion.size();i++){
		%>
		<tr>
			<td>${requestScope.multiplicacion.numero}</td>
			<td><%=i%></td>
			<td><%=tablaMultiplicacion.get(i-1) %></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="index.jsp">Volver</a>
</body>
</html>