package javabeans;

//Las importaciones van antes de la definicion de las clases
import java.util.ArrayList;

public class Zoo {
	private String nombre;
	//Siempre que una clase respecto a otra responda a la pregunta
	//"tiene un", va como atributo de clase
	private Direccion direccion;
	//Siempre que useis una clase que no este dentro de vuestro
	//mismo paquete, debeís de importarla
	//Hay una excepción, las clases que estan en el paquete
	//java.lang no hace falta importarlas
	private ArrayList<Animal> listaAnimales;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Animal> getListaAnimales() {
		return listaAnimales;
	}
	public void setListaAnimales(ArrayList<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}

	
	
}
