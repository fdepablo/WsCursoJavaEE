<%@page import="modelo.entidades.Usuario"%>
<%@page import="java.util.List"%>
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
    <p style="color:blue">Logueado con el usuario: <c:out value="${sessionScope.nombreUsuario}"/></p>
	<hr/>			
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>PASSWORD</th>	
		</tr>
		<c:forEach items="${requestScope.listaUsuarios}" var="u">
   			<tr>
				<td><c:out value="${u.id}"/></td>
				<td><c:out value="${u.nombre}"/></td>
				<td><c:out value="${u.password}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>