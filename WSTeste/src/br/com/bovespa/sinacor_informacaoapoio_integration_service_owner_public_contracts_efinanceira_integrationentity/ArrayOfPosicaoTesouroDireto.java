
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfPosicaoTesouroDireto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPosicaoTesouroDireto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PosicaoTesouroDireto" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}PosicaoTesouroDireto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPosicaoTesouroDireto", propOrder = {
    "posicaoTesouroDireto"
})
public class ArrayOfPosicaoTesouroDireto {

    @XmlElement(name = "PosicaoTesouroDireto", nillable = true)
    protected List<PosicaoTesouroDireto> posicaoTesouroDireto;

    /**
     * Gets the value of the posicaoTesouroDireto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posicaoTesouroDireto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosicaoTesouroDireto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosicaoTesouroDireto }
     * 
     * 
     */
    public List<PosicaoTesouroDireto> getPosicaoTesouroDireto() {
        if (posicaoTesouroDireto == null) {
            posicaoTesouroDireto = new ArrayList<PosicaoTesouroDireto>();
        }
        return this.posicaoTesouroDireto;
    }

}
