
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Proprietario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Proprietario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataNascFund" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}DocumentoProprietario" minOccurs="0"/>
 *         &lt;element name="EnderecoProprietario" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}EnderecoProprietario" minOccurs="0"/>
 *         &lt;element name="NomeProprietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proprietario", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", propOrder = {
    "dataNascFund",
    "documento",
    "enderecoProprietario",
    "nomeProprietario"
})
public class Proprietario {

    @XmlElementRef(name = "DataNascFund", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataNascFund;
    @XmlElementRef(name = "Documento", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentoProprietario> documento;
    @XmlElementRef(name = "EnderecoProprietario", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<EnderecoProprietario> enderecoProprietario;
    @XmlElementRef(name = "NomeProprietario", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeProprietario;

    /**
     * Obtém o valor da propriedade dataNascFund.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNascFund() {
        return dataNascFund;
    }

    /**
     * Define o valor da propriedade dataNascFund.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNascFund(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNascFund = value;
    }

    /**
     * Obtém o valor da propriedade documento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentoProprietario }{@code >}
     *     
     */
    public JAXBElement<DocumentoProprietario> getDocumento() {
        return documento;
    }

    /**
     * Define o valor da propriedade documento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentoProprietario }{@code >}
     *     
     */
    public void setDocumento(JAXBElement<DocumentoProprietario> value) {
        this.documento = value;
    }

    /**
     * Obtém o valor da propriedade enderecoProprietario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoProprietario }{@code >}
     *     
     */
    public JAXBElement<EnderecoProprietario> getEnderecoProprietario() {
        return enderecoProprietario;
    }

    /**
     * Define o valor da propriedade enderecoProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoProprietario }{@code >}
     *     
     */
    public void setEnderecoProprietario(JAXBElement<EnderecoProprietario> value) {
        this.enderecoProprietario = value;
    }

    /**
     * Obtém o valor da propriedade nomeProprietario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * Define o valor da propriedade nomeProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeProprietario(JAXBElement<String> value) {
        this.nomeProprietario = value;
    }

}
