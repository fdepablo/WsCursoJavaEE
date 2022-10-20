<%@page import="modelo.entidades.Usuario"%>
<%@page import="java.util.List"%>
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
	 //Object usuario = request.getAttribute("nombre");
	 Object usuario = request.getSession()
			 .getAttribute("nombreUsuario");
	 List<Usuario> listaUsuarios = 
			 (List<Usuario>)request.getAttribute("listaUsuarios");
		if(usuario == null){
	%>
		<h1>No tiene permisos para ver la pagina, debe logarse</h1>
		<a href="login.jsp">Ir a login</a>
	<%
		return;
		}
	%>
	
	<p style="color:red">Logado con el usuario: <%=usuario%></p>
	<hr/>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>PASSWORD</th>	
		</tr>
		<%
		for(Usuario u:listaUsuarios){
		%>
		<tr>
			<td><%=u.getId() %></td>
			<td><%=u.getNombre() %></td>
			<td><%=u.getPassword() %></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="LogoutServlet">Logout de la sesión</a>
</body>
</html>