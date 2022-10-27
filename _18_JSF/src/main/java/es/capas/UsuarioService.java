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
	
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
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
