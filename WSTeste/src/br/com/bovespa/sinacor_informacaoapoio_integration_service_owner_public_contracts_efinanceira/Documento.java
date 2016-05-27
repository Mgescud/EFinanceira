
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Documento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF_CNPJ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CVM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DadosAtividadeBmfEstrangeiro" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfDetalhesEstrangeiro" minOccurs="0"/>
 *         &lt;element name="DadosAtividadeBovespaEstrangeiro" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfDetalhesEstrangeiro" minOccurs="0"/>
 *         &lt;element name="GIIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIRE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Outros" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}DetalhesDocumento" minOccurs="0"/>
 *         &lt;element name="RG" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}DetalhesDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", propOrder = {
    "cpfcnpj",
    "cvm",
    "dadosAtividadeBmfEstrangeiro",
    "dadosAtividadeBovespaEstrangeiro",
    "giin",
    "nif",
    "nire",
    "outros",
    "rg"
})
public class Documento {

    @XmlElement(name = "CPF_CNPJ")
    protected Long cpfcnpj;
    @XmlElementRef(name = "CVM", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvm;
    @XmlElementRef(name = "DadosAtividadeBmfEstrangeiro", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalhesEstrangeiro> dadosAtividadeBmfEstrangeiro;
    @XmlElementRef(name = "DadosAtividadeBovespaEstrangeiro", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalhesEstrangeiro> dadosAtividadeBovespaEstrangeiro;
    @XmlElementRef(name = "GIIN", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giin;
    @XmlElementRef(name = "NIF", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nif;
    @XmlElementRef(name = "NIRE", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> nire;
    @XmlElementRef(name = "Outros", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<DetalhesDocumento> outros;
    @XmlElementRef(name = "RG", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<DetalhesDocumento> rg;

    /**
     * Obtém o valor da propriedade cpfcnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCPFCNPJ() {
        return cpfcnpj;
    }

    /**
     * Define o valor da propriedade cpfcnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCPFCNPJ(Long value) {
        this.cpfcnpj = value;
    }

    /**
     * Obtém o valor da propriedade cvm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVM() {
        return cvm;
    }

    /**
     * Define o valor da propriedade cvm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVM(JAXBElement<String> value) {
        this.cvm = value;
    }

    /**
     * Obtém o valor da propriedade dadosAtividadeBmfEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalhesEstrangeiro> getDadosAtividadeBmfEstrangeiro() {
        return dadosAtividadeBmfEstrangeiro;
    }

    /**
     * Define o valor da propriedade dadosAtividadeBmfEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}
     *     
     */
    public void setDadosAtividadeBmfEstrangeiro(JAXBElement<ArrayOfDetalhesEstrangeiro> value) {
        this.dadosAtividadeBmfEstrangeiro = value;
    }

    /**
     * Obtém o valor da propriedade dadosAtividadeBovespaEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalhesEstrangeiro> getDadosAtividadeBovespaEstrangeiro() {
        return dadosAtividadeBovespaEstrangeiro;
    }

    /**
     * Define o valor da propriedade dadosAtividadeBovespaEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}
     *     
     */
    public void setDadosAtividadeBovespaEstrangeiro(JAXBElement<ArrayOfDetalhesEstrangeiro> value) {
        this.dadosAtividadeBovespaEstrangeiro = value;
    }

    /**
     * Obtém o valor da propriedade giin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGIIN() {
        return giin;
    }

    /**
     * Define o valor da propriedade giin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGIIN(JAXBElement<String> value) {
        this.giin = value;
    }

    /**
     * Obtém o valor da propriedade nif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNIF() {
        return nif;
    }

    /**
     * Define o valor da propriedade nif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNIF(JAXBElement<String> value) {
        this.nif = value;
    }

    /**
     * Obtém o valor da propriedade nire.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNIRE() {
        return nire;
    }

    /**
     * Define o valor da propriedade nire.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNIRE(JAXBElement<Long> value) {
        this.nire = value;
    }

    /**
     * Obtém o valor da propriedade outros.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}
     *     
     */
    public JAXBElement<DetalhesDocumento> getOutros() {
        return outros;
    }

    /**
     * Define o valor da propriedade outros.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}
     *     
     */
    public void setOutros(JAXBElement<DetalhesDocumento> value) {
        this.outros = value;
    }

    /**
     * Obtém o valor da propriedade rg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}
     *     
     */
    public JAXBElement<DetalhesDocumento> getRG() {
        return rg;
    }

    /**
     * Define o valor da propriedade rg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}
     *     
     */
    public void setRG(JAXBElement<DetalhesDocumento> value) {
        this.rg = value;
    }

}
