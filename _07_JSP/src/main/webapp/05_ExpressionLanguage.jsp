<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Expresiones de Lenguaje JSP (JSP EL)</h1>
	<!-- Con JSP EL si no existe un parametro no pinta nada, en cambio con JPS
		pintaria null. JSP EL evita los null
	 -->
	<h2>Parametro de la request con JSP <%= request.getParameter("param1")%></h2>
	<h2>Parametro de la request con JSP EL: ${param["param1"]}</h2>
	<h2>Parametro de la request: ${param["param2"]}</h2>
	<h2>Cabecera de la request 'user-agent': ${header["user-agent"]}</h2>
	<h2>Cabecera de la request: 'host' ${header["host"]}</h2>
</body>
</html>