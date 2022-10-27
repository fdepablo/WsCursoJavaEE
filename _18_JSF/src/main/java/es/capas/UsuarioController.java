package es.capas;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean
public class UsuarioController{
	
	@ManagedProperty(value="#{usuarioService}")
	private UsuarioService usuarioService;
	
	private String nombre;
	private String password;

	public String alta() {
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		boolean alta = usuarioService.alta(usuario);
		if(alta) {
			return "principal";
		}else {
			FacesMessage message = new FacesMessage("El usuario tiene que estar relleno");
			FacesContext.getCurrentInstance().addMessage(null, message);
			return null;
		}
	}	
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
