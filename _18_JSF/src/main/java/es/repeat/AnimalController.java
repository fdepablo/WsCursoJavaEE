package es.repeat;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AnimalController {
	
	private String nombreAnimal;
	
	public List<Animal> getListaAnimales(){
		List<Animal> listaAnimales = new ArrayList<>();
		
		Animal animal = new Animal();
		
		animal.setNombre("Pepe");
		animal.setTipoAnimal("Tiburon");
		animal.setEdad(23);
		
		listaAnimales.add(animal);
		
		animal = new Animal();
		animal.setNombre("Paco");
		animal.setTipoAnimal("Perro");
		animal.setEdad(5);
		
		listaAnimales.add(animal);
		
		animal = new Animal();
		animal.setNombre("Lola");
		animal.setTipoAnimal("Periquito");
		animal.setEdad(2);
		
		listaAnimales.add(animal);
		
		return listaAnimales;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}
	
	
	public String mandarAnimal(){
		System.out.println("Nombre de Animal Mandado: " + nombreAnimal);
		return null;
	}
	public String mandarAnimal(Animal animal){
		System.out.println("Animal Mandado: " + animal.getNombre() + "," + animal.getTipoAnimal());
		return null;
	}
}
