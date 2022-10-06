package herencia;

//Para saber si una clase extiende de otra, responde a la pregunta
//"es un" y se pondría con la palabra reservada "extends"

//En java no existe el concepto de herencia multiple, es decir,
//solo podemos extender de una clase
public class Coche extends Vehiculo{
	//Automaticamente acabamos de heredar todos los atributos
	//y metodos de la clase vehiculo
	
	private String modeloRadio;

	public String getModeloRadio() {
		return modeloRadio;
	}

	public void setModeloRadio(String modeloRadio) {
		this.modeloRadio = modeloRadio;
	}

	@Override
	public String toString() {
		return "Coche [modeloRadio=" + modeloRadio + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getMatricula()=" + getMatricula() + "]";
	}
	
	
}
