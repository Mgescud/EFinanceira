
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Posicao_VisOpcOpvTer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Posicao_VisOpcOpvTer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}Base">
 *       &lt;sequence>
 *         &lt;element name="CodigoCarteira" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodigoIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAquisicaoTitulo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumeroDistribuicao" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="QuantidadeDisponivel" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TipoMercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorAquisicaoTitulo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ValorPosicao" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Posicao_VisOpcOpvTer", propOrder = {
    "codigoCarteira",
    "codigoIsin",
    "codigoMercado",
    "codigoNegocio",
    "dataAquisicaoTitulo",
    "numeroDistribuicao",
    "quantidadeDisponivel",
    "tipoMercado",
    "valorAquisicaoTitulo",
    "valorPosicao"
})
public class PosicaoVisOpcOpvTer
    extends Base
{

    @XmlElement(name = "CodigoCarteira")
    protected Integer codigoCarteira;
    @XmlElementRef(name = "CodigoIsin", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIsin;
    @XmlElementRef(name = "CodigoMercado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMercado;
    @XmlElementRef(name = "CodigoNegocio", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocio;
    @XmlElementRef(name = "DataAquisicaoTitulo", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAquisicaoTitulo;
    @XmlElement(name = "NumeroDistribuicao")
    protected Short numeroDistribuicao;
    @XmlElementRef(name = "QuantidadeDisponivel", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> quantidadeDisponivel;
    @XmlElementRef(name = "TipoMercado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoMercado;
    @XmlElementRef(name = "ValorAquisicaoTitulo", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorAquisicaoTitulo;
    @XmlElementRef(name = "ValorPosicao", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorPosicao;

    /**
     * Obtém o valor da propriedade codigoCarteira.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCarteira() {
        return codigoCarteira;
    }

    /**
     * Define o valor da propriedade codigoCarteira.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCarteira(Integer value) {
        this.codigoCarteira = value;
    }

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
     * Obtém o valor da propriedade codigoMercado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMercado() {
        return codigoMercado;
    }

    /**
     * Define o valor da propriedade codigoMercado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMercado(JAXBElement<String> value) {
        this.codigoMercado = value;
    }

    /**
     * Obtém o valor da propriedade codigoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoNegocio() {
        return codigoNegocio;
    }

    /**
     * Define o valor da propriedade codigoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoNegocio(JAXBElement<String> value) {
        this.codigoNegocio = value;
    }

    /**
     * Obtém o valor da propriedade dataAquisicaoTitulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAquisicaoTitulo() {
        return dataAquisicaoTitulo;
    }

    /**
     * Define o valor da propriedade dataAquisicaoTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAquisicaoTitulo(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAquisicaoTitulo = value;
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
     * Obtém o valor da propriedade quantidadeDisponivel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    /**
     * Define o valor da propriedade quantidadeDisponivel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setQuantidadeDisponivel(JAXBElement<Float> value) {
        this.quantidadeDisponivel = value;
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
     * Obtém o valor da propriedade valorAquisicaoTitulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorAquisicaoTitulo() {
        return valorAquisicaoTitulo;
    }

    /**
     * Define o valor da propriedade valorAquisicaoTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorAquisicaoTitulo(JAXBElement<Float> value) {
        this.valorAquisicaoTitulo = value;
    }

    /**
     * Obtém o valor da propriedade valorPosicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorPosicao() {
        return valorPosicao;
    }

    /**
     * Define o valor da propriedade valorPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorPosicao(JAXBElement<Float> value) {
        this.valorPosicao = value;
    }

}
