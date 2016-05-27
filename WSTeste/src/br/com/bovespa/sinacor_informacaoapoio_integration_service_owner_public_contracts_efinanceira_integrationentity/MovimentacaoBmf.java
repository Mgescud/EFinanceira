
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfEmissor;


/**
 * <p>Classe Java de MovimentacaoBmf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MovimentacaoBmf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaEmissor" type="{http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}ArrayOfEmissor" minOccurs="0"/>
 *         &lt;element name="MovimentoFuturos" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfMovimentacaoFinanceiraBmf" minOccurs="0"/>
 *         &lt;element name="MovimentoOpcoes" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfMovimentacaoFinanceiraBmf" minOccurs="0"/>
 *         &lt;element name="MovimentoSwapFlexivel" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfMovimentacaoFinanceiraBmf" minOccurs="0"/>
 *         &lt;element name="PosicaoFuturosOpcoesUltimoDiaMes" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfPosicaoFinanceiraUltimoDiaMes" minOccurs="0"/>
 *         &lt;element name="PosicaoOpcaoFlexivelUltimoDiaMes" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfPosicaoFinanceiraUltimoDiaMes" minOccurs="0"/>
 *         &lt;element name="PosicaoOuroDisponivelUltimoDiaMes" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfPosicaoFinanceiraUltimoDiaMes" minOccurs="0"/>
 *         &lt;element name="PosicaoSwapUltimoDiaMes" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}ArrayOfPosicaoFinanceiraUltimoDiaMes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimentacaoBmf", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", propOrder = {
    "listaEmissor",
    "movimentoFuturos",
    "movimentoOpcoes",
    "movimentoSwapFlexivel",
    "posicaoFuturosOpcoesUltimoDiaMes",
    "posicaoOpcaoFlexivelUltimoDiaMes",
    "posicaoOuroDisponivelUltimoDiaMes",
    "posicaoSwapUltimoDiaMes"
})
public class MovimentacaoBmf {

    @XmlElementRef(name = "ListaEmissor", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmissor> listaEmissor;
    @XmlElementRef(name = "MovimentoFuturos", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> movimentoFuturos;
    @XmlElementRef(name = "MovimentoOpcoes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> movimentoOpcoes;
    @XmlElementRef(name = "MovimentoSwapFlexivel", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> movimentoSwapFlexivel;
    @XmlElementRef(name = "PosicaoFuturosOpcoesUltimoDiaMes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> posicaoFuturosOpcoesUltimoDiaMes;
    @XmlElementRef(name = "PosicaoOpcaoFlexivelUltimoDiaMes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> posicaoOpcaoFlexivelUltimoDiaMes;
    @XmlElementRef(name = "PosicaoOuroDisponivelUltimoDiaMes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> posicaoOuroDisponivelUltimoDiaMes;
    @XmlElementRef(name = "PosicaoSwapUltimoDiaMes", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> posicaoSwapUltimoDiaMes;

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
     * Obtém o valor da propriedade movimentoFuturos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> getMovimentoFuturos() {
        return movimentoFuturos;
    }

    /**
     * Define o valor da propriedade movimentoFuturos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public void setMovimentoFuturos(JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> value) {
        this.movimentoFuturos = value;
    }

    /**
     * Obtém o valor da propriedade movimentoOpcoes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> getMovimentoOpcoes() {
        return movimentoOpcoes;
    }

    /**
     * Define o valor da propriedade movimentoOpcoes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public void setMovimentoOpcoes(JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> value) {
        this.movimentoOpcoes = value;
    }

    /**
     * Obtém o valor da propriedade movimentoSwapFlexivel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> getMovimentoSwapFlexivel() {
        return movimentoSwapFlexivel;
    }

    /**
     * Define o valor da propriedade movimentoSwapFlexivel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}
     *     
     */
    public void setMovimentoSwapFlexivel(JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> value) {
        this.movimentoSwapFlexivel = value;
    }

    /**
     * Obtém o valor da propriedade posicaoFuturosOpcoesUltimoDiaMes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> getPosicaoFuturosOpcoesUltimoDiaMes() {
        return posicaoFuturosOpcoesUltimoDiaMes;
    }

    /**
     * Define o valor da propriedade posicaoFuturosOpcoesUltimoDiaMes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public void setPosicaoFuturosOpcoesUltimoDiaMes(JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> value) {
        this.posicaoFuturosOpcoesUltimoDiaMes = value;
    }

    /**
     * Obtém o valor da propriedade posicaoOpcaoFlexivelUltimoDiaMes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> getPosicaoOpcaoFlexivelUltimoDiaMes() {
        return posicaoOpcaoFlexivelUltimoDiaMes;
    }

    /**
     * Define o valor da propriedade posicaoOpcaoFlexivelUltimoDiaMes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public void setPosicaoOpcaoFlexivelUltimoDiaMes(JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> value) {
        this.posicaoOpcaoFlexivelUltimoDiaMes = value;
    }

    /**
     * Obtém o valor da propriedade posicaoOuroDisponivelUltimoDiaMes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> getPosicaoOuroDisponivelUltimoDiaMes() {
        return posicaoOuroDisponivelUltimoDiaMes;
    }

    /**
     * Define o valor da propriedade posicaoOuroDisponivelUltimoDiaMes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public void setPosicaoOuroDisponivelUltimoDiaMes(JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> value) {
        this.posicaoOuroDisponivelUltimoDiaMes = value;
    }

    /**
     * Obtém o valor da propriedade posicaoSwapUltimoDiaMes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> getPosicaoSwapUltimoDiaMes() {
        return posicaoSwapUltimoDiaMes;
    }

    /**
     * Define o valor da propriedade posicaoSwapUltimoDiaMes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}
     *     
     */
    public void setPosicaoSwapUltimoDiaMes(JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> value) {
        this.posicaoSwapUltimoDiaMes = value;
    }

}
