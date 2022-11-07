package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _00_ProbarConexioinPersonaJPA {
	public static void main(String[] args) {
		//Este ejemplo es para probar la conexión y crear las tablas
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPARelaciones");
		
		EntityManager em = factoria.createEntityManager();
		System.out.println("Prueba de conexión satisfactoria");
	}
}
