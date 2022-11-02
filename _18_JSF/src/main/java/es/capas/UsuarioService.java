package es.capas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class UsuarioService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Al ser este objeto de scope Application, será común a todos
	//los usuarios de mi aplicación
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	/**
	 * Metodo que comprueba si un objeto usuario tiene sus atributos vacios
	 * @param usuario representa el objeto usuario a validar
	 * @return <b>true</b> en caso de que tanto el nombre como el password tengan
	 * valor distinto de vacio. <b>false</b> en caso de que el nombre del usuario
	 * o el password del usuario estén vacios
	 */
	public boolean alta(Usuario usuario) {
		if(!usuario.getNombre().isBlank() && !usuario.getPassword().isBlank()) {
			listaUsuarios.add(usuario);
			return true;
		}
		
		return false;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}	
}
