
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InvalidSessionFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InvalidSessionFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts}BaseLogFault">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidSessionFault")
public class InvalidSessionFault
    extends BaseLogFault
{


}
