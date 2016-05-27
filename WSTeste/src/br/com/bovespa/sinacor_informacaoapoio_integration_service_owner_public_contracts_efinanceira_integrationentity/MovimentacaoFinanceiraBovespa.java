
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentacaoFinanceiraBovespa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoFinanceiraBovespa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesAnoMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroConta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ValorDebito" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoFinanceiraBovespa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", propOrder = {
    "codigoNegocio",
    "mesAnoMovimento",
    "numeroConta",
    "valorCredito",
    "valorDebito"
})
public class MovimentacaoFinanceiraBovespa {

    @XmlElementRef(name = "CodigoNegocio", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocio;
    @XmlElementRef(name = "MesAnoMovimento", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mesAnoMovimento;
    @XmlElement(name = "NumeroConta")
    protected Integer numeroConta;
    @XmlElement(name = "ValorCredito")
    protected Float valorCredito;
    @XmlElement(name = "ValorDebito")
    protected Float valorDebito;

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

    /**
     * Obtém o valor da propriedade valorCredito.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValorCredito() {
        return valorCredito;
    }

    /**
     * Define o valor da propriedade valorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValorCredito(Float value) {
        this.valorCredito = value;
    }

    /**
     * Obtém o valor da propriedade valorDebito.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValorDebito() {
        return valorDebito;
    }

    /**
     * Define o valor da propriedade valorDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValorDebito(Float value) {
        this.valorDebito = value;
    }

}
