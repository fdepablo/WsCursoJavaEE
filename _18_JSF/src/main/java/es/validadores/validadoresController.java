package es.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class validadoresController{
	
	private String texto1;
	private Integer entero1;
	private String password;
	
	public String getTexto1() {
		return texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public Integer getEntero1() {
		return entero1;
	}

	public void setEntero1(Integer entero1) {
		this.entero1 = entero1;
	}
	
	//Podemos aplicar nuestras propias validaciones
	public String validar(){
		if(entero1 == 33){
			FacesMessage message = new FacesMessage("El numero no puede ser 33");
			FacesContext.getCurrentInstance().addMessage("formulario:inputText2", message);
		}else{
			System.out.println("Pasamos, los valores son: " + texto1 + "-" + entero1 + "-" + password);
		}
		return null;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
