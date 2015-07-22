
package com.visa.erad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLiquidacionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLiquidacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liquidacionResponse" type="{http://erad.visa.com/}liquidacionResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLiquidacionResponse", propOrder = {
    "liquidacionResponse"
})
public class GetLiquidacionResponse {

    @XmlElement(namespace = "http://erad.visa.com/")
    protected LiquidacionResponse liquidacionResponse;

    /**
     * Gets the value of the liquidacionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidacionResponse }
     *     
     */
    public LiquidacionResponse getLiquidacionResponse() {
        return liquidacionResponse;
    }

    /**
     * Sets the value of the liquidacionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidacionResponse }
     *     
     */
    public void setLiquidacionResponse(LiquidacionResponse value) {
        this.liquidacionResponse = value;
    }

}
