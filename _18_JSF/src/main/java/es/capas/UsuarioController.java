package es.capas;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean
public class UsuarioController{
	
	//Inyección de dependencias mediante una propiedad gestionada
	@ManagedProperty(value="#{usuarioService}")
	private UsuarioService usuarioService;
	
	private String nombre;
	private String password;

	public String alta() {
		//En este caso creo un usuario para pasarselo al UsuarioController y 
		//validarlo. OJO! No cofundir el objeto Usuario de scope Session que es
		//gestionado por JSF
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		boolean alta = usuarioService.alta(usuario);
		if(alta) {
			return "principal";
		}else {
			FacesMessage message = new FacesMessage("El nombre y el password no pueden estar "
					+ "vacios");
			//Si devolvemos null en el addMessage, entonces no asociamos el error a ningun
			//componente
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
