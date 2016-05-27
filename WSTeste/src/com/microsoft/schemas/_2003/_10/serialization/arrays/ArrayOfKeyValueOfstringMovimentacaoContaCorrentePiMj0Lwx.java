
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoContaCorrente;


/**
 * <p>Classe Java de ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoContaCorrente"/>
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
@XmlType(name = "ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx", propOrder = {
    "keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx"
})
public class ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx {

    @XmlElement(name = "KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx")
    protected List<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx.KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx;

    /**
     * Gets the value of the keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx.KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx.KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> getKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx() {
        if (keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx == null) {
            keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx = new ArrayList<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx.KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx>();
        }
        return this.keyValueOfstringMovimentacaoContaCorrentePiMj0Lwx;
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
     *         &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC}MovimentacaoContaCorrente"/>
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
    public static class KeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected MovimentacaoContaCorrente value;

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
         *     {@link MovimentacaoContaCorrente }
         *     
         */
        public MovimentacaoContaCorrente getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link MovimentacaoContaCorrente }
         *     
         */
        public void setValue(MovimentacaoContaCorrente value) {
            this.value = value;
        }

    }

}
