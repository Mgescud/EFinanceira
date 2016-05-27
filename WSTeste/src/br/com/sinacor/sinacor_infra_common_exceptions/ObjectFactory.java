
package br.com.sinacor.sinacor_infra_common_exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintValidationErrory2K04Te1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.sinacor.sinacor_infra_common_exceptions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BaseLogFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "BaseLogFault");
    private final static QName _InvalidSessionFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "InvalidSessionFault");
    private final static QName _ValidationFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "ValidationFault");
    private final static QName _BaseFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "BaseFault");
    private final static QName _BusinessFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "BusinessFault");
    private final static QName _GeneralFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "GeneralFault");
    private final static QName _AccessIsDeniedFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "AccessIsDeniedFault");
    private final static QName _BaseErrorNumberFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "BaseErrorNumberFault");
    private final static QName _LicensingFault_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "LicensingFault");
    private final static QName _BaseFaultMessage_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "Message");
    private final static QName _ValidationFaultValidationErrors_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "ValidationErrors");
    private final static QName _BaseLogFaultSourceAddress_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "SourceAddress");
    private final static QName _BaseLogFaultLogData_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "LogData");
    private final static QName _BaseErrorNumberFaultResourceKey_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "ResourceKey");
    private final static QName _BusinessFaultParameters_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", "Parameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.sinacor.sinacor_infra_common_exceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationFault }
     * 
     */
    public ValidationFault createValidationFault() {
        return new ValidationFault();
    }

    /**
     * Create an instance of {@link BaseErrorNumberFault }
     * 
     */
    public BaseErrorNumberFault createBaseErrorNumberFault() {
        return new BaseErrorNumberFault();
    }

    /**
     * Create an instance of {@link BaseLogFault }
     * 
     */
    public BaseLogFault createBaseLogFault() {
        return new BaseLogFault();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link LicensingFault }
     * 
     */
    public LicensingFault createLicensingFault() {
        return new LicensingFault();
    }

    /**
     * Create an instance of {@link GeneralFault }
     * 
     */
    public GeneralFault createGeneralFault() {
        return new GeneralFault();
    }

    /**
     * Create an instance of {@link InvalidSessionFault }
     * 
     */
    public InvalidSessionFault createInvalidSessionFault() {
        return new InvalidSessionFault();
    }

    /**
     * Create an instance of {@link AccessIsDeniedFault }
     * 
     */
    public AccessIsDeniedFault createAccessIsDeniedFault() {
        return new AccessIsDeniedFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseLogFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "BaseLogFault")
    public JAXBElement<BaseLogFault> createBaseLogFault(BaseLogFault value) {
        return new JAXBElement<BaseLogFault>(_BaseLogFault_QNAME, BaseLogFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSessionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "InvalidSessionFault")
    public JAXBElement<InvalidSessionFault> createInvalidSessionFault(InvalidSessionFault value) {
        return new JAXBElement<InvalidSessionFault>(_InvalidSessionFault_QNAME, InvalidSessionFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "ValidationFault")
    public JAXBElement<ValidationFault> createValidationFault(ValidationFault value) {
        return new JAXBElement<ValidationFault>(_ValidationFault_QNAME, ValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "BusinessFault")
    public JAXBElement<BusinessFault> createBusinessFault(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_BusinessFault_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "GeneralFault")
    public JAXBElement<GeneralFault> createGeneralFault(GeneralFault value) {
        return new JAXBElement<GeneralFault>(_GeneralFault_QNAME, GeneralFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessIsDeniedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "AccessIsDeniedFault")
    public JAXBElement<AccessIsDeniedFault> createAccessIsDeniedFault(AccessIsDeniedFault value) {
        return new JAXBElement<AccessIsDeniedFault>(_AccessIsDeniedFault_QNAME, AccessIsDeniedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseErrorNumberFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "BaseErrorNumberFault")
    public JAXBElement<BaseErrorNumberFault> createBaseErrorNumberFault(BaseErrorNumberFault value) {
        return new JAXBElement<BaseErrorNumberFault>(_BaseErrorNumberFault_QNAME, BaseErrorNumberFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensingFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "LicensingFault")
    public JAXBElement<LicensingFault> createLicensingFault(LicensingFault value) {
        return new JAXBElement<LicensingFault>(_LicensingFault_QNAME, LicensingFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "Message", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultMessage(String value) {
        return new JAXBElement<String>(_BaseFaultMessage_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintValidationErrory2K04Te1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "ValidationErrors", scope = ValidationFault.class)
    public JAXBElement<ArrayOfKeyValueOfintValidationErrory2K04Te1> createValidationFaultValidationErrors(ArrayOfKeyValueOfintValidationErrory2K04Te1 value) {
        return new JAXBElement<ArrayOfKeyValueOfintValidationErrory2K04Te1>(_ValidationFaultValidationErrors_QNAME, ArrayOfKeyValueOfintValidationErrory2K04Te1 .class, ValidationFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "SourceAddress", scope = BaseLogFault.class)
    public JAXBElement<String> createBaseLogFaultSourceAddress(String value) {
        return new JAXBElement<String>(_BaseLogFaultSourceAddress_QNAME, String.class, BaseLogFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "LogData", scope = BaseLogFault.class)
    public JAXBElement<String> createBaseLogFaultLogData(String value) {
        return new JAXBElement<String>(_BaseLogFaultLogData_QNAME, String.class, BaseLogFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "ResourceKey", scope = BaseErrorNumberFault.class)
    public JAXBElement<String> createBaseErrorNumberFaultResourceKey(String value) {
        return new JAXBElement<String>(_BaseErrorNumberFaultResourceKey_QNAME, String.class, BaseErrorNumberFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Exceptions.FaultContracts", name = "Parameters", scope = BusinessFault.class)
    public JAXBElement<ArrayOfanyType> createBusinessFaultParameters(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_BusinessFaultParameters_QNAME, ArrayOfanyType.class, BusinessFault.class, value);
    }

}
