package es.curso.ejb;

import javax.ejb.Stateless;

import es.curso.ejb.interfaz.HolaMundo;

//Para crear el EJB, creamos una clase que implemente la interfaz del EJB Cliente
//A continuación anotamos el EJB para que sea de algún tipo. En este caso va a 
//ser de tipo Session Stateless (para este ejemplo no importa el tipo)

@Stateless
public class HolaMundoEJB implements HolaMundo {

    @Override
    public String bienvenida() {
    	System.out.println("HolaMundoEJB -> Método bienvenida invocado");
        return "Bienvenidos al tutorial de EJB!";
    }
}