package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.entidad.Persona;

public class _02_ModificarPersonaJPA {
	public static void main(String[] args) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		
		Persona persona = new Persona();
		persona.setId(3);//por defecto la modificacion es sobre clave primaria
		persona.setNombre("Navajita platea");
		persona.setEdad(90);
		persona.setPeso(70);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(persona);
		et.commit();
		//et.rollback();//Desahace todos los flush de una BBDD
		
		em.close();
		
		System.out.println("Fin de modificar persona");
	}
}
