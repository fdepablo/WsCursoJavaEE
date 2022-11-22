package es.curso.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.transaction.Transactional;

import es.curso.entidad.Persona;
import es.curso.persistencia.PersonaDao;

//Este gestor lo vamos a usar para comunicarnos con el Dao y mandar la información


@Singleton
@LocalBean
public class GestorPersonaEJB{
	
	//Inyectamos el objeto EJB PersonaDao al Gestor para que pueda invocar sus métodos
	@EJB
	private PersonaDao personaDao;
	
	//Las transacciones se abren en los objetos de negocio, ya no se abren en los DAOs
	//Siempre que hagamos una modificación en la BBDD debemos de abrir transacción
	//Si ocurre alguna expcepción dentro de este método, se hara un rollback
	//Solo debemos anotar los métodos que cambien la bbdd
	@Transactional
	public boolean insertar(Persona p) {
		//Aqui dentro podriamos llamar a otros EJB para que continuen haciendo
		//lógica de negocio
		if(!p.getNombre().isBlank()) {
			System.out.println("PesonaService -> Guardando la persona " + p);
			personaDao.insertar(p);
			//Habria que continuar llamando al siguiente EJB
			return true;
		}
		
		return false;
	}

	public Persona buscar(int id) {
		return personaDao.buscar(id);
	}

	@Transactional
	public Persona modificar(Persona p) {
		return personaDao.modificar(p);
	}
	
	@Transactional
	public int borrar(int id) {
		return personaDao.borrar(id);
	}

	public List<Persona> listar() {
		return personaDao.listar();
	}
	
	public void inicializar() {
		System.out.println("inicializar -> Inicializando datos...");
		Persona p = new Persona();
		p.setNombre("Steve Rogers");
		p.setEdad(45);
		p.setPeso(80);
		
		personaDao.insertar(p);
		
		p = new Persona();
		p.setNombre("Harry Potter");
		p.setEdad(18);
		p.setPeso(53);
		
		personaDao.insertar(p);
	}
}
