
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintValidationErrory2K04Te1;


/**
 * <p>Classe Java de ValidationFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ValidationFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts}BaseLogFault">
 *       &lt;sequence>
 *         &lt;element name="ValidationErrors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintValidationErrory2K04te1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationFault", propOrder = {
    "validationErrors"
})
public class ValidationFault
    extends BaseLogFault
{

    @XmlElementRef(name = "ValidationErrors", namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintValidationErrory2K04Te1> validationErrors;

    /**
     * Obtém o valor da propriedade validationErrors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintValidationErrory2K04Te1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintValidationErrory2K04Te1> getValidationErrors() {
        return validationErrors;
    }

    /**
     * Define o valor da propriedade validationErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintValidationErrory2K04Te1 }{@code >}
     *     
     */
    public void setValidationErrors(JAXBElement<ArrayOfKeyValueOfintValidationErrory2K04Te1> value) {
        this.validationErrors = value;
    }

}
