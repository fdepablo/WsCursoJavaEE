package clases;

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
}
