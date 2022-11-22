package es.curso.ejb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

//En este caso vamos a crear un EJB local y singleton.

//Al ser local NO necesitamos una interfaz (aunque podemos tenerla)
//ya que no vamos a tener un cliente para acceder al EJB.
//Un EJB local lo declaramos con la anotación @javax.ejb.LocalBean

//El tipo que vamos a usar para este EJB es de tipo @Singleton,
//es decir, el objeto será único para toda la aplicación (como un Servlet)

@Singleton
@LocalBean
public class GestorFrasesEJB{

	private List<String> listaFrases = new ArrayList<>();
	
	public GestorFrasesEJB() {
		listaFrases.add("Un poder implica una gran responsabilidad");
		listaFrases.add("Eureka!");
	}
	
	public void escribir(String frase) {
		System.out.println("escribir -> Escribiendo: " + frase);
		System.out.println("escribir -> " + this);
		listaFrases.add(frase);
	}

	public String obtenerFraseAleatoria() {
		int posicion = numeroAleatorio(listaFrases.size());
		System.out.println("obtenerFraseAleatoria -> buscando posicion aleatoria: " + posicion);
		System.out.println("obtenerFraseAleatoria -> " + this);
		return listaFrases.get(posicion);
	}

	public List<String> obtenerFrases() {
		System.out.println("obtenerFrases -> Listando frases");
		//Muestro el hash del objeto al que estoy accediendo
		//Esto es una prueba para ver si el objeto que estoy usando es el mismo
		System.out.println("obtenerFrases -> " + this);
		return listaFrases;
	}

	/**
	 * Método que devuelve un numero aleatorio desde el 0 hasta el 
	 * valor pasado -1
	 * @param max
	 * @return
	 */
	public int numeroAleatorio(int max){
		Random rand = new Random();
        int numeroAleatorio = rand.nextInt(max);
        return numeroAleatorio;

	}
}
