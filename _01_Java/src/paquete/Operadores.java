package paquete;

public class Operadores {

	public static void main(String[] args) {
		//Operadores logicos (utilizados en condicionales
		//And logico. Solamente es verdad cuando ambas variables son verdad
		boolean bVariable = true && true;//true
		//Or logico. Si alguna de las dos variables es verdad, entonces devuevle verdad
		bVariable = true || false;//true
		//Negación. Si es true devuelve false, si es false devuelve true
		bVariable = !true;//false
		
		//Incrementales
		int numero1 = 0;
		numero1++;//incrementamos el valor de numero1 en 1
		numero1++;
		System.out.println(numero1);
		//Decremento
		numero1--;
		System.out.println(numero1);
		
		//Acumuladores
		numero1 = 5;
		numero1 += 10;//equivalente a numero1 = numero + 10;
		System.out.println(numero1);
		numero1 -= 10;//equivalente a numero1 = numero - 10;
		System.out.println(numero1);
		numero1 *=8;//equivalente a numero1 = numero * 8;
		System.out.println(numero1);
		numero1 /=8;//equivalente a numero1 = numero * 8;
		System.out.println(numero1);
		
		//operadores matematicos
		//+,-,*,/,%(resto de la division entera)
		int numero2 = 6 * 9;
		numero2 = 6 / 9;
		
		int numero3 = 3234328;
		if(numero3 % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
