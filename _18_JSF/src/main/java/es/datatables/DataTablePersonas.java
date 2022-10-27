package es.datatables;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataTablePersonas {
	
	private static List<Persona> listaPersonas;
	
	//Normalmente estos datos vienen de una base de datos
	static{
		listaPersonas = new ArrayList<Persona>();
		Persona p = new Persona();
		p.setDni("55443322");
		p.setNombre("Felix");
		listaPersonas.add(p);
		
		p = new Persona();
		p.setDni("22998877");
		p.setNombre("Manuel");
		listaPersonas.add(p);
	}
	
	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}
	public void setListaPersonas(List<Persona> listaPersonas) {
		DataTablePersonas.listaPersonas = listaPersonas;
	}
	
	public String borrarPersona(Persona p){
		listaPersonas.remove(p);
		return null;
	}
	
	public String addPersona(Persona p){
		System.out.println("Persona: "+p.getNombre() + " " + p.getDni());
		listaPersonas.add(p);
		return null;
	}
	
}
