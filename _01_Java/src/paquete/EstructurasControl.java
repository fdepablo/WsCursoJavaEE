package paquete;

public class EstructurasControl {

	public static void main(String[] args) {
		System.out.println("Esto es una impresion por pantalla 1");
		System.out.println("Esto es una impresion por pantalla 2");
		System.out.println("Esto es una impresion por pantalla 3");
		
		//Estructura de control if
		boolean variable = true;
		
		if(variable == true) {
			System.out.println("Esta linea se ejecutara");
		}

		//Para valorar String en java se hace con un metodo de la clase
		//String
		
		String cadena = "pepe";
		if(cadena.equals("pepe")) {
			System.out.println("Hola me llamo pepe");
		}
		
		//AND logico
		if(cadena.equals("pepe") && variable == true) {
			System.out.println("entramos AND");
		}
		
		
		//OR logico
		if(cadena.equals("pepe") || variable == false) {
			System.out.println("entramos OR");
		}
		
		//If-else
		if(variable == false) {
			System.out.println("Variable igual a false");
		}else {
			System.out.println("Variable igual a true");
		}
		
		//if-elseif-else
		
		if(cadena.equals("maria")) {
			System.out.println("cadena vale maria");
		}else if(cadena.equals("pepe")) {
			System.out.println("cadena vale pepe");
		}else if(cadena.equals("juan")) {
			System.out.println("cadena vale juan");
		}else {
			System.out.println("No se como se llama la persona");
		}
		
		System.out.println("*****************************");
		//Estructuras repetitivas
		for(int i = 0;i<=1000;i++) {
			System.out.println("Escribiendo... " + i);
		}
		
		int variable2 = 1;
		//While se usa cuando no sabemos seguro cuantas veces se va a ejecutaralgo
		while(variable2 < 10) {
			System.out.println("While " + variable2);
			variable2++;//incrementamos variable en 1 unidad
		}
		
		System.out.println("*** SWITCH ***");
		//Hay otra estructura de control del tipo condicional el cual podemos
		//valorar varios valores de una variable
		//Es muy parecida a la estructura if-elseif-else
		int diaDeLaSemana = 7;
		switch (diaDeLaSemana) {
			case 1:
				System.out.println("Hoy es lunes");
				break;//rompemos la ejecución del switch, es decir, salimos de el
			case 2:
				//Ojo!! Si no poneis "break" entrará en el siguiente "case" aunque no lo cumpla
				System.out.println("Hoy es Martes");
				//break;
			case 3:
				System.out.println("Hoy es Miercoles");
				break;
			case 4:
				System.out.println("Hoy es Jueves");
				break;
			case 5:
				System.out.println("Hoy es Viernes");
				break;
			case 6:
				System.out.println("Hoy es Sabado");
				break;
			case 7:
				System.out.println("Hoy es Domingo");
				break;
			default://Equivalente al 'else', en caso de que ninguno se cumpla
				System.out.println("No se que dia es :(");
				break;
		}
		
		switch (diaDeLaSemana) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Estamos a dia entre diario :( :( :(");
			break;
		case 6:
		case 7:
			System.out.println("Juhuuu!!! estamos de finde!!! :) :) :)");
			break;
		default:
			System.out.println("no se en que dia de la semana estoy");
			break;
		}
	}

}
