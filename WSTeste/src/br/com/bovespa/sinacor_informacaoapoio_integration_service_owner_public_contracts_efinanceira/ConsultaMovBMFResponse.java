
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
 *         &lt;element name="ConsultaMovBMFResult" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response}MovimentoResponse" minOccurs="0"/>
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
    "consultaMovBMFResult"
})
@XmlRootElement(name = "ConsultaMovBMFResponse")
public class ConsultaMovBMFResponse {

    @XmlElementRef(name = "ConsultaMovBMFResult", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentoResponse> consultaMovBMFResult;

    /**
     * Obtém o valor da propriedade consultaMovBMFResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}
     *     
     */
    public JAXBElement<MovimentoResponse> getConsultaMovBMFResult() {
        return consultaMovBMFResult;
    }

    /**
     * Define o valor da propriedade consultaMovBMFResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}
     *     
     */
    public void setConsultaMovBMFResult(JAXBElement<MovimentoResponse> value) {
        this.consultaMovBMFResult = value;
    }

}
