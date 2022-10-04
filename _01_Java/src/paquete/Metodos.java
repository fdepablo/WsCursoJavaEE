package paquete;

public class Metodos {

	public static void main(String[] args) {
		System.out.println("Programa de metodos");
		//podemos ejecutar un metodo llamandolo por su nombre
		mostrarDatos();
		for(int i = 0; i < 10; i++) {
			mostrarDatos();
		}
		System.out.println("---------------");
		mostrarNombre("Steve Rogers");
		mostrarNombre("Tony Stark");
		String nombre = "Steve Banner";
		mostrarNombre(nombre);
		mostrarNombreApellido("Steve", "Rogers");//AKA Capitan america
		
		int resultado = sumar(3, 4);
		System.out.println(resultado);
		resultado = sumar(13, 14);
		System.out.println(resultado);
		resultado = sumar(20,56);
		resultado = sumar(20,78,90);
		System.out.println(resultado);
		
		//trabajamos con metodos de entrada variable
		System.out.println("trabajamos con metodos de entrada variable");
		resultado = sumarVariable(5,6,7);
		System.out.println(resultado);
		resultado = sumarVariable(5,6,7,78,90);
		System.out.println(resultado);
		resultado = sumarVariable(5,6,7,78,90,99,100,45,56,56,77,123);
		System.out.println(resultado);
		resultado = sumarVariable(5);
		System.out.println(resultado);
		resultado = sumarVariable();
		System.out.println(resultado);
		
		int[] arrayEnteros = new int[10];
		resultado = sumarArray(arrayEnteros);
	}
	
	//Las funciones o metodos son partes de codigo java que pueden ejecutar
	//un conjunto de sentencias.
	//Tambien pueden admitir parametros de entrada y pueden 
	//tener parametros de salida
	//los metodos se crean dentro de clases
	
	public static void mostrarDatos() {
		System.out.println("Hola me llamo felix");
		System.out.println("Soy ingeniero informatico");
		System.out.println("Soy profesor");
	}
	
	public static void mostrarNombre(String nombre) {
		System.out.println("******************");
		System.out.println("**** " + nombre +  " ****");
		System.out.println("******************");
	}
	
	public static void mostrarNombreApellido(String nombre, String apellido) {
		System.out.println("******************");
		System.out.println("**** " + nombre +  " ****");
		System.out.println("**** " + apellido +  " ****");
		System.out.println("******************");
	}
	
	public static int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	//Sobrecarga de metodos en java (poo)
	//Es una caracteristica de la poo la cual podemos poner varios
	//metodos con el mismo nombre, pero distinto numero o tipo de parametros
	//de entrada
	public static int sumar(int numero1, int numero2, int numero3) {
		int resultado = numero1 + numero2 + numero3;
		return resultado;
	}
	
	//En java existen los metodos con numero indeterminado de parametros de entrada
	public static int sumarVariable(int... numeros) {//5,6,7
		//numeros lo vamos a tratar como un array o lista
		int resultado = 0;
		for(int numero : numeros) {
			//acumulador
			resultado = resultado + numero;//1-5 ;2-11;3-18
		}
		return resultado;
	}
	
	public static int sumarArray(int[] numeros) {
		//numeros lo vamos a tratar como un array o lista
		int resultado = 0;
		for(int numero : numeros) {
			//acumulador
			resultado = resultado + numero;//1-5 ;2-11;3-18
		}
		return resultado;
	}
}
