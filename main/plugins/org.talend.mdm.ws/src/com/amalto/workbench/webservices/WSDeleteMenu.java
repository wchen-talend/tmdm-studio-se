
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsMenuPK" type="{http://www.talend.com/mdm}WSMenuPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteMenu", propOrder = {
    "wsMenuPK"
})
public class WSDeleteMenu {

    protected WSMenuPK wsMenuPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDeleteMenu() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDeleteMenu(final WSMenuPK wsMenuPK) {
        this.wsMenuPK = wsMenuPK;
    }

    /**
     * Gets the value of the wsMenuPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSMenuPK }
     *     
     */
    public WSMenuPK getWsMenuPK() {
        return wsMenuPK;
    }

    /**
     * Sets the value of the wsMenuPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMenuPK }
     *     
     */
    public void setWsMenuPK(WSMenuPK value) {
        this.wsMenuPK = value;
    }

}
