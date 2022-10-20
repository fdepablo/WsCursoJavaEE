<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pasa por caja</title>
</head>
<body>
<%
	int precio = 0;
	//compruebo que se ha seleccionado un tamaño
	if(!"".equals(request.getParameter("size"))){
		//establecemos el precio base
		String size = request.getParameter("size");
		switch(size){
			case "peque":
				precio = 5;
				break;
			case "mediana":
				precio = 10;
				break;
			case "grande":
				precio = 15;
				break;
			default:
				break;
		}
		//añadimos un euro extra por ingrediente
		//En caso de que llegue el checkbos elegido, vendrá con value=on
		//por defecto, si no ponemos 'value' a un checkbox el navegador le 
		//pone el 'value=on'
		String[] ingredientes = {"anchoas","aceitunas","queso","brócoli"};
		for(String i :ingredientes){
			if ("on".equals(request.getParameter(i))){
				precio ++;
			}
		}
		
	}else{
		precio = -1;
	}
%>
	<h1>Este es tu pedido ${param["nombre"]}</h1>
	<p>Tamaño: ${param["size"]}</p>
	<p><%
		if("on".equals(request.getParameter("anchoas"))){
			out.println("Con");
		}else{
			out.println("Sin");
		} %> Anchoas</p>
	<p><%
		if("on".equals(request.getParameter("aceitunas"))){
			out.println("Con");
		}else{
			out.println("Sin");
		} %> Aceitunas</p>
	<p><%
		if("on".equals(request.getParameter("queso"))){
			out.println("Con");
		}else{
			out.println("Sin");
		} %> Queso</p>
	<p><%
		if("on".equals(request.getParameter("brocoli"))){
			out.println("Con");
		}else{
			out.println("Sin");
		} %> Brócoli</p>
	
	<p>En total son <span style="color:red"><%=precio %> Euros</span></p>
</body>
</html>