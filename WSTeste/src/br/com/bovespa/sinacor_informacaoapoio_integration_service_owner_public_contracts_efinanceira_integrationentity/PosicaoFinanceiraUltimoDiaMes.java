
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PosicaoFinanceiraUltimoDiaMes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PosicaoFinanceiraUltimoDiaMes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}MovimentoBMF">
 *       &lt;sequence>
 *         &lt;element name="TamanhoBase" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Variavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosicaoFinanceiraUltimoDiaMes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", propOrder = {
    "tamanhoBase",
    "variavel"
})
public class PosicaoFinanceiraUltimoDiaMes
    extends MovimentoBMF
{

    @XmlElement(name = "TamanhoBase")
    protected Float tamanhoBase;
    @XmlElementRef(name = "Variavel", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> variavel;

    /**
     * Obtém o valor da propriedade tamanhoBase.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTamanhoBase() {
        return tamanhoBase;
    }

    /**
     * Define o valor da propriedade tamanhoBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTamanhoBase(Float value) {
        this.tamanhoBase = value;
    }

    /**
     * Obtém o valor da propriedade variavel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVariavel() {
        return variavel;
    }

    /**
     * Define o valor da propriedade variavel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVariavel(JAXBElement<String> value) {
        this.variavel = value;
    }

}
