
package org.xlsx4j.sml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Fill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Fill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="patternFill" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_PatternFill" minOccurs="0"/>
 *         &lt;element name="gradientFill" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_GradientFill" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Fill", propOrder = {
    "patternFill",
    "gradientFill"
})
public class CTFill implements Child
{

    protected CTPatternFill patternFill;
    protected CTGradientFill gradientFill;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the patternFill property.
     * 
     * @return
     *     possible object is
     *     {@link CTPatternFill }
     *     
     */
    public CTPatternFill getPatternFill() {
        return patternFill;
    }

    /**
     * Sets the value of the patternFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPatternFill }
     *     
     */
    public void setPatternFill(CTPatternFill value) {
        this.patternFill = value;
    }

    /**
     * Gets the value of the gradientFill property.
     * 
     * @return
     *     possible object is
     *     {@link CTGradientFill }
     *     
     */
    public CTGradientFill getGradientFill() {
        return gradientFill;
    }

    /**
     * Sets the value of the gradientFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGradientFill }
     *     
     */
    public void setGradientFill(CTGradientFill value) {
        this.gradientFill = value;
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
