
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentoBMF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentoBMF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commodity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesAnoMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroConta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentoBMF", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", propOrder = {
    "commodity",
    "mercado",
    "mesAnoMovimento",
    "numeroConta"
})
@XmlSeeAlso({
    MovimentacaoFinanceiraBmf.class,
    PosicaoFinanceiraUltimoDiaMes.class
})
public class MovimentoBMF {

    @XmlElementRef(name = "Commodity", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commodity;
    @XmlElementRef(name = "Mercado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mercado;
    @XmlElementRef(name = "MesAnoMovimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mesAnoMovimento;
    @XmlElement(name = "NumeroConta")
    protected Integer numeroConta;

    /**
     * Obtém o valor da propriedade commodity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommodity() {
        return commodity;
    }

    /**
     * Define o valor da propriedade commodity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommodity(JAXBElement<String> value) {
        this.commodity = value;
    }

    /**
     * Obtém o valor da propriedade mercado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMercado() {
        return mercado;
    }

    /**
     * Define o valor da propriedade mercado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMercado(JAXBElement<String> value) {
        this.mercado = value;
    }

    /**
     * Obtém o valor da propriedade mesAnoMovimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMesAnoMovimento() {
        return mesAnoMovimento;
    }

    /**
     * Define o valor da propriedade mesAnoMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMesAnoMovimento(JAXBElement<String> value) {
        this.mesAnoMovimento = value;
    }

    /**
     * Obtém o valor da propriedade numeroConta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o valor da propriedade numeroConta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroConta(Integer value) {
        this.numeroConta = value;
    }

}
