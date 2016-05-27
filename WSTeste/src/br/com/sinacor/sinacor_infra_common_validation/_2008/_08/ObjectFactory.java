
package br.com.sinacor.sinacor_infra_common_validation._2008._08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.sinacor.sinacor_infra_common_validation._2008._08 package. 
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

    private final static QName _ValidationError_QNAME = new QName("http://www.sinacor.com.br/Sinacor.Infra.Common.Validation/2008/08", "ValidationError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.sinacor.sinacor_infra_common_validation._2008._08
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationError }
     * 
     */
    public ValidationError createValidationError() {
        return new ValidationError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sinacor.com.br/Sinacor.Infra.Common.Validation/2008/08", name = "ValidationError")
    public JAXBElement<ValidationError> createValidationError(ValidationError value) {
        return new JAXBElement<ValidationError>(_ValidationError_QNAME, ValidationError.class, null, value);
    }

}
