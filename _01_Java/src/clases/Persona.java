package clases;

import java.util.ArrayList;

/*
 * Una clase es un molde para crear objetos en poo
 * Un objeto se define como la instancia de una clase
 * 
 * Una clase puede tener atributos y métodos
 * Los atributos representan estados de una clase, y definen
 * propiedades de las mismas
 */
public class Persona {
	//Los atributos pueden ser variables y se definen al principio
	//de la clase (normalmente)
	public String nombre;
	public int edad;
	public double peso;
	
	//visibilidades de los atributos y metodos
	//En java tenemos 4 tipos de visibilidades, pero a efectos practicos
	//tenemos 2, public y private
	//public. podemos acceder al metodo o atributo desde cualquier parte
	//private. solo podemos acceder al metodo o atributo desde la propia
	//clase
	
	private String sexo;
	
	//Los atributos esticos no pertenecen a los objetos, pertenecen a la
	//clase. Se puede entender como que es un atributo comun a todos
	//los objetos
	//Su ciclo de vida sera todo el programa
	public static int numeroPersonas;
	
	//Existen tambien los bloques estaticos dentro de las clases
	//Son muy utilies cuando no tenemos en nuestra aplicación
	//un metodo main (es cuando creamos aplicaciones web)
	static {
		//Este bloque se puede poner en cualquier clase
		//y se ejecuta antes del método main del programa
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona());
		listaPersonas.add(new Persona());
	}
	
	//Los metodos representan acciones que pueden hacer los objetos
	public void presentarse() {
		System.out.println("Hola me llamo " + nombre + ", tengo " + edad + " años y peso "
				+ peso + " kilos. Soy de sexo: " + sexo);
	}
	
	public void setSexo(String sexo) {
		//aqui dentro tengo un atributo sexo y un parametro sexo
		//para hacer referencia a los atributos podemos usar
		//la palabra reservada "this" que es una referencia al propio
		//objeto
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	//Tambien existen los métodos estaticos
	public static void imprimirNumeroTotalPersonas() {
		System.out.println("El numero de personas es " + numeroPersonas);
		//Dentro de un metodo estatico no podemos acceder a los
		//metodos o atributos NO estaticos, solo a los estaticos
		//System.out.println(nombre);
		//presentarse();
		
		//tampoco tiene sentido la referencia "this"
		//This es una referencia al propio objeto
		//this.edad = 56;
		
		//Lo que si puedes hacer es crear objetos
		//Persona p = new Persona();
		//p.edad = 45;
	}
	

}
