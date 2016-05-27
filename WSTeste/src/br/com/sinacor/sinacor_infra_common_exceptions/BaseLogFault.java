
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BaseLogFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseLogFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts}BaseFault">
 *       &lt;sequence>
 *         &lt;element name="LogData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLogFault", propOrder = {
    "logData",
    "sourceAddress"
})
@XmlSeeAlso({
    ValidationFault.class,
    BaseErrorNumberFault.class,
    InvalidSessionFault.class,
    AccessIsDeniedFault.class
})
public class BaseLogFault
    extends BaseFault
{

    @XmlElementRef(name = "LogData", namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logData;
    @XmlElementRef(name = "SourceAddress", namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceAddress;

    /**
     * Obtém o valor da propriedade logData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogData() {
        return logData;
    }

    /**
     * Define o valor da propriedade logData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogData(JAXBElement<String> value) {
        this.logData = value;
    }

    /**
     * Obtém o valor da propriedade sourceAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Define o valor da propriedade sourceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceAddress(JAXBElement<String> value) {
        this.sourceAddress = value;
    }

}
