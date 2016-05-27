
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBmf;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBovespa;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoContaCorrente;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoCustodia;


/**
 * <p>Classe Java de Declarado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Declarado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoTipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNasc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Documentacao" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}Documento" minOccurs="0"/>
 *         &lt;element name="ListaEndereco" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfEnderecoDeclarado" minOccurs="0"/>
 *         &lt;element name="ListaProprietarios" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfProprietario" minOccurs="0"/>
 *         &lt;element name="MovimentoBmf" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}MovimentacaoBmf" minOccurs="0"/>
 *         &lt;element name="MovimentoBovespa" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa}MovimentacaoBovespa" minOccurs="0"/>
 *         &lt;element name="MovimentoContaCorrente" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoContaCorrente" minOccurs="0"/>
 *         &lt;element name="MovimentoCustodia" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentacaoCustodia" minOccurs="0"/>
 *         &lt;element name="NomeDeclarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Declarado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", propOrder = {
    "codigoTipoPessoa",
    "dataNasc",
    "documentacao",
    "listaEndereco",
    "listaProprietarios",
    "movimentoBmf",
    "movimentoBovespa",
    "movimentoContaCorrente",
    "movimentoCustodia",
    "nomeDeclarado"
})
public class Declarado {

    @XmlElementRef(name = "CodigoTipoPessoa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoPessoa;
    @XmlElement(name = "DataNasc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNasc;
    @XmlElementRef(name = "Documentacao", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documentacao;
    @XmlElementRef(name = "ListaEndereco", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEnderecoDeclarado> listaEndereco;
    @XmlElementRef(name = "ListaProprietarios", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProprietario> listaProprietarios;
    @XmlElementRef(name = "MovimentoBmf", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentacaoBmf> movimentoBmf;
    @XmlElementRef(name = "MovimentoBovespa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentacaoBovespa> movimentoBovespa;
    @XmlElementRef(name = "MovimentoContaCorrente", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentacaoContaCorrente> movimentoContaCorrente;
    @XmlElementRef(name = "MovimentoCustodia", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<MovimentacaoCustodia> movimentoCustodia;
    @XmlElementRef(name = "NomeDeclarado", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeDeclarado;

    /**
     * Obtém o valor da propriedade codigoTipoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoPessoa() {
        return codigoTipoPessoa;
    }

    /**
     * Define o valor da propriedade codigoTipoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoPessoa(JAXBElement<String> value) {
        this.codigoTipoPessoa = value;
    }

    /**
     * Obtém o valor da propriedade dataNasc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNasc() {
        return dataNasc;
    }

    /**
     * Define o valor da propriedade dataNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNasc(XMLGregorianCalendar value) {
        this.dataNasc = value;
    }

    /**
     * Obtém o valor da propriedade documentacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public JAXBElement<Documento> getDocumentacao() {
        return documentacao;
    }

    /**
     * Define o valor da propriedade documentacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public void setDocumentacao(JAXBElement<Documento> value) {
        this.documentacao = value;
    }

    /**
     * Obtém o valor da propriedade listaEndereco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoDeclarado }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEnderecoDeclarado> getListaEndereco() {
        return listaEndereco;
    }

    /**
     * Define o valor da propriedade listaEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoDeclarado }{@code >}
     *     
     */
    public void setListaEndereco(JAXBElement<ArrayOfEnderecoDeclarado> value) {
        this.listaEndereco = value;
    }

    /**
     * Obtém o valor da propriedade listaProprietarios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProprietario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProprietario> getListaProprietarios() {
        return listaProprietarios;
    }

    /**
     * Define o valor da propriedade listaProprietarios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProprietario }{@code >}
     *     
     */
    public void setListaProprietarios(JAXBElement<ArrayOfProprietario> value) {
        this.listaProprietarios = value;
    }

    /**
     * Obtém o valor da propriedade movimentoBmf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoBmf }{@code >}
     *     
     */
    public JAXBElement<MovimentacaoBmf> getMovimentoBmf() {
        return movimentoBmf;
    }

    /**
     * Define o valor da propriedade movimentoBmf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoBmf }{@code >}
     *     
     */
    public void setMovimentoBmf(JAXBElement<MovimentacaoBmf> value) {
        this.movimentoBmf = value;
    }

    /**
     * Obtém o valor da propriedade movimentoBovespa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoBovespa }{@code >}
     *     
     */
    public JAXBElement<MovimentacaoBovespa> getMovimentoBovespa() {
        return movimentoBovespa;
    }

    /**
     * Define o valor da propriedade movimentoBovespa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoBovespa }{@code >}
     *     
     */
    public void setMovimentoBovespa(JAXBElement<MovimentacaoBovespa> value) {
        this.movimentoBovespa = value;
    }

    /**
     * Obtém o valor da propriedade movimentoContaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoContaCorrente }{@code >}
     *     
     */
    public JAXBElement<MovimentacaoContaCorrente> getMovimentoContaCorrente() {
        return movimentoContaCorrente;
    }

    /**
     * Define o valor da propriedade movimentoContaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoContaCorrente }{@code >}
     *     
     */
    public void setMovimentoContaCorrente(JAXBElement<MovimentacaoContaCorrente> value) {
        this.movimentoContaCorrente = value;
    }

    /**
     * Obtém o valor da propriedade movimentoCustodia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoCustodia }{@code >}
     *     
     */
    public JAXBElement<MovimentacaoCustodia> getMovimentoCustodia() {
        return movimentoCustodia;
    }

    /**
     * Define o valor da propriedade movimentoCustodia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovimentacaoCustodia }{@code >}
     *     
     */
    public void setMovimentoCustodia(JAXBElement<MovimentacaoCustodia> value) {
        this.movimentoCustodia = value;
    }

    /**
     * Obtém o valor da propriedade nomeDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeDeclarado() {
        return nomeDeclarado;
    }

    /**
     * Define o valor da propriedade nomeDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeDeclarado(JAXBElement<String> value) {
        this.nomeDeclarado = value;
    }

}
