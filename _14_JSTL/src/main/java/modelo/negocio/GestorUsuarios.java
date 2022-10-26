package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Usuario;

public class GestorUsuarios {
	private static List<Usuario> listaUsuarios;
	
	//Los bloques esticos son bloques que se ejecutan una única vez
	//al principio de la aplicación java, antes incluso que el 
	//propio método main.
	static{
		System.out.println("Cargando lista de usuarios al arrancar el Tomcat");
		//Normalmente estos datos vienen de BBDD
		listaUsuarios = new ArrayList<>();
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("felix");
		usuario.setPassword("1234");
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setId(2);
		usuario.setNombre("marta");
		usuario.setPassword("4321");
		listaUsuarios.add(usuario);
	}
	
	public List<Usuario> getListaUsuarios(){
		return listaUsuarios;
	}
	
	public boolean validarUsuario(Usuario usuario){
		for(Usuario usuarioAux : listaUsuarios){
			if(usuarioAux.getNombre().equals(usuario.getNombre())){
				if(usuarioAux.getPassword().equals(usuario.getPassword())){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
