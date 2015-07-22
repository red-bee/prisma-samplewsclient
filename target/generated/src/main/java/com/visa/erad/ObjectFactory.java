
package com.visa.erad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.visa.erad package. 
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

    private final static QName _SetGrailsApplication_QNAME = new QName("http://erad.visa.com/", "setGrailsApplication");
    private final static QName _GetGrailsApplicationResponse_QNAME = new QName("http://erad.visa.com/", "getGrailsApplicationResponse");
    private final static QName _GetRepositoryServiceResponse_QNAME = new QName("http://erad.visa.com/", "getRepositoryServiceResponse");
    private final static QName _SetRepositoryService_QNAME = new QName("http://erad.visa.com/", "setRepositoryService");
    private final static QName _SetRepositoryServiceResponse_QNAME = new QName("http://erad.visa.com/", "setRepositoryServiceResponse");
    private final static QName _GetLiquidacion_QNAME = new QName("http://erad.visa.com/", "getLiquidacion");
    private final static QName _GetLiquidaciones_QNAME = new QName("http://erad.visa.com/", "getLiquidaciones");
    private final static QName _GetLiquidacionesResponse_QNAME = new QName("http://erad.visa.com/", "getLiquidacionesResponse");
    private final static QName _GetRepositoryService_QNAME = new QName("http://erad.visa.com/", "getRepositoryService");
    private final static QName _SetGrailsApplicationResponse_QNAME = new QName("http://erad.visa.com/", "setGrailsApplicationResponse");
    private final static QName _GetGrailsApplication_QNAME = new QName("http://erad.visa.com/", "getGrailsApplication");
    private final static QName _GetLiquidacionResponse_QNAME = new QName("http://erad.visa.com/", "getLiquidacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.visa.erad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetGrailsApplication }
     * 
     */
    public SetGrailsApplication createSetGrailsApplication() {
        return new SetGrailsApplication();
    }

    /**
     * Create an instance of {@link GetGrailsApplicationResponse }
     * 
     */
    public GetGrailsApplicationResponse createGetGrailsApplicationResponse() {
        return new GetGrailsApplicationResponse();
    }

    /**
     * Create an instance of {@link GetRepositoryServiceResponse }
     * 
     */
    public GetRepositoryServiceResponse createGetRepositoryServiceResponse() {
        return new GetRepositoryServiceResponse();
    }

    /**
     * Create an instance of {@link SetRepositoryService }
     * 
     */
    public SetRepositoryService createSetRepositoryService() {
        return new SetRepositoryService();
    }

    /**
     * Create an instance of {@link SetRepositoryServiceResponse }
     * 
     */
    public SetRepositoryServiceResponse createSetRepositoryServiceResponse() {
        return new SetRepositoryServiceResponse();
    }

    /**
     * Create an instance of {@link GetLiquidacion }
     * 
     */
    public GetLiquidacion createGetLiquidacion() {
        return new GetLiquidacion();
    }

    /**
     * Create an instance of {@link GetRepositoryService }
     * 
     */
    public GetRepositoryService createGetRepositoryService() {
        return new GetRepositoryService();
    }

    /**
     * Create an instance of {@link GetLiquidacionesResponse }
     * 
     */
    public GetLiquidacionesResponse createGetLiquidacionesResponse() {
        return new GetLiquidacionesResponse();
    }

    /**
     * Create an instance of {@link GetLiquidaciones }
     * 
     */
    public GetLiquidaciones createGetLiquidaciones() {
        return new GetLiquidaciones();
    }

    /**
     * Create an instance of {@link SetGrailsApplicationResponse }
     * 
     */
    public SetGrailsApplicationResponse createSetGrailsApplicationResponse() {
        return new SetGrailsApplicationResponse();
    }

    /**
     * Create an instance of {@link GetLiquidacionResponse }
     * 
     */
    public GetLiquidacionResponse createGetLiquidacionResponse() {
        return new GetLiquidacionResponse();
    }

    /**
     * Create an instance of {@link GetGrailsApplication }
     * 
     */
    public GetGrailsApplication createGetGrailsApplication() {
        return new GetGrailsApplication();
    }

    /**
     * Create an instance of {@link LiquidacionWS }
     * 
     */
    public LiquidacionWS createLiquidacionWS() {
        return new LiquidacionWS();
    }

    /**
     * Create an instance of {@link LiquidacionesResponse }
     * 
     */
    public LiquidacionesResponse createLiquidacionesResponse() {
        return new LiquidacionesResponse();
    }

    /**
     * Create an instance of {@link LiquidacionResponse }
     * 
     */
    public LiquidacionResponse createLiquidacionResponse() {
        return new LiquidacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrailsApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "setGrailsApplication")
    public JAXBElement<SetGrailsApplication> createSetGrailsApplication(SetGrailsApplication value) {
        return new JAXBElement<SetGrailsApplication>(_SetGrailsApplication_QNAME, SetGrailsApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrailsApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getGrailsApplicationResponse")
    public JAXBElement<GetGrailsApplicationResponse> createGetGrailsApplicationResponse(GetGrailsApplicationResponse value) {
        return new JAXBElement<GetGrailsApplicationResponse>(_GetGrailsApplicationResponse_QNAME, GetGrailsApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepositoryServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getRepositoryServiceResponse")
    public JAXBElement<GetRepositoryServiceResponse> createGetRepositoryServiceResponse(GetRepositoryServiceResponse value) {
        return new JAXBElement<GetRepositoryServiceResponse>(_GetRepositoryServiceResponse_QNAME, GetRepositoryServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRepositoryService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "setRepositoryService")
    public JAXBElement<SetRepositoryService> createSetRepositoryService(SetRepositoryService value) {
        return new JAXBElement<SetRepositoryService>(_SetRepositoryService_QNAME, SetRepositoryService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRepositoryServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "setRepositoryServiceResponse")
    public JAXBElement<SetRepositoryServiceResponse> createSetRepositoryServiceResponse(SetRepositoryServiceResponse value) {
        return new JAXBElement<SetRepositoryServiceResponse>(_SetRepositoryServiceResponse_QNAME, SetRepositoryServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getLiquidacion")
    public JAXBElement<GetLiquidacion> createGetLiquidacion(GetLiquidacion value) {
        return new JAXBElement<GetLiquidacion>(_GetLiquidacion_QNAME, GetLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLiquidaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getLiquidaciones")
    public JAXBElement<GetLiquidaciones> createGetLiquidaciones(GetLiquidaciones value) {
        return new JAXBElement<GetLiquidaciones>(_GetLiquidaciones_QNAME, GetLiquidaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLiquidacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getLiquidacionesResponse")
    public JAXBElement<GetLiquidacionesResponse> createGetLiquidacionesResponse(GetLiquidacionesResponse value) {
        return new JAXBElement<GetLiquidacionesResponse>(_GetLiquidacionesResponse_QNAME, GetLiquidacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepositoryService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getRepositoryService")
    public JAXBElement<GetRepositoryService> createGetRepositoryService(GetRepositoryService value) {
        return new JAXBElement<GetRepositoryService>(_GetRepositoryService_QNAME, GetRepositoryService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrailsApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "setGrailsApplicationResponse")
    public JAXBElement<SetGrailsApplicationResponse> createSetGrailsApplicationResponse(SetGrailsApplicationResponse value) {
        return new JAXBElement<SetGrailsApplicationResponse>(_SetGrailsApplicationResponse_QNAME, SetGrailsApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrailsApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getGrailsApplication")
    public JAXBElement<GetGrailsApplication> createGetGrailsApplication(GetGrailsApplication value) {
        return new JAXBElement<GetGrailsApplication>(_GetGrailsApplication_QNAME, GetGrailsApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLiquidacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erad.visa.com/", name = "getLiquidacionResponse")
    public JAXBElement<GetLiquidacionResponse> createGetLiquidacionResponse(GetLiquidacionResponse value) {
        return new JAXBElement<GetLiquidacionResponse>(_GetLiquidacionResponse_QNAME, GetLiquidacionResponse.class, null, value);
    }

}
