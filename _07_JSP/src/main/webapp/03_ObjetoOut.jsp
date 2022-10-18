<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	
		Existen muchos objetos implicitos dentro de las páginas JSPs.
		
		The out implicit object is an instance of a javax.servlet.jsp.JspWriter object and is used to send content in a response.
		
		Se puede utilizar para incrustar código HTML en la página, aunque no es muy utilizado
	 -->
	 
	 <%
	 out.print("<h1>Bienvenidos a nuestra página escrita con el objeto out</h1>");
	 int num = 7;	 
	 
	 out.print("<table>");
	 for(int i = 1; i <= 10 ; i++){
		 out.print("<tr>");
		 out.print("<td> " + i + "<td>");
		 out.print("<td> " + num + "<td>");
		 out.print("<td> " + (i * num) + "<td>");
		 out.print("</tr>");
	 }
	 out.print("</table>");
	 %>
</body>
</html>