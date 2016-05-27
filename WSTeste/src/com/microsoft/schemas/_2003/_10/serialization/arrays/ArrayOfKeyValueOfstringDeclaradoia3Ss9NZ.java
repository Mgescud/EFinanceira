
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.Declarado;


/**
 * <p>Classe Java de ArrayOfKeyValueOfstringDeclaradoia3_Ss9NZ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringDeclaradoia3_Ss9NZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringDeclaradoia3_Ss9NZ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}Declarado"/>
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
@XmlType(name = "ArrayOfKeyValueOfstringDeclaradoia3_Ss9NZ", propOrder = {
    "keyValueOfstringDeclaradoia3Ss9NZ"
})
public class ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ {

    @XmlElement(name = "KeyValueOfstringDeclaradoia3_Ss9NZ")
    protected List<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ.KeyValueOfstringDeclaradoia3Ss9NZ> keyValueOfstringDeclaradoia3Ss9NZ;

    /**
     * Gets the value of the keyValueOfstringDeclaradoia3Ss9NZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringDeclaradoia3Ss9NZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringDeclaradoia3Ss9NZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ.KeyValueOfstringDeclaradoia3Ss9NZ }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ.KeyValueOfstringDeclaradoia3Ss9NZ> getKeyValueOfstringDeclaradoia3Ss9NZ() {
        if (keyValueOfstringDeclaradoia3Ss9NZ == null) {
            keyValueOfstringDeclaradoia3Ss9NZ = new ArrayList<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ.KeyValueOfstringDeclaradoia3Ss9NZ>();
        }
        return this.keyValueOfstringDeclaradoia3Ss9NZ;
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
     *         &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity}Declarado"/>
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
    public static class KeyValueOfstringDeclaradoia3Ss9NZ {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected Declarado value;

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
         *     {@link Declarado }
         *     
         */
        public Declarado getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link Declarado }
         *     
         */
        public void setValue(Declarado value) {
            this.value = value;
        }

    }

}
