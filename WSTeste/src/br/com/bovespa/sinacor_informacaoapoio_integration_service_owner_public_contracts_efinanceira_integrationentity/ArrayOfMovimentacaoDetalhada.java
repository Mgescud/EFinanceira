
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMovimentacaoDetalhada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimentacaoDetalhada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovimentacaoDetalhada" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoDetalhada" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimentacaoDetalhada", namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", propOrder = {
    "movimentacaoDetalhada"
})
public class ArrayOfMovimentacaoDetalhada {

    @XmlElement(name = "MovimentacaoDetalhada", nillable = true)
    protected List<MovimentacaoDetalhada> movimentacaoDetalhada;

    /**
     * Gets the value of the movimentacaoDetalhada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimentacaoDetalhada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimentacaoDetalhada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovimentacaoDetalhada }
     * 
     * 
     */
    public List<MovimentacaoDetalhada> getMovimentacaoDetalhada() {
        if (movimentacaoDetalhada == null) {
            movimentacaoDetalhada = new ArrayList<MovimentacaoDetalhada>();
        }
        return this.movimentacaoDetalhada;
    }

}
