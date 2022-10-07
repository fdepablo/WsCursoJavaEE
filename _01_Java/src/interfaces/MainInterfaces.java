package interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainInterfaces {

	public static void main(String[] args) {
		//Las interfaces no se pueden instanciar
		//Movible m = new Movible();
		
		//Al igual que las clases abstractas,
		//las interfaces cumplen la segunda regla
		//de la herencia
		Movible m = new Caballo();
		Movible m2 = new Avion();
		
		Caballo c1 = new Caballo();
		c1.moverseRapido();
		System.out.println(c1.getPosicion());
		
		Avion a1 = new Avion();
		a1.moverseRapido();
		System.out.println(a1.getPosicion());
		
		List<Movible> listaMovibles = new ArrayList<>();
		listaMovibles.add(a1);
		listaMovibles.add(c1);
		
		for(Movible m3 : listaMovibles) {
			m3.moverseRapido();
		}
		
		System.out.println(a1.getPosicion());
		System.out.println(c1.getPosicion());
	}

}
