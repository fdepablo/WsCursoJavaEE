package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.entidad.Persona;

public class _06_RefreshPersonaJPA {
	public static void main(String[] args) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		
		//Como ahora no vamos a modificar la BBDD no tenemos porque abrir un entorno de transaccionalidad
		//las busquedas por defecto son por clave primar�a
		System.out.println("Lanzando query!");
		Persona p = em.find(Persona.class, 1);
		System.out.println(p);
		p.setEdad(190);
		p.setNombre("Steve Roger");
		System.out.println(p);
		System.out.println(em.contains(p));
		em.refresh(p);
		System.out.println(p);
		em.close();
		
		System.out.println("Fin de modificar persona");
	}
}
