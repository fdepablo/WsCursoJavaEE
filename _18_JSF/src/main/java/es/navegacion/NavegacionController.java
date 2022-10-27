package es.navegacion;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NavegacionController {
	
	private String palabra;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String validar(){
		if(palabra.equalsIgnoreCase("pepe")){
			return "fallo";
		}else{
			return "exito";
		}
	}
}
