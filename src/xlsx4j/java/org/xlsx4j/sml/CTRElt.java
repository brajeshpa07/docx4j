
package org.xlsx4j.sml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_RElt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_RElt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rPr" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_RPrElt" minOccurs="0"/>
 *         &lt;element name="t" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Xstring_Whitespace"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_RElt", propOrder = {
    "rPr",
    "t"
})
public class CTRElt implements Child
{

    protected CTRPrElt rPr;
    @XmlElement(required = true)
    protected CTXstringWhitespace t;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the rPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTRPrElt }
     *     
     */
    public CTRPrElt getRPr() {
        return rPr;
    }

    /**
     * Sets the value of the rPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTRPrElt }
     *     
     */
    public void setRPr(CTRPrElt value) {
        this.rPr = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link CTXstringWhitespace }
     *     
     */
    public CTXstringWhitespace getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTXstringWhitespace }
     *     
     */
    public void setT(CTXstringWhitespace value) {
        this.t = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
