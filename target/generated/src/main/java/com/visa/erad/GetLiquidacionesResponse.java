
package com.visa.erad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLiquidacionesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLiquidacionesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liquidacionesResponse" type="{http://erad.visa.com/}liquidacionesResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLiquidacionesResponse", propOrder = {
    "liquidacionesResponse"
})
public class GetLiquidacionesResponse {

    @XmlElement(namespace = "http://erad.visa.com/")
    protected LiquidacionesResponse liquidacionesResponse;

    /**
     * Gets the value of the liquidacionesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidacionesResponse }
     *     
     */
    public LiquidacionesResponse getLiquidacionesResponse() {
        return liquidacionesResponse;
    }

    /**
     * Sets the value of the liquidacionesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidacionesResponse }
     *     
     */
    public void setLiquidacionesResponse(LiquidacionesResponse value) {
        this.liquidacionesResponse = value;
    }

}
