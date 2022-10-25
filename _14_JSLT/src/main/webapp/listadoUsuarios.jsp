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
	
	<!-- Para valorar condiciones multiples podemos usar choose-->
	<!-- Podemos tener todos los test que queramos -->
	<!-- En caso de que no se cumpla ningun test usarmos otherwise-->
	<!-- OJO! Con poner comentarios dentro de las etiquetas JSLT, puede dar error -->
	
	<!-- Para iterar elementos de una lista, podemos usar la etiqueta "foreach"
		Tenemos dos atributos importantes:
		1- items. Representa la lista que queremos iterar
		2- var. Representa cada uno de los elementos de la lista
	 -->
	<c:choose>         
         <c:when test="${sessionScope.nombreUsuario != null}">
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
         </c:when>                

         <c:otherwise>
            <h3 style="color:red">No tiene permisos para ver la pagina, debe logarse</h3>
            <hr/>
			<a href="login.jsp">ir a login</a>
         </c:otherwise>
      </c:choose>
</body>
</html>