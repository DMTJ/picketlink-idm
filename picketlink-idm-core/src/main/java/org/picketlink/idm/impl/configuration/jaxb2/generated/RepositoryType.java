//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.18 at 03:00:04 PM CET 
//


package org.picketlink.idm.impl.configuration.jaxb2.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for repositoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repositoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="external-config" type="{urn:picketlink:idm:config:v1_0_0_ga}external-configType" minOccurs="0"/>
 *         &lt;element name="default-identity-store-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="default-attribute-store-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identity-store-mappings" type="{urn:picketlink:idm:config:v1_0_0_ga}identity-store-mappingsType" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:picketlink:idm:config:v1_0_0_ga}optionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryType", propOrder = {
    "id",
    "clazz",
    "externalConfig",
    "defaultIdentityStoreId",
    "defaultAttributeStoreId",
    "identityStoreMappings",
    "options"
})
public class RepositoryType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String id;

    @XmlElement(name = "class", required = true)
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String clazz;

    @XmlElement(name = "external-config")
    protected ExternalConfigType externalConfig;

    @XmlElement(name = "default-identity-store-id")
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String defaultIdentityStoreId;

    @XmlElement(name = "default-attribute-store-id")
    @XmlJavaTypeAdapter(SystemPropertiesSubstitutionAdapter.class)
    protected String defaultAttributeStoreId;

    @XmlElement(name = "identity-store-mappings")
    protected IdentityStoreMappingsType identityStoreMappings;
    protected OptionsType options;

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
     * Gets the value of the defaultIdentityStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultIdentityStoreId() {
        return defaultIdentityStoreId;
    }

    /**
     * Sets the value of the defaultIdentityStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultIdentityStoreId(String value) {
        this.defaultIdentityStoreId = value;
    }

    /**
     * Gets the value of the defaultAttributeStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAttributeStoreId() {
        return defaultAttributeStoreId;
    }

    /**
     * Sets the value of the defaultAttributeStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAttributeStoreId(String value) {
        this.defaultAttributeStoreId = value;
    }

    /**
     * Gets the value of the identityStoreMappings property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityStoreMappingsType }
     *     
     */
    public IdentityStoreMappingsType getIdentityStoreMappings() {
        return identityStoreMappings;
    }

    /**
     * Sets the value of the identityStoreMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityStoreMappingsType }
     *     
     */
    public void setIdentityStoreMappings(IdentityStoreMappingsType value) {
        this.identityStoreMappings = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

}
