
package org.xlsx4j.sml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Colors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Colors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indexedColors" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_IndexedColors" minOccurs="0"/>
 *         &lt;element name="mruColors" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_MRUColors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Colors", propOrder = {
    "indexedColors",
    "mruColors"
})
public class CTColors implements Child
{

    protected CTIndexedColors indexedColors;
    protected CTMRUColors mruColors;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the indexedColors property.
     * 
     * @return
     *     possible object is
     *     {@link CTIndexedColors }
     *     
     */
    public CTIndexedColors getIndexedColors() {
        return indexedColors;
    }

    /**
     * Sets the value of the indexedColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTIndexedColors }
     *     
     */
    public void setIndexedColors(CTIndexedColors value) {
        this.indexedColors = value;
    }

    /**
     * Gets the value of the mruColors property.
     * 
     * @return
     *     possible object is
     *     {@link CTMRUColors }
     *     
     */
    public CTMRUColors getMruColors() {
        return mruColors;
    }

    /**
     * Sets the value of the mruColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTMRUColors }
     *     
     */
    public void setMruColors(CTMRUColors value) {
        this.mruColors = value;
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
