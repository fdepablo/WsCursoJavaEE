<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Leer Cookie</h1>
	<p style="color:red">Atributo de request: ${requestScope.fechaPrimeraConexion}</p>
	<p style="color:blue">Valor de la cookie 'fechaPrimeraConexion': ${cookie.fechaPrimeraConexion.value}</p>
	<p style="color:blue">Valor de la cookie 'fechaPrimeraConexion': ${cookie['fechaPrimeraConexion'].value}</p>
	<p style="color:green">Valor de la cookie 'horaPrimeraConexion': ${cookie.horaPrimeraConexion.value}</p>
</body>
</html>