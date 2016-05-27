
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfEmissor;


/**
 * <p>Classe Java de MovimentacaoBovespa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoBovespa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaEmissor" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfEmissor" minOccurs="0"/>
 *         &lt;element name="MovimentoBovespa" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa}ArrayOfMovimentacaoFinanceiraBovespa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoBovespa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", propOrder = {
    "listaEmissor",
    "movimentoBovespa"
})
public class MovimentacaoBovespa {

    @XmlElementRef(name = "ListaEmissor", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmissor> listaEmissor;
    @XmlElementRef(name = "MovimentoBovespa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa> movimentoBovespa;

    /**
     * Obtém o valor da propriedade listaEmissor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmissor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmissor> getListaEmissor() {
        return listaEmissor;
    }

    /**
     * Define o valor da propriedade listaEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmissor }{@code >}
     *     
     */
    public void setListaEmissor(JAXBElement<ArrayOfEmissor> value) {
        this.listaEmissor = value;
    }

    /**
     * Obtém o valor da propriedade movimentoBovespa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBovespa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa> getMovimentoBovespa() {
        return movimentoBovespa;
    }

    /**
     * Define o valor da propriedade movimentoBovespa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBovespa }{@code >}
     *     
     */
    public void setMovimentoBovespa(JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa> value) {
        this.movimentoBovespa = value;
    }

}
