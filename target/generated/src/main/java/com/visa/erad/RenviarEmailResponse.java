
package com.visa.erad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for renviarEmailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="renviarEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reenvioResponse" type="{http://erad.visa.com/}reenvioResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renviarEmailResponse", propOrder = {
    "reenvioResponse"
})
public class RenviarEmailResponse {

    @XmlElement(namespace = "http://erad.visa.com/")
    protected ReenvioResponse reenvioResponse;

    /**
     * Gets the value of the reenvioResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReenvioResponse }
     *     
     */
    public ReenvioResponse getReenvioResponse() {
        return reenvioResponse;
    }

    /**
     * Sets the value of the reenvioResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReenvioResponse }
     *     
     */
    public void setReenvioResponse(ReenvioResponse value) {
        this.reenvioResponse = value;
    }

}
