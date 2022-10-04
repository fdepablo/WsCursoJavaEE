package paquete;

public class Variables {

	public static void main(String[] args) {
		//Variables sirven para almacenar información
		
		//Java es un lenguaje tipado. Las variables son de un tipo
		//es decir, en una variable podemos almacenar un tipo concreto
		//de dato
		
		//Variables primitivas, guardamos la infomación dentro de
		//la variable
		int numero = 1121212111;
		System.out.println("La variable vale " + numero);
		numero = -10;
		System.out.println("La variable vale " + numero);
		
		boolean verdadero = true;//false
		long numerosLargos = 12321212122L;
		double numeroDecimal = 123.456;
		char c = 'p';
		float numeroDecimalFloat = 123.456F;//Un float es más pequeño que double
		
		//Variables referencia
		//En este tipo de variables NO guardsamos dentro el valor o la
		//información, en este tipo de variables guardamos la posicion
		//de memoria de donde se encuentra la información, es decir,
		//guardamos la posición de memoria del objeto
		String cadena = "frase completa";
		
		//Esto es un cambio tonto del codigo para probar github
	}

}
