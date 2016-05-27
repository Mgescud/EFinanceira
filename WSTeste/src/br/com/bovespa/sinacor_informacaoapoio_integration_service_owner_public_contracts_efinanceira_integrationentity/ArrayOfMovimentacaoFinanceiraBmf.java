
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMovimentacaoFinanceiraBmf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimentacaoFinanceiraBmf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovimentacaoFinanceiraBmf" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}MovimentacaoFinanceiraBmf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimentacaoFinanceiraBmf", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", propOrder = {
    "movimentacaoFinanceiraBmf"
})
public class ArrayOfMovimentacaoFinanceiraBmf {

    @XmlElement(name = "MovimentacaoFinanceiraBmf", nillable = true)
    protected List<MovimentacaoFinanceiraBmf> movimentacaoFinanceiraBmf;

    /**
     * Gets the value of the movimentacaoFinanceiraBmf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimentacaoFinanceiraBmf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimentacaoFinanceiraBmf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovimentacaoFinanceiraBmf }
     * 
     * 
     */
    public List<MovimentacaoFinanceiraBmf> getMovimentacaoFinanceiraBmf() {
        if (movimentacaoFinanceiraBmf == null) {
            movimentacaoFinanceiraBmf = new ArrayList<MovimentacaoFinanceiraBmf>();
        }
        return this.movimentacaoFinanceiraBmf;
    }

}
