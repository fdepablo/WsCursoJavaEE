package es.selecciones;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckBoxManagedBean{
	
	private boolean marcado = false;
	private boolean mostrarMarcar = false;
	
	private List<String> listaNumerosSeleccionados;
	
	//Representa un array con las frutas que ha elegido un usuario
	private List<String> listaFrutasSeleccionadas;
	
	//Representa todas las frutas totales, esto se suele sacar de una base 
	//de datos
	public List<String> getListaCheckBox(){
		List<String> listaCheckBox = new ArrayList<>();
		listaCheckBox.add("Naranja");
		listaCheckBox.add("Platano");
		listaCheckBox.add("Piña");
		listaCheckBox.add("Manzana");

		return listaCheckBox;
	}	
	
	//Los boolean en notación JavaBean, su 'get' es 'is'
	public boolean isMarcado() {
		return marcado;
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}
	
	public String continuar(){
		if(marcado){
			return "resultadoCheckBox";
		}else{
			mostrarMarcar = true;
			listaFrutasSeleccionadas = null;
			return null;//volvemos a la página actual
		}
	}

	public List<String> getListaFrutasSeleccionadas() {
		return listaFrutasSeleccionadas;
	}

	public void setListaFrutasSeleccionadas(List<String> listaFrutasSeleccionadas) {
		this.listaFrutasSeleccionadas = listaFrutasSeleccionadas;
	}

	public boolean isMostrarMarcar() {
		return mostrarMarcar;
	}

	public void setMostrarMarcar(boolean mostrarMarcar) {
		this.mostrarMarcar = mostrarMarcar;
	}

	public List<String> getListaNumerosSeleccionados() {
		return listaNumerosSeleccionados;
	}

	public void setListaNumerosSeleccionados(List<String> listaNumerosSeleccionados) {
		this.listaNumerosSeleccionados = listaNumerosSeleccionados;
	}
}
