//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-619 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.19 at 09:03:04 PM CST 
//


package org.picketlink.idm.integration.jboss5.jaxb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sqlInitializerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sqlInitializerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sqlFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exitSQL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sqlInitializerType", propOrder = {
    "sqlFile",
    "exitSQL"
})
public class SqlInitializerType {

    @XmlElement(required = true)
    protected String sqlFile;
    @XmlElement(required = true)
    protected String exitSQL;

    /**
     * Gets the value of the sqlFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlFile() {
        return sqlFile;
    }

    /**
     * Sets the value of the sqlFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlFile(String value) {
        this.sqlFile = value;
    }

    /**
     * Gets the value of the exitSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitSQL() {
        return exitSQL;
    }

    /**
     * Sets the value of the exitSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitSQL(String value) {
        this.exitSQL = value;
    }

}
