
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MovimentacaoCustodia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoCustodia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovimentacaoBTC" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfMovimentacaoBTC" minOccurs="0"/>
 *         &lt;element name="MovimentacaoTesouroDireto" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfMovimentacaoTD" minOccurs="0"/>
 *         &lt;element name="MovimentacaoVisOpcOpvTer" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfMovimentacao_VisOpcOpvTer" minOccurs="0"/>
 *         &lt;element name="PosicaoBTC" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfPosicaoBtc" minOccurs="0"/>
 *         &lt;element name="PosicaoTesouroDireto" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfPosicaoTesouroDireto" minOccurs="0"/>
 *         &lt;element name="PosicaoVisOpcOpvTer" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}ArrayOfPosicao_VisOpcOpvTer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoCustodia", propOrder = {
    "movimentacaoBTC",
    "movimentacaoTesouroDireto",
    "movimentacaoVisOpcOpvTer",
    "posicaoBTC",
    "posicaoTesouroDireto",
    "posicaoVisOpcOpvTer"
})
public class MovimentacaoCustodia {

    @XmlElementRef(name = "MovimentacaoBTC", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoBTC> movimentacaoBTC;
    @XmlElementRef(name = "MovimentacaoTesouroDireto", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoTD> movimentacaoTesouroDireto;
    @XmlElementRef(name = "MovimentacaoVisOpcOpvTer", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer> movimentacaoVisOpcOpvTer;
    @XmlElementRef(name = "PosicaoBTC", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoBtc> posicaoBTC;
    @XmlElementRef(name = "PosicaoTesouroDireto", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoTesouroDireto> posicaoTesouroDireto;
    @XmlElementRef(name = "PosicaoVisOpcOpvTer", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoVisOpcOpvTer> posicaoVisOpcOpvTer;

    /**
     * Obtém o valor da propriedade movimentacaoBTC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoBTC }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoBTC> getMovimentacaoBTC() {
        return movimentacaoBTC;
    }

    /**
     * Define o valor da propriedade movimentacaoBTC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoBTC }{@code >}
     *     
     */
    public void setMovimentacaoBTC(JAXBElement<ArrayOfMovimentacaoBTC> value) {
        this.movimentacaoBTC = value;
    }

    /**
     * Obtém o valor da propriedade movimentacaoTesouroDireto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoTD }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoTD> getMovimentacaoTesouroDireto() {
        return movimentacaoTesouroDireto;
    }

    /**
     * Define o valor da propriedade movimentacaoTesouroDireto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoTD }{@code >}
     *     
     */
    public void setMovimentacaoTesouroDireto(JAXBElement<ArrayOfMovimentacaoTD> value) {
        this.movimentacaoTesouroDireto = value;
    }

    /**
     * Obtém o valor da propriedade movimentacaoVisOpcOpvTer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoVisOpcOpvTer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer> getMovimentacaoVisOpcOpvTer() {
        return movimentacaoVisOpcOpvTer;
    }

    /**
     * Define o valor da propriedade movimentacaoVisOpcOpvTer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoVisOpcOpvTer }{@code >}
     *     
     */
    public void setMovimentacaoVisOpcOpvTer(JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer> value) {
        this.movimentacaoVisOpcOpvTer = value;
    }

    /**
     * Obtém o valor da propriedade posicaoBTC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoBtc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoBtc> getPosicaoBTC() {
        return posicaoBTC;
    }

    /**
     * Define o valor da propriedade posicaoBTC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoBtc }{@code >}
     *     
     */
    public void setPosicaoBTC(JAXBElement<ArrayOfPosicaoBtc> value) {
        this.posicaoBTC = value;
    }

    /**
     * Obtém o valor da propriedade posicaoTesouroDireto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoTesouroDireto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoTesouroDireto> getPosicaoTesouroDireto() {
        return posicaoTesouroDireto;
    }

    /**
     * Define o valor da propriedade posicaoTesouroDireto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoTesouroDireto }{@code >}
     *     
     */
    public void setPosicaoTesouroDireto(JAXBElement<ArrayOfPosicaoTesouroDireto> value) {
        this.posicaoTesouroDireto = value;
    }

    /**
     * Obtém o valor da propriedade posicaoVisOpcOpvTer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoVisOpcOpvTer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoVisOpcOpvTer> getPosicaoVisOpcOpvTer() {
        return posicaoVisOpcOpvTer;
    }

    /**
     * Define o valor da propriedade posicaoVisOpcOpvTer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoVisOpcOpvTer }{@code >}
     *     
     */
    public void setPosicaoVisOpcOpvTer(JAXBElement<ArrayOfPosicaoVisOpcOpvTer> value) {
        this.posicaoVisOpcOpvTer = value;
    }

}
