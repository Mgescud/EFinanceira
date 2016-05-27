
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnderecoProprietario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnderecoProprietario">
 *   &lt;complexContent>
 *     &lt;extension base="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}EnderecoDeclarado">
 *       &lt;sequence>
 *         &lt;element name="TipoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoProprietario", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", propOrder = {
    "tipoEndereco"
})
public class EnderecoProprietario
    extends EnderecoDeclarado
{

    @XmlElementRef(name = "TipoEndereco", namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoEndereco;

    /**
     * Obtém o valor da propriedade tipoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Define o valor da propriedade tipoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoEndereco(JAXBElement<String> value) {
        this.tipoEndereco = value;
    }

}
