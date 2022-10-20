<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		Nombre: <input type="text" name="nombre"/>
		Password: <input type="password" name="password"/>
		<input type="submit" value="Entrar"/>
	</form>

	<h2 style="color:red">${param["error"]}</h2>

</body>
</html>