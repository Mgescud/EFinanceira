
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentacaoContaCorrente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoContaCorrente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalancoConta" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}ArrayOfMovimentacaoDetalhada" minOccurs="0"/>
 *         &lt;element name="PagamentoAcumulado" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}ArrayOfMovimentacaoSimples" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoContaCorrente", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", propOrder = {
    "balancoConta",
    "pagamentoAcumulado"
})
public class MovimentacaoContaCorrente {

    @XmlElementRef(name = "BalancoConta", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoDetalhada> balancoConta;
    @XmlElementRef(name = "PagamentoAcumulado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoSimples> pagamentoAcumulado;

    /**
     * Obtém o valor da propriedade balancoConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoDetalhada }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoDetalhada> getBalancoConta() {
        return balancoConta;
    }

    /**
     * Define o valor da propriedade balancoConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoDetalhada }{@code >}
     *     
     */
    public void setBalancoConta(JAXBElement<ArrayOfMovimentacaoDetalhada> value) {
        this.balancoConta = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoAcumulado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoSimples }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoSimples> getPagamentoAcumulado() {
        return pagamentoAcumulado;
    }

    /**
     * Define o valor da propriedade pagamentoAcumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoSimples }{@code >}
     *     
     */
    public void setPagamentoAcumulado(JAXBElement<ArrayOfMovimentacaoSimples> value) {
        this.pagamentoAcumulado = value;
    }

}
