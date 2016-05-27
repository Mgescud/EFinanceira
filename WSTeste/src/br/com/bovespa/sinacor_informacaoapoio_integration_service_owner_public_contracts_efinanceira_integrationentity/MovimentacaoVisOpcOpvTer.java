
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Movimentacao_VisOpcOpvTer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Movimentacao_VisOpcOpvTer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentoCustodia">
 *       &lt;sequence>
 *         &lt;element name="CodigoIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataMovimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataNegociacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IndicadorContabilMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDistribuicao" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="NumeroExtrato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TipoMercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movimentacao_VisOpcOpvTer", propOrder = {
    "codigoIsin",
    "dataMovimento",
    "dataNegociacao",
    "indicadorContabilMovimento",
    "numeroDistribuicao",
    "numeroExtrato",
    "tipoMercado",
    "tipoMovimento"
})
public class MovimentacaoVisOpcOpvTer
    extends MovimentoCustodia
{

    @XmlElementRef(name = "CodigoIsin", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIsin;
    @XmlElement(name = "DataMovimento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataMovimento;
    @XmlElement(name = "DataNegociacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNegociacao;
    @XmlElementRef(name = "IndicadorContabilMovimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorContabilMovimento;
    @XmlElement(name = "NumeroDistribuicao")
    protected Short numeroDistribuicao;
    @XmlElementRef(name = "NumeroExtrato", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroExtrato;
    @XmlElementRef(name = "TipoMercado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoMercado;
    @XmlElementRef(name = "TipoMovimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoMovimento;

    /**
     * Obtém o valor da propriedade codigoIsin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIsin() {
        return codigoIsin;
    }

    /**
     * Define o valor da propriedade codigoIsin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIsin(JAXBElement<String> value) {
        this.codigoIsin = value;
    }

    /**
     * Obtém o valor da propriedade dataMovimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataMovimento() {
        return dataMovimento;
    }

    /**
     * Define o valor da propriedade dataMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataMovimento(XMLGregorianCalendar value) {
        this.dataMovimento = value;
    }

    /**
     * Obtém o valor da propriedade dataNegociacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNegociacao() {
        return dataNegociacao;
    }

    /**
     * Define o valor da propriedade dataNegociacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNegociacao(XMLGregorianCalendar value) {
        this.dataNegociacao = value;
    }

    /**
     * Obtém o valor da propriedade indicadorContabilMovimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorContabilMovimento() {
        return indicadorContabilMovimento;
    }

    /**
     * Define o valor da propriedade indicadorContabilMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorContabilMovimento(JAXBElement<String> value) {
        this.indicadorContabilMovimento = value;
    }

    /**
     * Obtém o valor da propriedade numeroDistribuicao.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroDistribuicao() {
        return numeroDistribuicao;
    }

    /**
     * Define o valor da propriedade numeroDistribuicao.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroDistribuicao(Short value) {
        this.numeroDistribuicao = value;
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
     * Obtém o valor da propriedade tipoMercado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoMercado() {
        return tipoMercado;
    }

    /**
     * Define o valor da propriedade tipoMercado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoMercado(JAXBElement<String> value) {
        this.tipoMercado = value;
    }

    /**
     * Obtém o valor da propriedade tipoMovimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoMovimento() {
        return tipoMovimento;
    }

    /**
     * Define o valor da propriedade tipoMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoMovimento(JAXBElement<String> value) {
        this.tipoMovimento = value;
    }

}
