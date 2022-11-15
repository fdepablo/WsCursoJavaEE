package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import beans.Persona;

public class _04_FicheroJsonAListaObjetos {
	public static void main(String[] args) {
		File file = new File("simpson.json");
		
		try(FileReader fr = new FileReader(file);//con FileReader solo podemos leer caracter a caracter
		    BufferedReader br = new BufferedReader(fr)){//Es muy habitual utilizar una clase que pueda leer frases (BufferedReader)
			String json = br.readLine();
			Gson gson = new Gson();
			//Para trabajar con listas debemos usar las clases Type y TypeToken
			Type type = new TypeToken<List<Persona>>(){}.getType();
			List<Persona> grupoPersonas = gson.fromJson(json, type);

			System.out.println("Lista Personas");
			for(Persona p : grupoPersonas) {
				System.out.println(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
