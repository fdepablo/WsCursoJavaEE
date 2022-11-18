package clienterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import modelo.entidad.Persona;

public class _06_PersonaDelete {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a nuestra conexión DELETE de personas");
			System.out.println("-------------------------------------------------------");
			System.out.println("Introduzca el ID a borrar: ");
			
			String id = sc.nextLine();
			
			
			URL url = new URL("http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/" + id);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("DELETE");

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