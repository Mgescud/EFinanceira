
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultaDeclaradoResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringDeclaradoia3_Ss9NZ" minOccurs="0"/>
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
    "consultaDeclaradoResult"
})
@XmlRootElement(name = "ConsultaDeclaradoResponse")
public class ConsultaDeclaradoResponse {

    @XmlElementRef(name = "ConsultaDeclaradoResult", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ> consultaDeclaradoResult;

    /**
     * Obt�m o valor da propriedade consultaDeclaradoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ> getConsultaDeclaradoResult() {
        return consultaDeclaradoResult;
    }

    /**
     * Define o valor da propriedade consultaDeclaradoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ }{@code >}
     *     
     */
    public void setConsultaDeclaradoResult(JAXBElement<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ> value) {
        this.consultaDeclaradoResult = value;
    }

}
