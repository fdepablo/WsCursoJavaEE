<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String nombre = request.getParameter("param1");
	%>
	<h1 style="color:green">Bienvenido <%=nombre %></h1>
	
	<!-- Es mucho mejor utilizar JSP EL siempre que se pueda -->
	<h1 style="color:green">Bienvenido ${param["param1"]}</h1>
</body>
</html>