
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBovespa;


/**
 * <p>Classe Java de ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringMovimentacaoBovespayxntLrBJ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa}MovimentacaoBovespa"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ", propOrder = {
    "keyValueOfstringMovimentacaoBovespayxntLrBJ"
})
public class ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ {

    @XmlElement(name = "KeyValueOfstringMovimentacaoBovespayxntLrBJ")
    protected List<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.KeyValueOfstringMovimentacaoBovespayxntLrBJ> keyValueOfstringMovimentacaoBovespayxntLrBJ;

    /**
     * Gets the value of the keyValueOfstringMovimentacaoBovespayxntLrBJ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringMovimentacaoBovespayxntLrBJ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringMovimentacaoBovespayxntLrBJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.KeyValueOfstringMovimentacaoBovespayxntLrBJ }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.KeyValueOfstringMovimentacaoBovespayxntLrBJ> getKeyValueOfstringMovimentacaoBovespayxntLrBJ() {
        if (keyValueOfstringMovimentacaoBovespayxntLrBJ == null) {
            keyValueOfstringMovimentacaoBovespayxntLrBJ = new ArrayList<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.KeyValueOfstringMovimentacaoBovespayxntLrBJ>();
        }
        return this.keyValueOfstringMovimentacaoBovespayxntLrBJ;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa}MovimentacaoBovespa"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfstringMovimentacaoBovespayxntLrBJ {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected MovimentacaoBovespa value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link MovimentacaoBovespa }
         *     
         */
        public MovimentacaoBovespa getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link MovimentacaoBovespa }
         *     
         */
        public void setValue(MovimentacaoBovespa value) {
            this.value = value;
        }

    }

}
