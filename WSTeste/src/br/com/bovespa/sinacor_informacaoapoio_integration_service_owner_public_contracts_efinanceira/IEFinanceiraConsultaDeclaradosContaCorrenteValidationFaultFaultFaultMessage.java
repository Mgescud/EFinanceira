
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.ws.WebFault;
import br.com.sinacor.sinacor_infra_common_exceptions.ValidationFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ValidationFault", targetNamespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts")
public class IEFinanceiraConsultaDeclaradosContaCorrenteValidationFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ValidationFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IEFinanceiraConsultaDeclaradosContaCorrenteValidationFaultFaultFaultMessage(String message, ValidationFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IEFinanceiraConsultaDeclaradosContaCorrenteValidationFaultFaultFaultMessage(String message, ValidationFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.sinacor.sinacor_infra_common_exceptions.ValidationFault
     */
    public ValidationFault getFaultInfo() {
        return faultInfo;
    }

}
