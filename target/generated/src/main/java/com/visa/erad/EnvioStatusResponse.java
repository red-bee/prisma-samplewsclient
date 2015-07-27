
package com.visa.erad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for envioStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="envioStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://erad.visa.com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="envios" type="{http://erad.visa.com/}envio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envioStatusResponse", propOrder = {
    "envios"
})
public class EnvioStatusResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<Envio> envios;

    /**
     * Gets the value of the envios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the envios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Envio }
     * 
     * 
     */
    public List<Envio> getEnvios() {
        if (envios == null) {
            envios = new ArrayList<Envio>();
        }
        return this.envios;
    }

}
