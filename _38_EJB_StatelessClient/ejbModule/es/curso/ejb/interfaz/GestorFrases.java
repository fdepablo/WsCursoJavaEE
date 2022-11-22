package es.curso.ejb.interfaz;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface GestorFrases {
	
	public void escribir(String frase);
	public String obtenerFraseAleatoria();
	public List<String> obtenerFrases();
	
}
