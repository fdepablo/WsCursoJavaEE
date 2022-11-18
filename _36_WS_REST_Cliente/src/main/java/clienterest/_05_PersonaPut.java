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

public class _05_PersonaPut {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a nuestra conexión PUT de personas");
			System.out.println("-------------------------------------------------------");
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca los apellidos: ");
			String apellidos = sc.nextLine();
			System.out.println("Introduzca la edad: ");
			int edad = sc.nextInt();
			System.out.println("Introduzca el id: ");
			int id = sc.nextInt();
			
			Persona p = new Persona();
			p.setNombre(nombre);
			p.setApellidos(apellidos);
			p.setEdad(edad);
			
			Gson gson = new Gson();
			String jsonPersona = gson.toJson(p);
			System.out.println("Salida del cliente en json: " + jsonPersona);
			
			URL url = new URL("http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/" + id);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			conn.setRequestProperty("Content-Type", "application/json");

			conn.connect();
			
			OutputStream os = conn.getOutputStream();
			os.write(jsonPersona.getBytes());
			os.flush();
			
			if (conn.getResponseCode() != 200) {
				System.out.println("Mensaje del servidor: " + conn.getResponseCode());
			}else {
				System.out.println("Exito, la persona se ha modificado satisfactoriamente");
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