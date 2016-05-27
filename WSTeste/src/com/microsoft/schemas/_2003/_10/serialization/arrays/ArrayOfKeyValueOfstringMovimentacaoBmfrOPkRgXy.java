
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBmf;


/**
 * <p>Classe Java de ArrayOfKeyValueOfstringMovimentacaoBmfrO_PkRgXy complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringMovimentacaoBmfrO_PkRgXy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringMovimentacaoBmfrO_PkRgXy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}MovimentacaoBmf"/>
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
@XmlType(name = "ArrayOfKeyValueOfstringMovimentacaoBmfrO_PkRgXy", propOrder = {
    "keyValueOfstringMovimentacaoBmfrOPkRgXy"
})
public class ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy {

    @XmlElement(name = "KeyValueOfstringMovimentacaoBmfrO_PkRgXy")
    protected List<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.KeyValueOfstringMovimentacaoBmfrOPkRgXy> keyValueOfstringMovimentacaoBmfrOPkRgXy;

    /**
     * Gets the value of the keyValueOfstringMovimentacaoBmfrOPkRgXy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringMovimentacaoBmfrOPkRgXy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringMovimentacaoBmfrOPkRgXy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.KeyValueOfstringMovimentacaoBmfrOPkRgXy }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.KeyValueOfstringMovimentacaoBmfrOPkRgXy> getKeyValueOfstringMovimentacaoBmfrOPkRgXy() {
        if (keyValueOfstringMovimentacaoBmfrOPkRgXy == null) {
            keyValueOfstringMovimentacaoBmfrOPkRgXy = new ArrayList<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.KeyValueOfstringMovimentacaoBmfrOPkRgXy>();
        }
        return this.keyValueOfstringMovimentacaoBmfrOPkRgXy;
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
     *         &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF}MovimentacaoBmf"/>
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
    public static class KeyValueOfstringMovimentacaoBmfrOPkRgXy {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected MovimentacaoBmf value;

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
         *     {@link MovimentacaoBmf }
         *     
         */
        public MovimentacaoBmf getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link MovimentacaoBmf }
         *     
         */
        public void setValue(MovimentacaoBmf value) {
            this.value = value;
        }

    }

}
