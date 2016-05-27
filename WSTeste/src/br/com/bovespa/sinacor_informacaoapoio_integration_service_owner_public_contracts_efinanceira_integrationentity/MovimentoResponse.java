
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfInformativo;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd;


/**
 * <p>Classe Java de MovimentoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosBMF" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringMovimentacaoBmfrO_PkRgXy" minOccurs="0"/>
 *         &lt;element name="DadosBovespa" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ" minOccurs="0"/>
 *         &lt;element name="DadosCC" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx" minOccurs="0"/>
 *         &lt;element name="DadosCustodia" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd" minOccurs="0"/>
 *         &lt;element name="Informativos" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfInformativo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentoResponse", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", propOrder = {
    "dadosBMF",
    "dadosBovespa",
    "dadosCC",
    "dadosCustodia",
    "informativos"
})
public class MovimentoResponse {

    @XmlElementRef(name = "DadosBMF", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy> dadosBMF;
    @XmlElementRef(name = "DadosBovespa", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ> dadosBovespa;
    @XmlElementRef(name = "DadosCC", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> dadosCC;
    @XmlElementRef(name = "DadosCustodia", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd> dadosCustodia;
    @XmlElementRef(name = "Informativos", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInformativo> informativos;

    /**
     * Obtém o valor da propriedade dadosBMF.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy> getDadosBMF() {
        return dadosBMF;
    }

    /**
     * Define o valor da propriedade dadosBMF.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy }{@code >}
     *     
     */
    public void setDadosBMF(JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy> value) {
        this.dadosBMF = value;
    }

    /**
     * Obtém o valor da propriedade dadosBovespa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ> getDadosBovespa() {
        return dadosBovespa;
    }

    /**
     * Define o valor da propriedade dadosBovespa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ }{@code >}
     *     
     */
    public void setDadosBovespa(JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ> value) {
        this.dadosBovespa = value;
    }

    /**
     * Obtém o valor da propriedade dadosCC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> getDadosCC() {
        return dadosCC;
    }

    /**
     * Define o valor da propriedade dadosCC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx }{@code >}
     *     
     */
    public void setDadosCC(JAXBElement<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> value) {
        this.dadosCC = value;
    }

    /**
     * Obtém o valor da propriedade dadosCustodia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd> getDadosCustodia() {
        return dadosCustodia;
    }

    /**
     * Define o valor da propriedade dadosCustodia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd }{@code >}
     *     
     */
    public void setDadosCustodia(JAXBElement<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd> value) {
        this.dadosCustodia = value;
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

}
