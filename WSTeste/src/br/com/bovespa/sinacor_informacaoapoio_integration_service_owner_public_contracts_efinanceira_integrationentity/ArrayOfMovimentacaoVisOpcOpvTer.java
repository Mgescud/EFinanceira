
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMovimentacao_VisOpcOpvTer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimentacao_VisOpcOpvTer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Movimentacao_VisOpcOpvTer" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}Movimentacao_VisOpcOpvTer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimentacao_VisOpcOpvTer", propOrder = {
    "movimentacaoVisOpcOpvTer"
})
public class ArrayOfMovimentacaoVisOpcOpvTer {

    @XmlElement(name = "Movimentacao_VisOpcOpvTer", nillable = true)
    protected List<MovimentacaoVisOpcOpvTer> movimentacaoVisOpcOpvTer;

    /**
     * Gets the value of the movimentacaoVisOpcOpvTer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimentacaoVisOpcOpvTer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimentacaoVisOpcOpvTer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovimentacaoVisOpcOpvTer }
     * 
     * 
     */
    public List<MovimentacaoVisOpcOpvTer> getMovimentacaoVisOpcOpvTer() {
        if (movimentacaoVisOpcOpvTer == null) {
            movimentacaoVisOpcOpvTer = new ArrayList<MovimentacaoVisOpcOpvTer>();
        }
        return this.movimentacaoVisOpcOpvTer;
    }

}
