
package com.visa.erad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLiquidacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liquidacionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLiquidacion", propOrder = {
    "liquidacionID"
})
public class GetLiquidacion {

    protected String liquidacionID;

    /**
     * Gets the value of the liquidacionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidacionID() {
        return liquidacionID;
    }

    /**
     * Sets the value of the liquidacionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidacionID(String value) {
        this.liquidacionID = value;
    }

}
