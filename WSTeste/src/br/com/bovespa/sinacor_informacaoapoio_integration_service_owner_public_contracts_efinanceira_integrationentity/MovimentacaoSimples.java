
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentacaoSimples complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoSimples">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoFinanceiraCC">
 *       &lt;sequence>
 *         &lt;element name="CodigoGrupo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CodigoHistorico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TipoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorLancamento" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoSimples", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", propOrder = {
    "codigoGrupo",
    "codigoHistorico",
    "tipoPagamento",
    "valorLancamento"
})
public class MovimentacaoSimples
    extends MovimentacaoFinanceiraCC
{

    @XmlElement(name = "CodigoGrupo")
    protected Short codigoGrupo;
    @XmlElement(name = "CodigoHistorico")
    protected Integer codigoHistorico;
    @XmlElementRef(name = "TipoPagamento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPagamento;
    @XmlElementRef(name = "ValorLancamento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valorLancamento;

    /**
     * Obtém o valor da propriedade codigoGrupo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoGrupo() {
        return codigoGrupo;
    }

    /**
     * Define o valor da propriedade codigoGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoGrupo(Short value) {
        this.codigoGrupo = value;
    }

    /**
     * Obtém o valor da propriedade codigoHistorico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoHistorico() {
        return codigoHistorico;
    }

    /**
     * Define o valor da propriedade codigoHistorico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoHistorico(Integer value) {
        this.codigoHistorico = value;
    }

    /**
     * Obtém o valor da propriedade tipoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * Define o valor da propriedade tipoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPagamento(JAXBElement<String> value) {
        this.tipoPagamento = value;
    }

    /**
     * Obtém o valor da propriedade valorLancamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValorLancamento() {
        return valorLancamento;
    }

    /**
     * Define o valor da propriedade valorLancamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValorLancamento(JAXBElement<Float> value) {
        this.valorLancamento = value;
    }

}
