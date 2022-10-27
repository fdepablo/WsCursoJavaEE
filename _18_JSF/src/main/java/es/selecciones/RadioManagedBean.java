package es.selecciones;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioManagedBean{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public List<String> getListaColores(){
		List<String> listaColores = new ArrayList<String>();
		listaColores.add("Color Rojo");
		listaColores.add("Color Verde");
		listaColores.add("Color Azul");
		return listaColores;
	}
	
}
