package es.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="personaConverter")
public class PersonaConverter implements Converter{

	//Cuando lo queremos mandar de la vista JSF al MB
	//Dentro de arg2 vendrá el string que quiero convertir a Object
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		String[] personaArray = arg2.split("_");
		Persona persona = new Persona();
		persona.setDni(personaArray[0]);
		persona.setNombre(personaArray[1]);
		return persona;
	}

	//Cuando lo queremos mandar desde el MB a la vista JSF
	//Dentro de arg2 vendrá el objeto que quiero convertir a String
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		String respuesta = "";
		Persona persona = (Persona)arg2;
		respuesta += persona.getDni() +"_" + persona.getNombre();

		return respuesta;
	}

}
