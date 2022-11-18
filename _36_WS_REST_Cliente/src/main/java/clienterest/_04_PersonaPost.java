package clienterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import modelo.entidad.Persona;

public class _04_PersonaPost {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a nuestra conexión POST de personas");
			System.out.println("-------------------------------------------------------");
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca los apellidos: ");
			String apellidos = sc.nextLine();
			System.out.println("Introduzca la edad: ");
			int edad = sc.nextInt();
			
			Persona p = new Persona();
			p.setNombre(nombre);
			p.setApellidos(apellidos);
			p.setEdad(edad);
			
			Gson gson = new Gson();
			String jsonPersona = gson.toJson(p);
			System.out.println("Salida del cliente en json: " + jsonPersona);
			
			URL url = new URL("http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);//Habilitamos el OutputStream de salida
			conn.setRequestMethod("POST");
			//Establecemos la cabera content-type con el mime type JSON
			conn.setRequestProperty("Content-Type", "application/json");

			conn.connect();
			
			//Como ahora si que hay mensaje en el body, debemos de usar el 
			//OutputStream
			OutputStream os = conn.getOutputStream();
			//Para mandar un string por el stream de salida debemos de pasarlo a bytes
			//El metodo write escribe en el stream de salida
			os.write(jsonPersona.getBytes());
			//Envia lo que haya en el stream de salida al servicio
			os.flush();
			
			if (conn.getResponseCode() != 201) {
				System.out.println("Mensaje del servidor: " + conn.getResponseCode());
			}else {
				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String output = br.readLine();
					
				System.out.println("Salida del servidor en bruto....");
				System.out.println(output);
		
				Persona persona = gson.fromJson(output, Persona.class);
				
				System.out.println("Salida del servidor convertida a objeto persona....");
				System.out.println(persona);
			}

			conn.disconnect();
			sc.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}