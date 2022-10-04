package paquete;


/*
 * Java es un lenguaje de programacion orientado a objetos 'POO' o 'OOP'
 * y además todo tiene que estar englobado en clases
 * 
 * Una clase tiene la palabra reservada "class"
 * 
 * El nombre de la clase tiene que coincidir con el nombre del fichero
 * 
 * Las clases se agrupan en paquetes. Se escriben en minusculas
 * En este caso, la clase HolaMundo esta dentro del paquete "paquete"
 * 
 * Dentro de un paquete podemos tener todas las clases que queramos,
 * es como tener una estructura de directorios
 * 
 */
public class HolaMundo {

	//Esto es un comentario, no es procesado por el programa
	/*
	 * Esto seria un comentario
	 * de varias lineas
	 */
	//El metodo main sera el punto de acceso a nuestra app java
	public static void main(String[] args) {
		System.out.println("Hola mundo");		
		System.out.println("Hola otra vez!!! :)");
		//Recordar salvar siempre los fichero
		System.out.println("Otra frase");
		
		//Una varible es una caja que puede contener distintos valores
		String frase = "Esto es una frase";
		System.out.println(frase);
		frase = "esto es otra frase";
		System.out.println(frase);
		boolean cierto = true;//boolean puede contener true o false
		System.out.println(cierto);
		cierto = false;
		System.out.println(cierto);
		
	}//Cuando lleguemos al final del metodo, el programa se acabara

}
