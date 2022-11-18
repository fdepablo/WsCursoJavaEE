package clienterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import modelo.entidad.Persona;

public class _03_PersonaGetTodas {

	public static void main(String[] args) {

		try {

			System.out.println("Bienvenido a nuestra conexión GET de todas las personas");
			System.out.println("-------------------------------------------------------");
			System.out.println("Desea filtrar por nombre? Deje en blanco para no filtrar");
			
			Scanner sc = new Scanner(System.in);
			String nombre = sc.nextLine();
			
			String urlCadena = "http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas";
			if(!nombre.isBlank()) {
				urlCadena += "?nombre=" + nombre;
			}
			
			URL url = new URL(urlCadena);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			conn.connect();
			
			if (conn.getResponseCode() != 200) {
				System.out.println("Mensaje del servidor: " + conn.getResponseCode());
			}else {
				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String output = br.readLine();
					
				System.out.println("Salida del servidor en bruto....");
				System.out.println(output);
				
				Gson gson = new Gson();	
				Type tipoLista = new TypeToken<List<Persona>>(){}.getType();
				List<Persona> listaPersonas = gson.fromJson(output, tipoLista);
				
				System.out.println("Salida del servidor convertida a objetos persona....");
				for(Persona p : listaPersonas) {
					System.out.println(p);
				}
			}		

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}