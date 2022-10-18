<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		The request object is an instance of a javax.servlet.http.HttpServletRequest object. 
		
		Cada vez que un cliente solicite una página JSP, el servidor crea un nuevo objeto que representa dicha request
	 
	 	Tambien tenemos otro objeto implicito que sería el response, que sería
	 	una instancia de javax.servlet.http.HttpServletResponse
	 -->

		<!-- Norlmalmente dejar esto al servlet -->
	  <h1>Parametros de request</h1>
	  <h3><%= request.getParameter("param1")%></h3>
	  <h3><%= request.getParameter("param2")%></h3>
	  
	 <h1>Cabeceras de la request</h1>
	 <table border = "1">
	     <tr>
	        <th>Nombre de cabecera</th>
	        <th>Valor(es) de la cabecera</th>
	     </tr>
	     <%
	        Enumeration<String> headerNames = request.getHeaderNames();
	        while(headerNames.hasMoreElements()) {
	           String paramName = headerNames.nextElement();
	           out.print("<tr><td>" + paramName + "</td>\n");
	           String paramValue = request.getHeader(paramName);
	           out.println("<td> " + paramValue + "</td></tr>\n");
	        }
	     %>
	  </table>	  	     
</body>
</html>