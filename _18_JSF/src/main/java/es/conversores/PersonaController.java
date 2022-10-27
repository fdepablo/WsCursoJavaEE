package es.conversores;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PersonaController{
	
	private Persona personaEscogida;
	
	public List<Persona> getListaPersonas(){
		List<Persona> listaPersona = new ArrayList<Persona>();
		Persona p = new Persona();
		p.setDni("52765922R");
		p.setNombre("Steve Rogers");
		listaPersona.add(p);
		
		p = new Persona();
		p.setDni("78937373P");
		p.setNombre("Tony Stark");
		listaPersona.add(p);
		
		return listaPersona;
	}	
	
	public Persona getPersonaEscogida() {
		return personaEscogida;
	}

	public void setPersonaEscogida(Persona personaEscogida) {
		this.personaEscogida = personaEscogida;
	}

	public String enviar(){
		System.out.println(personaEscogida.getDni() + " " + personaEscogida.getNombre());
		return null;
	}
}
