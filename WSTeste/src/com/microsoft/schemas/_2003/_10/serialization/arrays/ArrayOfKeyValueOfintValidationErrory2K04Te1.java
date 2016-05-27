
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.sinacor.sinacor_infra_common_validation._2008._08.ValidationError;


/**
 * <p>Classe Java de ArrayOfKeyValueOfintValidationErrory2K04te1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintValidationErrory2K04te1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintValidationErrory2K04te1" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{http://www.sinacor.com.br/Sinacor.Infra.Common.Validation/2008/08}ValidationError"/>
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
@XmlType(name = "ArrayOfKeyValueOfintValidationErrory2K04te1", propOrder = {
    "keyValueOfintValidationErrory2K04Te1"
})
public class ArrayOfKeyValueOfintValidationErrory2K04Te1 {

    @XmlElement(name = "KeyValueOfintValidationErrory2K04te1")
    protected List<ArrayOfKeyValueOfintValidationErrory2K04Te1 .KeyValueOfintValidationErrory2K04Te1> keyValueOfintValidationErrory2K04Te1;

    /**
     * Gets the value of the keyValueOfintValidationErrory2K04Te1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintValidationErrory2K04Te1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintValidationErrory2K04Te1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintValidationErrory2K04Te1 .KeyValueOfintValidationErrory2K04Te1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintValidationErrory2K04Te1 .KeyValueOfintValidationErrory2K04Te1> getKeyValueOfintValidationErrory2K04Te1() {
        if (keyValueOfintValidationErrory2K04Te1 == null) {
            keyValueOfintValidationErrory2K04Te1 = new ArrayList<ArrayOfKeyValueOfintValidationErrory2K04Te1 .KeyValueOfintValidationErrory2K04Te1>();
        }
        return this.keyValueOfintValidationErrory2K04Te1;
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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Value" type="{http://www.sinacor.com.br/Sinacor.Infra.Common.Validation/2008/08}ValidationError"/>
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
    public static class KeyValueOfintValidationErrory2K04Te1 {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ValidationError value;

        /**
         * Obtém o valor da propriedade key.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link ValidationError }
         *     
         */
        public ValidationError getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidationError }
         *     
         */
        public void setValue(ValidationError value) {
            this.value = value;
        }

    }

}
