
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.ws.WebFault;
import br.com.sinacor.sinacor_infra_common_exceptions.GeneralFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GeneralFault", targetNamespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts")
public class IEFinanceiraConsultaCadastroGeneralFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GeneralFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IEFinanceiraConsultaCadastroGeneralFaultFaultFaultMessage(String message, GeneralFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IEFinanceiraConsultaCadastroGeneralFaultFaultFaultMessage(String message, GeneralFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.sinacor.sinacor_infra_common_exceptions.GeneralFault
     */
    public GeneralFault getFaultInfo() {
        return faultInfo;
    }

}
