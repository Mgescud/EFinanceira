
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ConsultaDeclaranteResult" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}Declarante" minOccurs="0"/>
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
    "consultaDeclaranteResult"
})
@XmlRootElement(name = "ConsultaDeclaranteResponse")
public class ConsultaDeclaranteResponse {

    @XmlElementRef(name = "ConsultaDeclaranteResult", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<Declarante> consultaDeclaranteResult;

    /**
     * Obtém o valor da propriedade consultaDeclaranteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Declarante }{@code >}
     *     
     */
    public JAXBElement<Declarante> getConsultaDeclaranteResult() {
        return consultaDeclaranteResult;
    }

    /**
     * Define o valor da propriedade consultaDeclaranteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Declarante }{@code >}
     *     
     */
    public void setConsultaDeclaranteResult(JAXBElement<Declarante> value) {
        this.consultaDeclaranteResult = value;
    }

}
