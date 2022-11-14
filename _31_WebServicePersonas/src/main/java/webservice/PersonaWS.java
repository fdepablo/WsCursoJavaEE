package webservice;

import java.util.List;

import javax.jws.WebService;

import entidad.Persona;

@WebService
public interface PersonaWS {
	public void alta(Persona persona);
	public Persona obtener(int id);
	public boolean baja(int id);
	public List<Persona> listar();
}
