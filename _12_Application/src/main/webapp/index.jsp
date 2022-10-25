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
		//Object usuario = request.getAttribute("nombreUsuario");
		Object usuario = request.getSession().
				getAttribute("nombreUsuario");
		if(usuario == null){
	%>
		<h1>No tiene permisos para ver la pagina, debe logarse</h1>
		<a href="login.jsp">Ir a login</a>
	<%
			return;//hago que no se ejecute el resto de la página
		}
	%>
	<p style="color:red">Atributo de request: ${requestScope.atributoRequest1}</p>
	<p style="color:blue">Atributo de session: ${sessionScope.nombreUsuario}</p>
	<p style="color:green">Atributo de application: ${applicationScope.contadorLogins}</p>
	<hr/>
	<a href="ListadoUsuariosServlet">ir a listar usuario</a>
</body>
</html>