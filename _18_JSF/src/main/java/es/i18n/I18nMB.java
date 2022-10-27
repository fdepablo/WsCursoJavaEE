package es.i18n;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class I18nMB {
	
	private String idioma;
	private String nombre;
	private boolean errorNombre;
	
	public List<String> getListaIdiomas(){
		List<String> listaIdiomas = new ArrayList<String>();
		listaIdiomas.add("English");
		listaIdiomas.add("Spanish");
		return listaIdiomas;
	}

	public String cambiarIdioma(){		
		System.out.println("Cambiando a idioma: " + idioma);
		Locale nuevoLocale = obtenerLocale();
		System.out.println("Estableciando el locale... " + nuevoLocale);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(nuevoLocale);		
		System.out.println("Nuevo Locale del contexto: " + FacesContext.getCurrentInstance().getViewRoot().getLocale());
		return null;
	}
	
	public Locale obtenerLocale(){
		Locale locale;
		if(idioma.equals("English")){
			locale = new Locale("en","EN");
		}else if (idioma.equals("Spanish")){
			locale = new Locale("es","ES");
		}else{//Por defecto establecemos el idioma espa�ol
			locale = new Locale("es","ES");
		}
		
		return locale;
	}
	
	public String validarUsuario(){
		ResourceBundle rs = ResourceBundle.getBundle("es/resources/lenguaje",obtenerLocale());
		System.out.println(rs.getString("user.validate"));
		if(nombre.equalsIgnoreCase("pepe")){
			errorNombre = true;
			return null;
		}else{
			return "resultadoInter";
		}
	}

	public boolean isErrorNombre() {
		return errorNombre;
	}

	public void setErrorNombre(boolean errorNombre) {
		this.errorNombre = errorNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
