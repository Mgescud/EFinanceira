
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfDeclarado;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfInformativo;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.Declarante;


/**
 * <p>Classe Java de CadastroInfoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CadastroInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Declarante" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}Declarante" minOccurs="0"/>
 *         &lt;element name="Informativos" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfInformativo" minOccurs="0"/>
 *         &lt;element name="ListaDeclarados" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfDeclarado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CadastroInfoResponse", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", propOrder = {
    "declarante",
    "informativos",
    "listaDeclarados"
})
public class CadastroInfoResponse {

    @XmlElementRef(name = "Declarante", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<Declarante> declarante;
    @XmlElementRef(name = "Informativos", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInformativo> informativos;
    @XmlElementRef(name = "ListaDeclarados", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDeclarado> listaDeclarados;

    /**
     * Obtém o valor da propriedade declarante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Declarante }{@code >}
     *     
     */
    public JAXBElement<Declarante> getDeclarante() {
        return declarante;
    }

    /**
     * Define o valor da propriedade declarante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Declarante }{@code >}
     *     
     */
    public void setDeclarante(JAXBElement<Declarante> value) {
        this.declarante = value;
    }

    /**
     * Obtém o valor da propriedade informativos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformativo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInformativo> getInformativos() {
        return informativos;
    }

    /**
     * Define o valor da propriedade informativos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformativo }{@code >}
     *     
     */
    public void setInformativos(JAXBElement<ArrayOfInformativo> value) {
        this.informativos = value;
    }

    /**
     * Obtém o valor da propriedade listaDeclarados.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeclarado }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDeclarado> getListaDeclarados() {
        return listaDeclarados;
    }

    /**
     * Define o valor da propriedade listaDeclarados.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeclarado }{@code >}
     *     
     */
    public void setListaDeclarados(JAXBElement<ArrayOfDeclarado> value) {
        this.listaDeclarados = value;
    }

}
