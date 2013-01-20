
package org.xlsx4j.sml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_GroupItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GroupItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="m" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Missing"/>
 *         &lt;element name="n" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Number"/>
 *         &lt;element name="b" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Boolean"/>
 *         &lt;element name="e" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Error"/>
 *         &lt;element name="s" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_String"/>
 *         &lt;element name="d" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_DateTime"/>
 *       &lt;/choice>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GroupItems", propOrder = {
    "mOrNOrB"
})
public class CTGroupItems implements Child
{

    @XmlElements({
        @XmlElement(name = "m", type = CTMissing.class),
        @XmlElement(name = "n", type = CTNumber.class),
        @XmlElement(name = "b", type = CTBoolean.class),
        @XmlElement(name = "e", type = CTError.class),
        @XmlElement(name = "s", type = CTString.class),
        @XmlElement(name = "d", type = CTDateTime.class)
    })
    protected List<Object> mOrNOrB;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long count;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the mOrNOrB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mOrNOrB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMOrNOrB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMissing }
     * {@link CTNumber }
     * {@link CTBoolean }
     * {@link CTError }
     * {@link CTString }
     * {@link CTDateTime }
     * 
     * 
     */
    public List<Object> getMOrNOrB() {
        if (mOrNOrB == null) {
            mOrNOrB = new ArrayList<Object>();
        }
        return this.mOrNOrB;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
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
