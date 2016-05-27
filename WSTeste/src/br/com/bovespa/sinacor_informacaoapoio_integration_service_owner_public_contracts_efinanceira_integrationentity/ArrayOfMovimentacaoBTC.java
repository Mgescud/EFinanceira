
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMovimentacaoBTC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimentacaoBTC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovimentacaoBTC" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentacaoBTC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimentacaoBTC", propOrder = {
    "movimentacaoBTC"
})
public class ArrayOfMovimentacaoBTC {

    @XmlElement(name = "MovimentacaoBTC", nillable = true)
    protected List<MovimentacaoBTC> movimentacaoBTC;

    /**
     * Gets the value of the movimentacaoBTC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimentacaoBTC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimentacaoBTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovimentacaoBTC }
     * 
     * 
     */
    public List<MovimentacaoBTC> getMovimentacaoBTC() {
        if (movimentacaoBTC == null) {
            movimentacaoBTC = new ArrayList<MovimentacaoBTC>();
        }
        return this.movimentacaoBTC;
    }

}
