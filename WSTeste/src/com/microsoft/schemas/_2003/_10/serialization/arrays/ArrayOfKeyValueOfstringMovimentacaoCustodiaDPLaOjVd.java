
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoCustodia;


/**
 * <p>Classe Java de ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringMovimentacaoCustodiaDPLaOjVd" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentacaoCustodia"/>
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
@XmlType(name = "ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd", propOrder = {
    "keyValueOfstringMovimentacaoCustodiaDPLaOjVd"
})
public class ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd {

    @XmlElement(name = "KeyValueOfstringMovimentacaoCustodiaDPLaOjVd")
    protected List<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.KeyValueOfstringMovimentacaoCustodiaDPLaOjVd> keyValueOfstringMovimentacaoCustodiaDPLaOjVd;

    /**
     * Gets the value of the keyValueOfstringMovimentacaoCustodiaDPLaOjVd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringMovimentacaoCustodiaDPLaOjVd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringMovimentacaoCustodiaDPLaOjVd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.KeyValueOfstringMovimentacaoCustodiaDPLaOjVd }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.KeyValueOfstringMovimentacaoCustodiaDPLaOjVd> getKeyValueOfstringMovimentacaoCustodiaDPLaOjVd() {
        if (keyValueOfstringMovimentacaoCustodiaDPLaOjVd == null) {
            keyValueOfstringMovimentacaoCustodiaDPLaOjVd = new ArrayList<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.KeyValueOfstringMovimentacaoCustodiaDPLaOjVd>();
        }
        return this.keyValueOfstringMovimentacaoCustodiaDPLaOjVd;
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
     *         &lt;element name="Value" type="{http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia}MovimentacaoCustodia"/>
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
    public static class KeyValueOfstringMovimentacaoCustodiaDPLaOjVd {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected MovimentacaoCustodia value;

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
         *     {@link MovimentacaoCustodia }
         *     
         */
        public MovimentacaoCustodia getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link MovimentacaoCustodia }
         *     
         */
        public void setValue(MovimentacaoCustodia value) {
            this.value = value;
        }

    }

}
