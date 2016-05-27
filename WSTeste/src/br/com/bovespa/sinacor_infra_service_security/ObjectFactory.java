
package br.com.bovespa.sinacor_infra_service_security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.bovespa.sinacor_infra_service_security package. 
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

    private final static QName _Authenticate6Username_QNAME = new QName("http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", "username");
    private final static QName _Authenticate6PlainTextPassword_QNAME = new QName("http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", "plainTextPassword");
    private final static QName _Authenticate6Domain_QNAME = new QName("http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", "domain");
    private final static QName _AuthenticatePassword_QNAME = new QName("http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", "password");
    private final static QName _Authenticate4EncryptedPassword_QNAME = new QName("http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", "encryptedPassword");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.bovespa.sinacor_infra_service_security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate2 }
     * 
     */
    public Authenticate2 createAuthenticate2() {
        return new Authenticate2();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link Authenticate4 }
     * 
     */
    public Authenticate4 createAuthenticate4() {
        return new Authenticate4();
    }

    /**
     * Create an instance of {@link Authenticate3 }
     * 
     */
    public Authenticate3 createAuthenticate3() {
        return new Authenticate3();
    }

    /**
     * Create an instance of {@link Authenticate6Response }
     * 
     */
    public Authenticate6Response createAuthenticate6Response() {
        return new Authenticate6Response();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link Authenticate4Response }
     * 
     */
    public Authenticate4Response createAuthenticate4Response() {
        return new Authenticate4Response();
    }

    /**
     * Create an instance of {@link Authenticate3Response }
     * 
     */
    public Authenticate3Response createAuthenticate3Response() {
        return new Authenticate3Response();
    }

    /**
     * Create an instance of {@link Authenticate5Response }
     * 
     */
    public Authenticate5Response createAuthenticate5Response() {
        return new Authenticate5Response();
    }

    /**
     * Create an instance of {@link Authenticate6 }
     * 
     */
    public Authenticate6 createAuthenticate6() {
        return new Authenticate6();
    }

    /**
     * Create an instance of {@link Authenticate5 }
     * 
     */
    public Authenticate5 createAuthenticate5() {
        return new Authenticate5();
    }

    /**
     * Create an instance of {@link Authenticate2Response }
     * 
     */
    public Authenticate2Response createAuthenticate2Response() {
        return new Authenticate2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate6 .class)
    public JAXBElement<String> createAuthenticate6Username(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "plainTextPassword", scope = Authenticate6 .class)
    public JAXBElement<String> createAuthenticate6PlainTextPassword(String value) {
        return new JAXBElement<String>(_Authenticate6PlainTextPassword_QNAME, String.class, Authenticate6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "domain", scope = Authenticate6 .class)
    public JAXBElement<String> createAuthenticate6Domain(String value) {
        return new JAXBElement<String>(_Authenticate6Domain_QNAME, String.class, Authenticate6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate5 .class)
    public JAXBElement<String> createAuthenticate5Username(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "plainTextPassword", scope = Authenticate5 .class)
    public JAXBElement<String> createAuthenticate5PlainTextPassword(String value) {
        return new JAXBElement<String>(_Authenticate6PlainTextPassword_QNAME, String.class, Authenticate5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "domain", scope = Authenticate5 .class)
    public JAXBElement<String> createAuthenticate5Domain(String value) {
        return new JAXBElement<String>(_Authenticate6Domain_QNAME, String.class, Authenticate5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateUsername(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "password", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticatePassword(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate4 .class)
    public JAXBElement<String> createAuthenticate4Username(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "encryptedPassword", scope = Authenticate4 .class)
    public JAXBElement<String> createAuthenticate4EncryptedPassword(String value) {
        return new JAXBElement<String>(_Authenticate4EncryptedPassword_QNAME, String.class, Authenticate4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "domain", scope = Authenticate4 .class)
    public JAXBElement<String> createAuthenticate4Domain(String value) {
        return new JAXBElement<String>(_Authenticate6Domain_QNAME, String.class, Authenticate4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate3 .class)
    public JAXBElement<String> createAuthenticate3Username(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "encryptedPassword", scope = Authenticate3 .class)
    public JAXBElement<String> createAuthenticate3EncryptedPassword(String value) {
        return new JAXBElement<String>(_Authenticate4EncryptedPassword_QNAME, String.class, Authenticate3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "domain", scope = Authenticate3 .class)
    public JAXBElement<String> createAuthenticate3Domain(String value) {
        return new JAXBElement<String>(_Authenticate6Domain_QNAME, String.class, Authenticate3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "username", scope = Authenticate2 .class)
    public JAXBElement<String> createAuthenticate2Username(String value) {
        return new JAXBElement<String>(_Authenticate6Username_QNAME, String.class, Authenticate2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.Infra.Service.Security.Services", name = "password", scope = Authenticate2 .class)
    public JAXBElement<String> createAuthenticate2Password(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, Authenticate2 .class, value);
    }

}
