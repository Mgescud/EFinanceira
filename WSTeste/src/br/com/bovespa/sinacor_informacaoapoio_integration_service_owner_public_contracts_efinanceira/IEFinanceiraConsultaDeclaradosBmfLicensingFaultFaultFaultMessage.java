
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.ws.WebFault;
import br.com.sinacor.sinacor_infra_common_exceptions.LicensingFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "LicensingFault", targetNamespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts")
public class IEFinanceiraConsultaDeclaradosBmfLicensingFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LicensingFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IEFinanceiraConsultaDeclaradosBmfLicensingFaultFaultFaultMessage(String message, LicensingFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IEFinanceiraConsultaDeclaradosBmfLicensingFaultFaultFaultMessage(String message, LicensingFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.sinacor.sinacor_infra_common_exceptions.LicensingFault
     */
    public LicensingFault getFaultInfo() {
        return faultInfo;
    }

}
