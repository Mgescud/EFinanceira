
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentoResponse;


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
 *         &lt;element name="ConsultaMovCCResult" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response}MovimentoResponse" minOccurs="0"/>
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
    "consultaMovCCResult"
})
@XmlRootElement(name = "ConsultaMovCCResponse")
public class ConsultaMovCCResponse {

    @XmlElementRef(name = "ConsultaMovCCResult", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentoResponse> consultaMovCCResult;

    /**
     * Obtém o valor da propriedade consultaMovCCResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}
     *     
     */
    public JAXBElement<MovimentoResponse> getConsultaMovCCResult() {
        return consultaMovCCResult;
    }

    /**
     * Define o valor da propriedade consultaMovCCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}
     *     
     */
    public void setConsultaMovCCResult(JAXBElement<MovimentoResponse> value) {
        this.consultaMovCCResult = value;
    }

}
