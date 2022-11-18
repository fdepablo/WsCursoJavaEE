package clienterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//Existen muchas maneras de consumir sericios REST, con estas librerías
//es segun la versión java 8
public class _01_MensajeGet {

	public static void main(String[] args) {

		try {
			//Esta clase es para recoger datos de la consola del usuario
			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a nuestra primera app de conexión al servicio REST");
			System.out.println("-------------------------------------------------------");
			System.out.println("Quiere acceder al texto o al html?");
			
			String recurso = sc.nextLine();
			
			String urlConexión = "http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/mensaje/" + recurso;
			
			//Creamos la URL que nos permitirá conectarnos a nuestro servicio REST
			URL url = new URL(urlConexión);
			//Cuando hacemos una conexión a un ordenador podemos usar muchos protocolos
			//Usaremos un objeto que nos permita hacer conexiones HTTP y nos forme
			//el mensaje HTTP que mandaremos al servidor
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//Asignamos el método HTTP que queremos invocar
			conn.setRequestMethod("GET");

			//Mandamos la request HTTP a nuestro servicio REST
			//Conectión utiliza un objeto llamado OutputStream para mandar
			//la información al servidor (lo que pasa es que no lo vemos)
			conn.connect();
			
			if (conn.getResponseCode() != 200) {
				System.out.println("Mensaje del servidor: " + conn.getResponseCode());
				System.out.println("Mensaje del servidor: " + conn.getResponseMessage());
			}else {
				//Pedimos a la conexión que me de el flujo de entrada de información de mi
				//socket
				InputStream is = conn.getInputStream();
				//Como queremos trabajar con texto vamos a usar un objeto que me
				//permite leer caracter a caracter el body de respuesta del servidor
				//que es InputStreamReador
				InputStreamReader isr = new InputStreamReader(is);
				//Como leer caracter a caracter puede ser muy tedioso, voy a apoyarme
				//en otra clase llamada BufferedReader para leer toda la cadena
				//que me envia el servidor de golpe
				BufferedReader br = new BufferedReader(isr);

				String cadenaEntrada = null;
				System.out.println("Salida del servicio REST ....");
				
				//Vamos leyendo linea a linea el mensaje del servidor hasta
				//que se acaben, es decir, hasta que el servido me devuelva "null"
				while ((cadenaEntrada = br.readLine()) != null) {
					System.out.println(cadenaEntrada);
				}
			}			

			//Por ultimo, cerramos la conexión al servicio
			conn.disconnect();
			//Cerramos el scanner
			sc.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}