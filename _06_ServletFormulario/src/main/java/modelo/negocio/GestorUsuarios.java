package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Usuario;

//Logica de negocio
/**
 * Clase que lleva el control de los usuarios registrados en la app
 * @author Felix de Pablo
 * @version 1.0
 * 
 */
public class GestorUsuarios {
	
	//Es estatica para que solo haya una lista en toda la aplicación
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	//La documentación en java se crea poniendo '/**'
	/**
	 * Metodo que add un usuario a la lista de usuarios si el email
	 * no esta vacio
	 * @param usuario representa el usuario a dar de alta en el la lista
	 * @return true en caso de que el email este relleno, false en caso
	 * contrario
	 */
	public boolean registrar(Usuario usuario){
		//Habria que comprobar que no este repetido el email
		if(!"".equals(usuario.getEmail())) {
			listaUsuarios.add(usuario);
			return true;
		}
		return false;
	}
	
	public List<Usuario> getListUsuarios(){
		return listaUsuarios;
	}
}
