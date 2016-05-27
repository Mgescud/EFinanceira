
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfPosicao_VisOpcOpvTer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPosicao_VisOpcOpvTer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Posicao_VisOpcOpvTer" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}Posicao_VisOpcOpvTer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPosicao_VisOpcOpvTer", propOrder = {
    "posicaoVisOpcOpvTer"
})
public class ArrayOfPosicaoVisOpcOpvTer {

    @XmlElement(name = "Posicao_VisOpcOpvTer", nillable = true)
    protected List<PosicaoVisOpcOpvTer> posicaoVisOpcOpvTer;

    /**
     * Gets the value of the posicaoVisOpcOpvTer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posicaoVisOpcOpvTer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosicaoVisOpcOpvTer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosicaoVisOpcOpvTer }
     * 
     * 
     */
    public List<PosicaoVisOpcOpvTer> getPosicaoVisOpcOpvTer() {
        if (posicaoVisOpcOpvTer == null) {
            posicaoVisOpcOpvTer = new ArrayList<PosicaoVisOpcOpvTer>();
        }
        return this.posicaoVisOpcOpvTer;
    }

}
