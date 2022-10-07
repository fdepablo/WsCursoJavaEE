package herencia;

import java.util.ArrayList;

//Todas las clases tienen herencia en java, si no le decimos nada
//heredara de la clase Object
public class MainHerencia extends Object{
	public static void main(String[] args) {
		Moto moto = new Moto();
		moto.setMarca("Kawa");
		moto.setModelo("z-750");
		moto.setMatricula("CWR-6789");
		
		Coche coche = new Coche();
		coche.setMarca("Toyota");
		coche.setMatricula("GWS-9876");
		coche.setModelo("Yaris");
		coche.setModeloRadio("Yamaha-456");
		
		coche.mostrarMatricula();
		moto.mostrarMatricula();
		
		Object o = new Object();
		//El toString de la clase objetct no aporta mucha información
		//Podemos sobreescribir los metodos padre si queremos dar
		//otro comportamiento
		System.out.println(coche.toString());
		System.out.println(moto.toString());
		
		MotoSidecar ms = new MotoSidecar();
		ms.setTieneMaletero(false);
		
		//Ejemplos de la segunda regla
		Vehiculo v = new Moto();
		v = new Coche();
		
		//Moto m1 = new Vehiculo();
		//v.setTieneMaletero(true);
		v.setMarca("BMW");
		
		/*
		ArrayList<Coche> listaCoches = new ArrayList<>();
		listaCoches.add(coche);
		ArrayList<Moto> listaMotos = new ArrayList<>();
		ArrayList<MotoSidecar> listaMotosSidecar = new ArrayList<>();
		*/

		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(coche);
		listaVehiculos.add(moto);

		
		//listaVehiculos.add(tractor);
		
		//Mediante el casting podemos cambiar la referencia
		//pero ojo! si el objeto que estamos casteando no es del tipo
		//de la referencia, entonces nos dara un error en tiempo de 
		//ejecución.
		
		//Para asegurarnos, podemos usar algun herramientas de java
		//como la palabra reservada "instanceof" que nos devuelve
		//un booleano diciendo si el objeto puede ser referenciado
		//con una instancia concreta
		
		Coche cocheAxu = (Coche)v;
		cocheAxu.setModeloRadio("Pioner XJ43");
		
		if(listaVehiculos.get(0) instanceof Coche) {
			Coche c2 = (Coche)listaVehiculos.get(0);
			c2.setModeloRadio("Pioner XJ45");
			System.out.println(c2);
		}
		
		System.out.println("imprimiendo lista vehiculos");
		/*for(Vehiculo vAux : listaVehiculos) {
			if(vAux instanceof Coche) {
				Coche c3 = (Coche)vAux;
				System.out.println(c3);
			}else {
				System.out.println(vAux);
			}
		}*/
		//Mediante el polimorfismo podemos recorrernos la lista de
		//vehiculos e imprimir normalmente cada uno de ellos, 
		//Java invocará el metodo toString de cada de los objetos
		for(Object vAux : listaVehiculos) {
			System.out.println(vAux.toString());
		}
		
		//Abtract
		//Figura f = new Figura();
		Figura f = null;
		Figura2D f2d = null;
		f2d = new Cuadrado();
		Cuadrado cuadrado = (Cuadrado)f2d;
		cuadrado.setColor("azul");
		cuadrado.setLado(5);
		
		System.out.println(f2d.getColor());
		
		ArrayList<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(f2d);
		//listaFiguras.add(cuadrado);//Equivalente
		
		Circulo circulo = new Circulo();
		circulo.setColor("Rojo");
		circulo.setRadio(10);
		
		listaFiguras.add(circulo);
		
		System.out.println("Dibujando las figuras");
		for(Figura fAux : listaFiguras) {
			//Gracias al sistema de herencia y al polimorfismo
			//me resulta muy facil trabajar con este array para
			//dibuarlo o para calcular su area
			fAux.dibujar();
		}
		
		System.out.println("Calculando el area de las figuras");
		for(Figura fAux : listaFiguras) {
			if(fAux instanceof Figura2D) {
				Figura2D fig2D = (Figura2D)fAux;
				fig2D.calcularArea();
			}
			
		}
	}
	
}
