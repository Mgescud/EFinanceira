
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Classe Java de BusinessFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts}BaseErrorNumberFault">
 *       &lt;sequence>
 *         &lt;element name="Parameters" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessFault", propOrder = {
    "parameters"
})
public class BusinessFault
    extends BaseErrorNumberFault
{

    @XmlElementRef(name = "Parameters", namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> parameters;

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ArrayOfanyType> value) {
        this.parameters = value;
    }

}
