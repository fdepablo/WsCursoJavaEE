package main;

import com.google.gson.Gson;

import beans.Persona;

public class _01_ObjetoAJson {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setIdPersona(3);
		p1.setNombre("Harry");
		p1.setEdad(18);
		p1.setApellido("Potter");
		
		//podriamos convertir el json a mano... (estas flipando, ni de co�a)		
		System.out.println("{\"idpersona\" : " + p1.getIdPersona() + 
			",\"nombre\" : " + p1.getEdad() + "}");
		
		//mejor usar la librerias de GSON que hacen eso por nosotros
		Gson gson = new Gson();
		String json = gson.toJson(p1);
		System.out.println("-----------------");
		System.out.println(json);
	}
}
