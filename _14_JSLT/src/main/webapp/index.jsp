<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSLT</title>
</head>
<body>
	<!-- Podemos usar la etiqueta "if" para evaluar condiciones -->
	<c:if test = "${sessionScope.nombreUsuario != null}">
        <p style="color:blue">Logueado con el usuario: <c:out value="${sessionScope.nombreUsuario}"/></p>
		<hr/>
		<a href="ListadoUsuariosServlet">ir a listar usuario</a>
    </c:if>

	<c:if test = "${sessionScope.nombreUsuario == null}">
        <p style="color:red">Debe de estar logueado para ver la página</p>
		<hr/>
		<a href="login.jsp">ir a login</a>
    </c:if>
</body>
</html>