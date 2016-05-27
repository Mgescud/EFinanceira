
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentacaoDetalhada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoDetalhada">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoFinanceiraCC">
 *       &lt;sequence>
 *         &lt;element name="Credito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CreditoMesmaTitularidade" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Debito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="DebitoMesmaTitularidade" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ValorDisponivelFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoDetalhada", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", propOrder = {
    "credito",
    "creditoMesmaTitularidade",
    "debito",
    "debitoMesmaTitularidade",
    "valorDisponivelFinal"
})
public class MovimentacaoDetalhada
    extends MovimentacaoFinanceiraCC
{

    @XmlElementRef(name = "Credito", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> credito;
    @XmlElementRef(name = "CreditoMesmaTitularidade", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> creditoMesmaTitularidade;
    @XmlElementRef(name = "Debito", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> debito;
    @XmlElementRef(name = "DebitoMesmaTitularidade", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> debitoMesmaTitularidade;
    @XmlElementRef(name = "ValorDisponivelFinal", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorDisponivelFinal;

    /**
     * Obtém o valor da propriedade credito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getCredito() {
        return credito;
    }

    /**
     * Define o valor da propriedade credito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setCredito(JAXBElement<Float> value) {
        this.credito = value;
    }

    /**
     * Obtém o valor da propriedade creditoMesmaTitularidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getCreditoMesmaTitularidade() {
        return creditoMesmaTitularidade;
    }

    /**
     * Define o valor da propriedade creditoMesmaTitularidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setCreditoMesmaTitularidade(JAXBElement<Float> value) {
        this.creditoMesmaTitularidade = value;
    }

    /**
     * Obtém o valor da propriedade debito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDebito() {
        return debito;
    }

    /**
     * Define o valor da propriedade debito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDebito(JAXBElement<Float> value) {
        this.debito = value;
    }

    /**
     * Obtém o valor da propriedade debitoMesmaTitularidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDebitoMesmaTitularidade() {
        return debitoMesmaTitularidade;
    }

    /**
     * Define o valor da propriedade debitoMesmaTitularidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDebitoMesmaTitularidade(JAXBElement<Float> value) {
        this.debitoMesmaTitularidade = value;
    }

    /**
     * Obtém o valor da propriedade valorDisponivelFinal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorDisponivelFinal() {
        return valorDisponivelFinal;
    }

    /**
     * Define o valor da propriedade valorDisponivelFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorDisponivelFinal(JAXBElement<Float> value) {
        this.valorDisponivelFinal = value;
    }

}
