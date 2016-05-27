
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultaDeclaradosBovespaResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "consultaDeclaradosBovespaResult"
})
@XmlRootElement(name = "ConsultaDeclaradosBovespaResponse")
public class ConsultaDeclaradosBovespaResponse {

    @XmlElementRef(name = "ConsultaDeclaradosBovespaResult", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> consultaDeclaradosBovespaResult;

    /**
     * Obtém o valor da propriedade consultaDeclaradosBovespaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getConsultaDeclaradosBovespaResult() {
        return consultaDeclaradosBovespaResult;
    }

    /**
     * Define o valor da propriedade consultaDeclaradosBovespaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setConsultaDeclaradosBovespaResult(JAXBElement<ArrayOfstring> value) {
        this.consultaDeclaradosBovespaResult = value;
    }

}
