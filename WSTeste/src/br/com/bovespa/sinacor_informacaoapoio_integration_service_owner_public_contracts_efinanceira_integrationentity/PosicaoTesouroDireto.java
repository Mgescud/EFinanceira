
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
 * <p>Classe Java de PosicaoTesouroDireto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PosicaoTesouroDireto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}Base">
 *       &lt;sequence>
 *         &lt;element name="DataPosicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumeroExtrato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Quantidade" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TipoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PosicaoTesouroDireto", propOrder = {
    "dataPosicao",
    "dataVencimento",
    "numeroExtrato",
    "quantidade",
    "tipoTitulo",
    "valorPosicao"
})
public class PosicaoTesouroDireto
    extends Base
{

    @XmlElementRef(name = "DataPosicao", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataPosicao;
    @XmlElement(name = "DataVencimento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    @XmlElement(name = "NumeroExtrato")
    protected Integer numeroExtrato;
    @XmlElementRef(name = "Quantidade", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> quantidade;
    @XmlElementRef(name = "TipoTitulo", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTitulo;
    @XmlElementRef(name = "ValorPosicao", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorPosicao;

    /**
     * Obtém o valor da propriedade dataPosicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Define o valor da propriedade dataPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataPosicao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataPosicao = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade numeroExtrato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroExtrato() {
        return numeroExtrato;
    }

    /**
     * Define o valor da propriedade numeroExtrato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroExtrato(Integer value) {
        this.numeroExtrato = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setQuantidade(JAXBElement<Float> value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade tipoTitulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTitulo() {
        return tipoTitulo;
    }

    /**
     * Define o valor da propriedade tipoTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTitulo(JAXBElement<String> value) {
        this.tipoTitulo = value;
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
