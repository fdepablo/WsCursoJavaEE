package prueba;

import java.util.ArrayList;
import java.util.List;

public class MainMavenPrueba {
	public static void main(String[] args) {
		System.out.println("Hola Mundo Maven!!! :)");
		List<String> listaString = new ArrayList<String>();
		listaString.add("Primer String");
		listaString.add("Segundo String");
		//Si intento utilizar alguna caracteristica de java 1.8 me daria error
		//ya que maven por defecto utiliza java 1.5
		listaString.forEach(v -> System.out.println(v));
	}
}
