
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BaseErrorNumberFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseErrorNumberFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts}BaseLogFault">
 *       &lt;sequence>
 *         &lt;element name="ErrorNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseErrorNumberFault", propOrder = {
    "errorNumber",
    "resourceKey"
})
@XmlSeeAlso({
    BusinessFault.class,
    LicensingFault.class,
    GeneralFault.class
})
public class BaseErrorNumberFault
    extends BaseLogFault
{

    @XmlElement(name = "ErrorNumber")
    protected Integer errorNumber;
    @XmlElementRef(name = "ResourceKey", namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceKey;

    /**
     * Obtém o valor da propriedade errorNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorNumber() {
        return errorNumber;
    }

    /**
     * Define o valor da propriedade errorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorNumber(Integer value) {
        this.errorNumber = value;
    }

    /**
     * Obtém o valor da propriedade resourceKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceKey() {
        return resourceKey;
    }

    /**
     * Define o valor da propriedade resourceKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceKey(JAXBElement<String> value) {
        this.resourceKey = value;
    }

}
