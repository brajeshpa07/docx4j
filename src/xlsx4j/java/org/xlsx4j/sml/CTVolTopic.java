
package org.xlsx4j.sml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_VolTopic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VolTopic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v" type="{http://schemas.openxmlformats.org/officeDocument/2006/sharedTypes}ST_Xstring"/>
 *         &lt;element name="stp" type="{http://schemas.openxmlformats.org/officeDocument/2006/sharedTypes}ST_Xstring" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tr" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_VolTopicRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="t" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_VolValueType" default="n" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VolTopic", propOrder = {
    "v",
    "stp",
    "tr"
})
public class CTVolTopic implements Child
{

    @XmlElement(required = true)
    protected String v;
    protected List<String> stp;
    @XmlElement(required = true)
    protected List<CTVolTopicRef> tr;
    @XmlAttribute(name = "t")
    protected STVolValueType t;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV(String value) {
        this.v = value;
    }

    /**
     * Gets the value of the stp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStp() {
        if (stp == null) {
            stp = new ArrayList<String>();
        }
        return this.stp;
    }

    /**
     * Gets the value of the tr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVolTopicRef }
     * 
     * 
     */
    public List<CTVolTopicRef> getTr() {
        if (tr == null) {
            tr = new ArrayList<CTVolTopicRef>();
        }
        return this.tr;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link STVolValueType }
     *     
     */
    public STVolValueType getT() {
        if (t == null) {
            return STVolValueType.N;
        } else {
            return t;
        }
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVolValueType }
     *     
     */
    public void setT(STVolValueType value) {
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
