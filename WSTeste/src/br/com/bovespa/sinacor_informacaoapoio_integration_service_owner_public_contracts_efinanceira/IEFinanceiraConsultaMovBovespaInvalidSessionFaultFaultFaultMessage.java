
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.ws.WebFault;
import br.com.sinacor.sinacor_infra_common_exceptions.InvalidSessionFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidSessionFault", targetNamespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts")
public class IEFinanceiraConsultaMovBovespaInvalidSessionFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidSessionFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IEFinanceiraConsultaMovBovespaInvalidSessionFaultFaultFaultMessage(String message, InvalidSessionFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IEFinanceiraConsultaMovBovespaInvalidSessionFaultFaultFaultMessage(String message, InvalidSessionFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.sinacor.sinacor_infra_common_exceptions.InvalidSessionFault
     */
    public InvalidSessionFault getFaultInfo() {
        return faultInfo;
    }

}
