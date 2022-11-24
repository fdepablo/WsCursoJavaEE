package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainJava8 {
	public static void main(String[] args) {
		
		//A partir de una interfaz podemos crear una clase anonima
		//Es decir, creamos la clase y el objeto al mismo tiempo
		//sin necesidad de hacer por partos
		InterfazDosNumeros idn = new InterfazDosNumeros() {
			
			@Override
			public int dosNumeros(int n1, int n2) {
				int resultado = n1 + n2;
				return resultado;
			}
		};

		System.out.println(idn.dosNumeros(7, 9));
		System.out.println(idn.dosNumeros(10, 98));
		
		//Java 8 nacieron las funciones lambda
		//Las funciones lambda tiene que crearse siempre a partir
		//de una interfaz funcional
		
		//Esto sería exactamente igual que una clase anonima
		
		InterfazDosNumeros idnLambda = (n1,n2) -> {
			int resultado = n1 + n2;
			return resultado;
		};
		
		System.out.println(idnLambda.dosNumeros(7, 9));
		System.out.println(idnLambda.dosNumeros(10,98));
				
		InterfazDosNumeros idnLamda2 = (n1,n2) -> n1 + n2;
		
		System.out.println(idnLamda2.dosNumeros(7, 9));
		System.out.println(idnLamda2.dosNumeros(10,98));
		
		//Ahora podemos cambiar la funcionalida a partir de la interfaz
		InterfazDosNumeros idnLamda3 = (n1,n2) -> n1 - n2;
		InterfazDosNumeros idnLamda4 = (n1,n2) -> n1 * n2;
		
		System.out.println(idnLamda3.dosNumeros(7, 9));
		System.out.println(idnLamda4.dosNumeros(7, 9));
		
		//JAva prorocina ya algunas interfaces funcinales para crear lambdas
		Function<Integer, Integer> lambdaFactorial = (n) -> {
			int resultado = 1;
			for(int i = 1; i <= n; i++) {
				resultado *= i;
			}
			
			return resultado;
		};
		
		System.out.println(lambdaFactorial.apply(5));
		
		BiFunction<Integer, Integer, Integer> idnLamda5 = (n1,n2) -> n1 + n2;
		System.out.println(idnLamda5.apply(75, 96));
		
		
	}
}
