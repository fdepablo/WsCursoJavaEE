
function sumar(){
	let n1 = parseInt(numero1.value);
	let n2 = parseInt(numero2.value);
	
	let suma = n1 + n2;
	resultado.value = suma;
}

//Agregamos la funcionalidad de manera semantica
botonSumar.onclick = sumar;