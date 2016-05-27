
package br.com.sinacor.sinacor_infra_common_validation._2008._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Classe Java de ValidationError complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ValidationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResourceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationError", propOrder = {
    "errorNumber",
    "resourceKey",
    "errorMessage",
    "parameters"
})
public class ValidationError {

    @XmlElement(name = "ErrorNumber")
    protected int errorNumber;
    @XmlElement(name = "ResourceKey", required = true, nillable = true)
    protected String resourceKey;
    @XmlElement(name = "ErrorMessage", required = true, nillable = true)
    protected String errorMessage;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected ArrayOfanyType parameters;

    /**
     * Obtém o valor da propriedade errorNumber.
     * 
     */
    public int getErrorNumber() {
        return errorNumber;
    }

    /**
     * Define o valor da propriedade errorNumber.
     * 
     */
    public void setErrorNumber(int value) {
        this.errorNumber = value;
    }

    /**
     * Obtém o valor da propriedade resourceKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceKey() {
        return resourceKey;
    }

    /**
     * Define o valor da propriedade resourceKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceKey(String value) {
        this.resourceKey = value;
    }

    /**
     * Obtém o valor da propriedade errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define o valor da propriedade errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setParameters(ArrayOfanyType value) {
        this.parameters = value;
    }

}
