package paquete;

import java.util.ArrayList;
import java.util.HashMap;

public class EstructurasDatos {

	public static void main(String[] args) {
		System.out.println("Estructuras de datos");
		
		System.out.println("Estructura de array");
		int numero1 = 0;
		int numero2 = 1;
		//Si queremos guardar un millon de numeros variables 
		//no podemos crearnos un millon de variables...
		
		//Podemos trabajar con listas o arrays. 
		//Un lista o array es una colección ordenada de elementos
		//de un mismo tipo. Admite repetición de valores
		
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Felix");
		listaNombres.add("Maria");
		listaNombres.add("Ana");
		
		System.out.println(listaNombres.get(0));
		System.out.println(listaNombres.get(1));
		System.out.println(listaNombres.get(2));
		
		System.out.println("Recorriendo el array");
		//for each
		for(String s : listaNombres) {
			System.out.println(s);
		}
		
		//Cuando parametrizamos un array no podemos usar primitivos
		//Pero Java creo los tipo wrapper, o tipo envoltorio.
		//Basicamente son primitivos usados como objetos
		int numeroPrimitivo = 7;
		Integer numeroWrapper = 7;
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(5);
		listaNumeros.add(7);
		listaNumeros.add(9);
		System.out.println(listaNombres.get(0));
		
		//for each
		for(Integer n : listaNumeros) {
			System.out.println(n);
		}
		
		//Estructuras de tipo Mapa o Hash
		//Este tipo de estructuras contienen duplas con la clave y el valor
		//Tiene forma de tabla bidimensional (2 columnas)
		//Estos registros clave-valor no estan ordenados y tampoco admiten
		//repetición. Es decir, no puede haber 2 claves iguales
		
		HashMap<String, String> mapaPasswords = new HashMap<>();
		//Con put ponemos las duplas dentro del mapa
		mapaPasswords.put("felix", "1234");
		mapaPasswords.put("ana", "4321");
		
		//Con get() accedemos a los valores a partir de la clave
		String valor = mapaPasswords.get("felix");
		System.out.println(valor);
		//Si accedemos a una clave que no existe, devuelve null (ausencia de valor)
		valor = mapaPasswords.get("roberto");
		System.out.println(valor);
		
		//Si ponemos la clave repetida, sobreescribimos el valor
		mapaPasswords.put("felix", "1111");
		valor = mapaPasswords.get("felix");
		System.out.println(valor);

	}

}
