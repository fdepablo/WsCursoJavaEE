package es.ajax;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AjaxController implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer numero1,numero2;

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public String getResultado() {
		//Con este evitamos que cuando se cargue la página ejecute la tarea
		//ya que el resultado es insertado en un campo de texto
		if(numero1 != null && numero2 != null){
			System.out.println("Calculando suma...");
			int resultado = numero1 + numero2;
			return String.valueOf(resultado);
		}else{
			return "";
		}
	}

}
