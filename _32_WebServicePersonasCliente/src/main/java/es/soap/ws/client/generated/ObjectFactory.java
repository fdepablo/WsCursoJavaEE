
package es.soap.ws.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Alta_QNAME = new QName("http://webservice/", "alta");
    private final static QName _AltaResponse_QNAME = new QName("http://webservice/", "altaResponse");
    private final static QName _Baja_QNAME = new QName("http://webservice/", "baja");
    private final static QName _BajaResponse_QNAME = new QName("http://webservice/", "bajaResponse");
    private final static QName _Listar_QNAME = new QName("http://webservice/", "listar");
    private final static QName _ListarResponse_QNAME = new QName("http://webservice/", "listarResponse");
    private final static QName _Obtener_QNAME = new QName("http://webservice/", "obtener");
    private final static QName _ObtenerResponse_QNAME = new QName("http://webservice/", "obtenerResponse");
    private final static QName _Persona_QNAME = new QName("http://webservice/", "persona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alta }
     * 
     */
    public Alta createAlta() {
        return new Alta();
    }

    /**
     * Create an instance of {@link AltaResponse }
     * 
     */
    public AltaResponse createAltaResponse() {
        return new AltaResponse();
    }

    /**
     * Create an instance of {@link Baja }
     * 
     */
    public Baja createBaja() {
        return new Baja();
    }

    /**
     * Create an instance of {@link BajaResponse }
     * 
     */
    public BajaResponse createBajaResponse() {
        return new BajaResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Obtener }
     * 
     */
    public Obtener createObtener() {
        return new Obtener();
    }

    /**
     * Create an instance of {@link ObtenerResponse }
     * 
     */
    public ObtenerResponse createObtenerResponse() {
        return new ObtenerResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Alta }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "alta")
    public JAXBElement<Alta> createAlta(Alta value) {
        return new JAXBElement<Alta>(_Alta_QNAME, Alta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "altaResponse")
    public JAXBElement<AltaResponse> createAltaResponse(AltaResponse value) {
        return new JAXBElement<AltaResponse>(_AltaResponse_QNAME, AltaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Baja }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Baja }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "baja")
    public JAXBElement<Baja> createBaja(Baja value) {
        return new JAXBElement<Baja>(_Baja_QNAME, Baja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BajaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "bajaResponse")
    public JAXBElement<BajaResponse> createBajaResponse(BajaResponse value) {
        return new JAXBElement<BajaResponse>(_BajaResponse_QNAME, BajaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtener }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtener }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtener")
    public JAXBElement<Obtener> createObtener(Obtener value) {
        return new JAXBElement<Obtener>(_Obtener_QNAME, Obtener.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtenerResponse")
    public JAXBElement<ObtenerResponse> createObtenerResponse(ObtenerResponse value) {
        return new JAXBElement<ObtenerResponse>(_ObtenerResponse_QNAME, ObtenerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

}
