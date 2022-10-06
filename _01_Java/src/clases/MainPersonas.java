package clases;

public class MainPersonas {

	public static void main(String[] args) {
		//Los objetos los creamos con la palabra reservada new
		//y el nombre de la clase
		new Persona();
		new Persona();
		
		//En java existe un programa que se encarga de borrar
		//objetos (memoria) para evitar que el programa colpase
		//El programa se llama garbage collector.
		
		//El ciclo de vida de un objeto es, desde que haceis el new
		//hasta que el objeto se quede desreferenciado, es decir, no
		//tenga ninguna referencia sobre el.
		Persona p = new Persona();
		//El ciclo de vida de una referencia es desde que se declara
		//hasta que salga del bloque donde se declaro. Un bloque
		//en java esta limitado por '{}'
		if(true) {//siempre entra, no tiene mucho sentido
			Persona p2 = p;
		}//aqui la referencia dejara de existir en el stack
		
		p = null;
		//p2 = new Persona();//error, no existe la variable
		
		p = new Persona();
		p.nombre = "Tony stark";
		p.edad = 45;
		p.peso = 90.0;
		
		Persona p2 = new Persona();
		p2.nombre = "Peter Parker";
		p2.edad = 18;
		p2.peso = 60;
		
		System.out.println(p.nombre);
		System.out.println(p.edad);
		System.out.println(p.peso);
		
		System.out.println(p);
		
		p = p2;
		p2.edad = 50;
		System.out.println(p.edad);//90 60 50
		System.out.println(p2.edad);//90 60 50
		
		String s1 = new String("Felix");
		String s2 = "Lucas";
		s2 = "Hasta luego, " + s2;
		
		int i1 = 5;
		int i2 = 10;
		i1 = i2;
		i2 = 30;		
		System.out.println(i1);//5 10 30
		System.out.println(i2);
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hasta luego");
		sb.append(" Lucas");
		
		String s3 = sb.toString();
		
		p2.presentarse();
		p.presentarse();
		
		p2.setSexo("Varon");
		System.out.println(p2.getSexo());
		p.presentarse();
		
		//Accedemos a los atributos estaticos a traves de la clase
		Persona.numeroPersonas = 2;
		//Mediante los atributos estaticos podemos aproximarnos
		//al concepto de variables globales
		Persona.imprimirNumeroTotalPersonas();
		
		//Quiero invocar el método saludar
		MainPersonas mp = new MainPersonas();
		mp.saludar();
		//p.imprimirNumeroTotalPersonas();
	}
	
	public void saludar() {
		System.out.println("Buenos dias por la mañana!!! :)");
	}

}
