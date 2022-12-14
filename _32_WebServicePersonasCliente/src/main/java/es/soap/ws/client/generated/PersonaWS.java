
package es.soap.ws.client.generated;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PersonaWS", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonaWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "baja", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.Baja")
    @ResponseWrapper(localName = "bajaResponse", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.BajaResponse")
    public boolean baja(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<es.soap.ws.client.generated.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.ListarResponse")
    public List<Persona> listar();

    /**
     * 
     * @param arg0
     * @return
     *     returns es.soap.ws.client.generated.Persona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtener", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.Obtener")
    @ResponseWrapper(localName = "obtenerResponse", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.ObtenerResponse")
    public Persona obtener(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "alta", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.Alta")
    @ResponseWrapper(localName = "altaResponse", targetNamespace = "http://webservice/", className = "es.soap.ws.client.generated.AltaResponse")
    public void alta(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

}
