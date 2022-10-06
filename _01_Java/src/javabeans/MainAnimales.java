package javabeans;

import java.util.ArrayList;

public class MainAnimales {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setNombre("Yogui");
		animal.setTipo("Oso");
		animal.setEdad(8);

		System.out.println(animal.getNombre());
		//por defecto, System.out.println invoca el metodo toString()
		System.out.println(animal);
		
		Zoo zoo = new Zoo();
		zoo.setNombre("Jurasic Park");
		Direccion d1 = new Direccion();
		d1.setNombreVia("Gran via");
		d1.setTipoVia("Calle");
		d1.setCiudad("Madrid");
		
		zoo.setDireccion(d1);
		
		ArrayList<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(animal);
		zoo.setListaAnimales(listaAnimales);
		
		animal.setNombre("Bubu");
		System.out.println(listaAnimales.get(0).getNombre());//Yogui Bubu
		zoo.getListaAnimales().get(0).setNombre("Amoroso");
		System.out.println(animal.getNombre());//Bubu Yogui o Amoroso
		
		animal = new Animal();
		animal.setNombre("Juancho");
		animal.setTipo("Lagarto");
		animal.setEdad(12);

		System.out.println(listaAnimales.get(0).getNombre());//Amoroso Juancho
	
		Animal animal2 = new Animal();
		System.out.println(animal2.getEdad());
		
		Animal animal3 = new Animal("Robustiano","Trucha",4);
		System.out.println(animal3);
	}

}
