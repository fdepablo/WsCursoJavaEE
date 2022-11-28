
function mostrarTexto(){
	alert("Esto es un texto a mostrar")
}

//Cuando la página HTML se termine de cargar completamente, ejecuta
//la siguiente función
window.onload = function(){
	document.getElementById("mostrar").onclick = mostrarTexto;
	//agregariamos todas las funciones que queramos a los componentes HTML
}
