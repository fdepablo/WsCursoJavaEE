package es.curso.persistencia;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import es.curso.entidad.Persona;

//Primero el objeto DAO se encargará de hacer las conexiones a BBDD
//Pero no se encargará de abrir y cerrar las transacciones

//Este DAO lo he dado de alta como objeto EJB singleton 
@Singleton
@LocalBean
public class PersonaDao {

	//Mediante la siguiente anotación le pido que me inyecte un
	//objeto de tipo EntityManager a este objeto
	@PersistenceContext(unitName = "EJB_JPA")
	private EntityManager em;
	
	public int insertar(Persona p) {
		em.persist(p);
		return p.getId();
	}

	public Persona modificar(Persona p) {
		p = em.merge(p);
		return p;
	}

	public int borrar(int id) {
		Persona pAux = buscar(id);
		em.remove(pAux);
		return pAux.getId();
	}
	
	public Persona buscar(int id) {
		return em.find(Persona.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> listar() {
		Query query = em.createQuery("select p from Persona p");
		List<Persona> listaPersonas = query.getResultList();
		return listaPersonas;
	}

}