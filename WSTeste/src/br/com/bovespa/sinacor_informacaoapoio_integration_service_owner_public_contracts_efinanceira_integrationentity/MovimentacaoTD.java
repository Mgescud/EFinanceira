
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de MovimentacaoTD complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoTD">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentoCustodia">
 *       &lt;sequence>
 *         &lt;element name="DataMovimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataNegocio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataOrigem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NaturezaOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroExtrato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TipoTitularidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ValorDebito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoTD", propOrder = {
    "dataMovimento",
    "dataNegocio",
    "dataOrigem",
    "dataVencimento",
    "naturezaOperacao",
    "numeroExtrato",
    "tipoTitularidade",
    "valorCredito",
    "valorDebito"
})
public class MovimentacaoTD
    extends MovimentoCustodia
{

    @XmlElementRef(name = "DataMovimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataMovimento;
    @XmlElementRef(name = "DataNegocio", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataNegocio;
    @XmlElementRef(name = "DataOrigem", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataOrigem;
    @XmlElementRef(name = "DataVencimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataVencimento;
    @XmlElementRef(name = "NaturezaOperacao", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naturezaOperacao;
    @XmlElementRef(name = "NumeroExtrato", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroExtrato;
    @XmlElementRef(name = "TipoTitularidade", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTitularidade;
    @XmlElementRef(name = "ValorCredito", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorCredito;
    @XmlElementRef(name = "ValorDebito", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorDebito;

    /**
     * Obtém o valor da propriedade dataMovimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataMovimento() {
        return dataMovimento;
    }

    /**
     * Define o valor da propriedade dataMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataMovimento(JAXBElement<XMLGregorianCalendar> value) {
        this.dataMovimento = value;
    }

    /**
     * Obtém o valor da propriedade dataNegocio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNegocio() {
        return dataNegocio;
    }

    /**
     * Define o valor da propriedade dataNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNegocio(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNegocio = value;
    }

    /**
     * Obtém o valor da propriedade dataOrigem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataOrigem() {
        return dataOrigem;
    }

    /**
     * Define o valor da propriedade dataOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataOrigem(JAXBElement<XMLGregorianCalendar> value) {
        this.dataOrigem = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataVencimento(JAXBElement<XMLGregorianCalendar> value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade naturezaOperacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaturezaOperacao() {
        return naturezaOperacao;
    }

    /**
     * Define o valor da propriedade naturezaOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaturezaOperacao(JAXBElement<String> value) {
        this.naturezaOperacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroExtrato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroExtrato() {
        return numeroExtrato;
    }

    /**
     * Define o valor da propriedade numeroExtrato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroExtrato(JAXBElement<Integer> value) {
        this.numeroExtrato = value;
    }

    /**
     * Obtém o valor da propriedade tipoTitularidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTitularidade() {
        return tipoTitularidade;
    }

    /**
     * Define o valor da propriedade tipoTitularidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTitularidade(JAXBElement<String> value) {
        this.tipoTitularidade = value;
    }

    /**
     * Obtém o valor da propriedade valorCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorCredito() {
        return valorCredito;
    }

    /**
     * Define o valor da propriedade valorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorCredito(JAXBElement<Float> value) {
        this.valorCredito = value;
    }

    /**
     * Obtém o valor da propriedade valorDebito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorDebito() {
        return valorDebito;
    }

    /**
     * Define o valor da propriedade valorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorDebito(JAXBElement<Float> value) {
        this.valorDebito = value;
    }

}
