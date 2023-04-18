//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.04.15 a las 10:17:16 PM CDT 
//


package https.t4is_uv_mx.saludos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.saludos package. 
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

    private final static QName _BlistaRequest_QNAME = new QName("https://t4is.uv.mx/saludos", "BlistaRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.saludos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ASaludarRequest }
     * 
     */
    public ASaludarRequest createASaludarRequest() {
        return new ASaludarRequest();
    }

    /**
     * Create an instance of {@link ASaludarResponse }
     * 
     */
    public ASaludarResponse createASaludarResponse() {
        return new ASaludarResponse();
    }

    /**
     * Create an instance of {@link BBuscarIdRequest }
     * 
     */
    public BBuscarIdRequest createBBuscarIdRequest() {
        return new BBuscarIdRequest();
    }

    /**
     * Create an instance of {@link BBuscarIdResponse }
     * 
     */
    public BBuscarIdResponse createBBuscarIdResponse() {
        return new BBuscarIdResponse();
    }

    /**
     * Create an instance of {@link BlistaResponse }
     * 
     */
    public BlistaResponse createBlistaResponse() {
        return new BlistaResponse();
    }

    /**
     * Create an instance of {@link CModificarRequest }
     * 
     */
    public CModificarRequest createCModificarRequest() {
        return new CModificarRequest();
    }

    /**
     * Create an instance of {@link CModificarResponse }
     * 
     */
    public CModificarResponse createCModificarResponse() {
        return new CModificarResponse();
    }

    /**
     * Create an instance of {@link DEliminarRequest }
     * 
     */
    public DEliminarRequest createDEliminarRequest() {
        return new DEliminarRequest();
    }

    /**
     * Create an instance of {@link DEliminarResponse }
     * 
     */
    public DEliminarResponse createDEliminarResponse() {
        return new DEliminarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/saludos", name = "BlistaRequest")
    public JAXBElement<Object> createBlistaRequest(Object value) {
        return new JAXBElement<Object>(_BlistaRequest_QNAME, Object.class, null, value);
    }

}
