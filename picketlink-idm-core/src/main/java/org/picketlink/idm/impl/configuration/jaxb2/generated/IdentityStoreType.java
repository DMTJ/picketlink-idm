//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.18 at 03:00:04 PM CET 
//


package org.picketlink.idm.impl.configuration.jaxb2.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for identity-storeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identity-storeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="external-config" type="{urn:picketlink:idm:config:v1_0_0_ga}external-configType"/>
 *         &lt;element name="supported-relationship-types" type="{urn:picketlink:idm:config:v1_0_0_ga}supported-relationship-typesType"/>
 *         &lt;element name="supported-identity-object-types" type="{urn:picketlink:idm:config:v1_0_0_ga}supported-identity-object-typesType"/>
 *         &lt;element name="options">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="option" type="{urn:picketlink:idm:config:v1_0_0_ga}optionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identity-storeType", propOrder = {
    "id",
    "clazz",
    "externalConfig",
    "supportedRelationshipTypes",
    "supportedIdentityObjectTypes",
    "options"
})
public class IdentityStoreType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String id;

    @XmlElement(name = "class", required = true)
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String clazz;

    @XmlElement(name = "external-config", required = true)
    protected ExternalConfigType externalConfig;
    @XmlElement(name = "supported-relationship-types", required = true)
    protected SupportedRelationshipTypesType supportedRelationshipTypes;
    @XmlElement(name = "supported-identity-object-types", required = true)
    protected SupportedIdentityObjectTypesType supportedIdentityObjectTypes;
    @XmlElement(required = true)
    protected IdentityStoreType.Options options;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the externalConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalConfigType }
     *     
     */
    public ExternalConfigType getExternalConfig() {
        return externalConfig;
    }

    /**
     * Sets the value of the externalConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalConfigType }
     *     
     */
    public void setExternalConfig(ExternalConfigType value) {
        this.externalConfig = value;
    }

    /**
     * Gets the value of the supportedRelationshipTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedRelationshipTypesType }
     *     
     */
    public SupportedRelationshipTypesType getSupportedRelationshipTypes() {
        return supportedRelationshipTypes;
    }

    /**
     * Sets the value of the supportedRelationshipTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedRelationshipTypesType }
     *     
     */
    public void setSupportedRelationshipTypes(SupportedRelationshipTypesType value) {
        this.supportedRelationshipTypes = value;
    }

    /**
     * Gets the value of the supportedIdentityObjectTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedIdentityObjectTypesType }
     *     
     */
    public SupportedIdentityObjectTypesType getSupportedIdentityObjectTypes() {
        return supportedIdentityObjectTypes;
    }

    /**
     * Sets the value of the supportedIdentityObjectTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedIdentityObjectTypesType }
     *     
     */
    public void setSupportedIdentityObjectTypes(SupportedIdentityObjectTypesType value) {
        this.supportedIdentityObjectTypes = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityStoreType.Options }
     *     
     */
    public IdentityStoreType.Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityStoreType.Options }
     *     
     */
    public void setOptions(IdentityStoreType.Options value) {
        this.options = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="option" type="{urn:picketlink:idm:config:v1_0_0_ga}optionType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "option"
    })
    public static class Options {

        protected List<OptionType> option;

        /**
         * Gets the value of the option property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the option property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OptionType }
         * 
         * 
         */
        public List<OptionType> getOption() {
            if (option == null) {
                option = new ArrayList<OptionType>();
            }
            return this.option;
        }

    }

}
