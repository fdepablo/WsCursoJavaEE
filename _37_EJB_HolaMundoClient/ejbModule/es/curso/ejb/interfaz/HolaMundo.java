package es.curso.ejb.interfaz;

import javax.ejb.Remote;

//Para dar de alta una interfaz que sea usada por otras aplicaciones, creamos
//una interfaz y la anotamos con @javax.ejb.Remote

//Esto es obligatorio siempre que queramos hacer un EJB que sea consumido por
//otras aplicaciones.

@Remote
public interface HolaMundo {
    public String bienvenida();
}