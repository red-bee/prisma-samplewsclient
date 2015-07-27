
package com.visa.erad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatusEnvioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStatusEnvioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="envioStatusResponse" type="{http://erad.visa.com/}envioStatusResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatusEnvioResponse", propOrder = {
    "envioStatusResponse"
})
public class GetStatusEnvioResponse {

    @XmlElement(namespace = "http://erad.visa.com/")
    protected EnvioStatusResponse envioStatusResponse;

    /**
     * Gets the value of the envioStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EnvioStatusResponse }
     *     
     */
    public EnvioStatusResponse getEnvioStatusResponse() {
        return envioStatusResponse;
    }

    /**
     * Sets the value of the envioStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvioStatusResponse }
     *     
     */
    public void setEnvioStatusResponse(EnvioStatusResponse value) {
        this.envioStatusResponse = value;
    }

}
