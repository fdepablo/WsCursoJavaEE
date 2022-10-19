package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

public class GestorMultiplicacion {
	
	public List<Integer> calcularTabla(int numero){
		List<Integer> tablaMultiplicar = new ArrayList<>();
		
		for(int i = 1;i<=10;i++){
			int auxNumero = i * numero;
			tablaMultiplicar.add(auxNumero);
		}
		
		return tablaMultiplicar;
	}
}
