package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Persona;

public class _03_ObtenerPersonaJPA {
	public static void main(String[] args) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		
		//Como ahora no vamos a modificar la BBDD no tenemos porque abrir un entorno de transaccionalidad
		//las busquedas por defecto son por clave primar�a
		System.out.println("Lanzando query!");
		Persona p = em.find(Persona.class, 1);
		System.out.println(p);
		
		System.out.println("Lanzando query!");
		p = em.find(Persona.class, 2);
		System.out.println(p);
		
		System.out.println("Lanzando query! Ahora no!!");
		//em.clear();//Borrramos la cache del contexto de persitencias
		em.detach(p);//Borramos solamente el objeto al que apuntamos con p del CP
		p = em.find(Persona.class, 2);
		System.out.println(p);
		
		System.out.println("Lanzando query!");
		p = em.find(Persona.class, 5);
		System.out.println(p);
		
		em.close();
		
		//Si creo otro entity manager, ya no tendriamos los objetos cacheados
		System.out.println("Nuevo EM!");
		em = factoria.createEntityManager();
		System.out.println("Lanzando query! Ahora si!");
		p = em.find(Persona.class, 2);
		System.out.println(p);
		
		em.close();
		
		System.out.println("Fin de obtener persona " + p);
	}
}
