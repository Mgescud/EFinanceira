
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.CadastroInfoResponse;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBmf;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoBovespa;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoContaCorrente;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoCustodia;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentoResponse;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira package. 
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

    private final static QName _DetalhesEstrangeiro_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DetalhesEstrangeiro");
    private final static QName _Proprietario_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Proprietario");
    private final static QName _EnderecoProprietario_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "EnderecoProprietario");
    private final static QName _Declarado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Declarado");
    private final static QName _Informativo_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Informativo");
    private final static QName _ArrayOfDeclarado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfDeclarado");
    private final static QName _Documento_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Documento");
    private final static QName _EnderecoDeclarado_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "EnderecoDeclarado");
    private final static QName _DocumentoProprietario_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DocumentoProprietario");
    private final static QName _CadastroInfoRequest_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CadastroInfoRequest");
    private final static QName _Endereco_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Endereco");
    private final static QName _Emissor_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Emissor");
    private final static QName _ArrayOfInformativo_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfInformativo");
    private final static QName _ArrayOfEnderecoDeclarado_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfEnderecoDeclarado");
    private final static QName _ArrayOfDetalhesEstrangeiro_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfDetalhesEstrangeiro");
    private final static QName _DetalhesDocumento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DetalhesDocumento");
    private final static QName _ArrayOfProprietario_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfProprietario");
    private final static QName _ArrayOfEmissor_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ArrayOfEmissor");
    private final static QName _Declarante_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Declarante");
    private final static QName _EmissorNome_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Nome");
    private final static QName _EmissorPrincipal_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Principal");
    private final static QName _EmissorOutroDocumento_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "OutroDocumento");
    private final static QName _EmissorCPFCNPJ_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CPF_CNPJ");
    private final static QName _EmissorTipo_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Tipo");
    private final static QName _InformativoMensagem_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Mensagem");
    private final static QName _CadastroInfoRequestListaClientes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ListaClientes");
    private final static QName _CadastroInfoRequestDataFinal_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DataFinal");
    private final static QName _ConsultaMovBovespaRequest_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "request");
    private final static QName _ConsultaMovCCResponseConsultaMovCCResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaMovCCResult");
    private final static QName _ConsultaDeclaradosBmfResponseConsultaDeclaradosBmfResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaradosBmfResult");
    private final static QName _ConsultaDeclaradosContaCorrenteResponseConsultaDeclaradosContaCorrenteResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaradosContaCorrenteResult");
    private final static QName _ConsultaMovBMFResponseConsultaMovBMFResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaMovBMFResult");
    private final static QName _ConsultaDeclaradosCustodiaResponseConsultaDeclaradosCustodiaResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaradosCustodiaResult");
    private final static QName _ConsultaCadastroResponseConsultaCadastroResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaCadastroResult");
    private final static QName _ConsultaDeclaradoResponseConsultaDeclaradoResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaradoResult");
    private final static QName _ConsultaDeclaradosBovespaResponseConsultaDeclaradosBovespaResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaradosBovespaResult");
    private final static QName _DocumentoProprietarioNumeroDocumento_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NumeroDocumento");
    private final static QName _DocumentoProprietarioTipoDocumento_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "TipoDocumento");
    private final static QName _DocumentoProprietarioCNPJCPF_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CNPJCPF");
    private final static QName _DocumentoProprietarioTipoPessoa_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "TipoPessoa");
    private final static QName _EnderecoDeclaradoSiglaPaisNacionalidade_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaPaisNacionalidade");
    private final static QName _EnderecoDeclaradoBairro_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Bairro");
    private final static QName _DetalhesEstrangeiroCPFCNPJ_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CPF_CNPJ");
    private final static QName _DetalhesEstrangeiroCVM_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CVM");
    private final static QName _EnderecoProprietarioTipoEndereco_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "TipoEndereco");
    private final static QName _EnderecoCEP_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CEP");
    private final static QName _EnderecoCidade_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Cidade");
    private final static QName _EnderecoSiglaPaisEndereco_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaPaisEndereco");
    private final static QName _EnderecoComplemento_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Complemento");
    private final static QName _EnderecoLogradouro_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Logradouro");
    private final static QName _EnderecoNumero_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Numero");
    private final static QName _EnderecoSiglaPaisResidencia_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaPaisResidencia");
    private final static QName _EnderecoSiglaEstadoEndereco_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaEstadoEndereco");
    private final static QName _ConsultaDeclaranteResponseConsultaDeclaranteResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclaranteResult");
    private final static QName _ProprietarioNomeProprietario_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NomeProprietario");
    private final static QName _ProprietarioDataNascFund_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DataNascFund");
    private final static QName _ConsultaMovBovespaResponseConsultaMovBovespaResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaMovBovespaResult");
    private final static QName _DocumentoDadosAtividadeBovespaEstrangeiro_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DadosAtividadeBovespaEstrangeiro");
    private final static QName _DocumentoOutros_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Outros");
    private final static QName _DocumentoDadosAtividadeBmfEstrangeiro_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DadosAtividadeBmfEstrangeiro");
    private final static QName _DocumentoNIF_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NIF");
    private final static QName _DocumentoNIRE_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NIRE");
    private final static QName _DocumentoCVM_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CVM");
    private final static QName _DocumentoRG_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "RG");
    private final static QName _DocumentoGIIN_QNAME = new QName("http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "GIIN");
    private final static QName _DeclaranteEndereco_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Endereco");
    private final static QName _DeclaranteNome_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Nome");
    private final static QName _DeclaranteCNPJ_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CNPJ");
    private final static QName _DetalhesDocumentoCodigoEmissor_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CodigoEmissor");
    private final static QName _DetalhesDocumentoDataEmissao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DataEmissao");
    private final static QName _DetalhesDocumentoDescricaoDocumento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DescricaoDocumento");
    private final static QName _DetalhesDocumentoDescricaoEmissor_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "DescricaoEmissor");
    private final static QName _DetalhesDocumentoSiglaPaisEmissao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaPaisEmissao");
    private final static QName _DetalhesDocumentoTipoDocumento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "TipoDocumento");
    private final static QName _DetalhesDocumentoNumeroDocumento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NumeroDocumento");
    private final static QName _DetalhesDocumentoSiglaEstadoEmissao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "SiglaEstadoEmissao");
    private final static QName _ConsultaDeclaradosCFCCBOVBMFResponseConsultaDeclaradosCFCCBOVBMFResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaDeclarados_CF_CC_BOV_BMFResult");
    private final static QName _DeclaradoMovimentoContaCorrente_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "MovimentoContaCorrente");
    private final static QName _DeclaradoListaEndereco_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ListaEndereco");
    private final static QName _DeclaradoMovimentoBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "MovimentoBovespa");
    private final static QName _DeclaradoMovimentoBmf_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "MovimentoBmf");
    private final static QName _DeclaradoCodigoTipoPessoa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "CodigoTipoPessoa");
    private final static QName _DeclaradoDocumentacao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "Documentacao");
    private final static QName _DeclaradoMovimentoCustodia_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "MovimentoCustodia");
    private final static QName _DeclaradoNomeDeclarado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "NomeDeclarado");
    private final static QName _DeclaradoListaProprietarios_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", "ListaProprietarios");
    private final static QName _ConsultaMovCustodiaResponseConsultaMovCustodiaResult_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", "ConsultaMovCustodiaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Declarado }
     * 
     */
    public Declarado createDeclarado() {
        return new Declarado();
    }

    /**
     * Create an instance of {@link DetalhesDocumento }
     * 
     */
    public DetalhesDocumento createDetalhesDocumento() {
        return new DetalhesDocumento();
    }

    /**
     * Create an instance of {@link Declarante }
     * 
     */
    public Declarante createDeclarante() {
        return new Declarante();
    }

    /**
     * Create an instance of {@link ArrayOfDeclarado }
     * 
     */
    public ArrayOfDeclarado createArrayOfDeclarado() {
        return new ArrayOfDeclarado();
    }

    /**
     * Create an instance of {@link ArrayOfDetalhesEstrangeiro }
     * 
     */
    public ArrayOfDetalhesEstrangeiro createArrayOfDetalhesEstrangeiro() {
        return new ArrayOfDetalhesEstrangeiro();
    }

    /**
     * Create an instance of {@link CadastroInfoRequest }
     * 
     */
    public CadastroInfoRequest createCadastroInfoRequest() {
        return new CadastroInfoRequest();
    }

    /**
     * Create an instance of {@link DetalhesEstrangeiro }
     * 
     */
    public DetalhesEstrangeiro createDetalhesEstrangeiro() {
        return new DetalhesEstrangeiro();
    }

    /**
     * Create an instance of {@link ConsultaMovCCResponse }
     * 
     */
    public ConsultaMovCCResponse createConsultaMovCCResponse() {
        return new ConsultaMovCCResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclarante }
     * 
     */
    public ConsultaDeclarante createConsultaDeclarante() {
        return new ConsultaDeclarante();
    }

    /**
     * Create an instance of {@link ConsultaMovBovespaResponse }
     * 
     */
    public ConsultaMovBovespaResponse createConsultaMovBovespaResponse() {
        return new ConsultaMovBovespaResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosContaCorrenteResponse }
     * 
     */
    public ConsultaDeclaradosContaCorrenteResponse createConsultaDeclaradosContaCorrenteResponse() {
        return new ConsultaDeclaradosContaCorrenteResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovBMF }
     * 
     */
    public ConsultaMovBMF createConsultaMovBMF() {
        return new ConsultaMovBMF();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosBovespa }
     * 
     */
    public ConsultaDeclaradosBovespa createConsultaDeclaradosBovespa() {
        return new ConsultaDeclaradosBovespa();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosCFCCBOVBMF }
     * 
     */
    public ConsultaDeclaradosCFCCBOVBMF createConsultaDeclaradosCFCCBOVBMF() {
        return new ConsultaDeclaradosCFCCBOVBMF();
    }

    /**
     * Create an instance of {@link ConsultaMovBMFResponse }
     * 
     */
    public ConsultaMovBMFResponse createConsultaMovBMFResponse() {
        return new ConsultaMovBMFResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosBovespaResponse }
     * 
     */
    public ConsultaDeclaradosBovespaResponse createConsultaDeclaradosBovespaResponse() {
        return new ConsultaDeclaradosBovespaResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosBmf }
     * 
     */
    public ConsultaDeclaradosBmf createConsultaDeclaradosBmf() {
        return new ConsultaDeclaradosBmf();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosCustodia }
     * 
     */
    public ConsultaDeclaradosCustodia createConsultaDeclaradosCustodia() {
        return new ConsultaDeclaradosCustodia();
    }

    /**
     * Create an instance of {@link ConsultaCadastroResponse }
     * 
     */
    public ConsultaCadastroResponse createConsultaCadastroResponse() {
        return new ConsultaCadastroResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovCustodia }
     * 
     */
    public ConsultaMovCustodia createConsultaMovCustodia() {
        return new ConsultaMovCustodia();
    }

    /**
     * Create an instance of {@link ConsultaDeclaranteResponse }
     * 
     */
    public ConsultaDeclaranteResponse createConsultaDeclaranteResponse() {
        return new ConsultaDeclaranteResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosCFCCBOVBMFResponse }
     * 
     */
    public ConsultaDeclaradosCFCCBOVBMFResponse createConsultaDeclaradosCFCCBOVBMFResponse() {
        return new ConsultaDeclaradosCFCCBOVBMFResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosBmfResponse }
     * 
     */
    public ConsultaDeclaradosBmfResponse createConsultaDeclaradosBmfResponse() {
        return new ConsultaDeclaradosBmfResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovBovespa }
     * 
     */
    public ConsultaMovBovespa createConsultaMovBovespa() {
        return new ConsultaMovBovespa();
    }

    /**
     * Create an instance of {@link ConsultaDeclarado }
     * 
     */
    public ConsultaDeclarado createConsultaDeclarado() {
        return new ConsultaDeclarado();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosCustodiaResponse }
     * 
     */
    public ConsultaDeclaradosCustodiaResponse createConsultaDeclaradosCustodiaResponse() {
        return new ConsultaDeclaradosCustodiaResponse();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradoResponse }
     * 
     */
    public ConsultaDeclaradoResponse createConsultaDeclaradoResponse() {
        return new ConsultaDeclaradoResponse();
    }

    /**
     * Create an instance of {@link ConsultaCadastro }
     * 
     */
    public ConsultaCadastro createConsultaCadastro() {
        return new ConsultaCadastro();
    }

    /**
     * Create an instance of {@link ConsultaDeclaradosContaCorrente }
     * 
     */
    public ConsultaDeclaradosContaCorrente createConsultaDeclaradosContaCorrente() {
        return new ConsultaDeclaradosContaCorrente();
    }

    /**
     * Create an instance of {@link ConsultaMovCustodiaResponse }
     * 
     */
    public ConsultaMovCustodiaResponse createConsultaMovCustodiaResponse() {
        return new ConsultaMovCustodiaResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovCC }
     * 
     */
    public ConsultaMovCC createConsultaMovCC() {
        return new ConsultaMovCC();
    }

    /**
     * Create an instance of {@link ArrayOfProprietario }
     * 
     */
    public ArrayOfProprietario createArrayOfProprietario() {
        return new ArrayOfProprietario();
    }

    /**
     * Create an instance of {@link ArrayOfEmissor }
     * 
     */
    public ArrayOfEmissor createArrayOfEmissor() {
        return new ArrayOfEmissor();
    }

    /**
     * Create an instance of {@link ArrayOfEnderecoDeclarado }
     * 
     */
    public ArrayOfEnderecoDeclarado createArrayOfEnderecoDeclarado() {
        return new ArrayOfEnderecoDeclarado();
    }

    /**
     * Create an instance of {@link EnderecoDeclarado }
     * 
     */
    public EnderecoDeclarado createEnderecoDeclarado() {
        return new EnderecoDeclarado();
    }

    /**
     * Create an instance of {@link Proprietario }
     * 
     */
    public Proprietario createProprietario() {
        return new Proprietario();
    }

    /**
     * Create an instance of {@link DocumentoProprietario }
     * 
     */
    public DocumentoProprietario createDocumentoProprietario() {
        return new DocumentoProprietario();
    }

    /**
     * Create an instance of {@link ArrayOfInformativo }
     * 
     */
    public ArrayOfInformativo createArrayOfInformativo() {
        return new ArrayOfInformativo();
    }

    /**
     * Create an instance of {@link Informativo }
     * 
     */
    public Informativo createInformativo() {
        return new Informativo();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link EnderecoProprietario }
     * 
     */
    public EnderecoProprietario createEnderecoProprietario() {
        return new EnderecoProprietario();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link Emissor }
     * 
     */
    public Emissor createEmissor() {
        return new Emissor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesEstrangeiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DetalhesEstrangeiro")
    public JAXBElement<DetalhesEstrangeiro> createDetalhesEstrangeiro(DetalhesEstrangeiro value) {
        return new JAXBElement<DetalhesEstrangeiro>(_DetalhesEstrangeiro_QNAME, DetalhesEstrangeiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Proprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Proprietario")
    public JAXBElement<Proprietario> createProprietario(Proprietario value) {
        return new JAXBElement<Proprietario>(_Proprietario_QNAME, Proprietario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "EnderecoProprietario")
    public JAXBElement<EnderecoProprietario> createEnderecoProprietario(EnderecoProprietario value) {
        return new JAXBElement<EnderecoProprietario>(_EnderecoProprietario_QNAME, EnderecoProprietario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Declarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Declarado")
    public JAXBElement<Declarado> createDeclarado(Declarado value) {
        return new JAXBElement<Declarado>(_Declarado_QNAME, Declarado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Informativo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Informativo")
    public JAXBElement<Informativo> createInformativo(Informativo value) {
        return new JAXBElement<Informativo>(_Informativo_QNAME, Informativo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeclarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfDeclarado")
    public JAXBElement<ArrayOfDeclarado> createArrayOfDeclarado(ArrayOfDeclarado value) {
        return new JAXBElement<ArrayOfDeclarado>(_ArrayOfDeclarado_QNAME, ArrayOfDeclarado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Documento")
    public JAXBElement<Documento> createDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDeclarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "EnderecoDeclarado")
    public JAXBElement<EnderecoDeclarado> createEnderecoDeclarado(EnderecoDeclarado value) {
        return new JAXBElement<EnderecoDeclarado>(_EnderecoDeclarado_QNAME, EnderecoDeclarado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DocumentoProprietario")
    public JAXBElement<DocumentoProprietario> createDocumentoProprietario(DocumentoProprietario value) {
        return new JAXBElement<DocumentoProprietario>(_DocumentoProprietario_QNAME, DocumentoProprietario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CadastroInfoRequest")
    public JAXBElement<CadastroInfoRequest> createCadastroInfoRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_CadastroInfoRequest_QNAME, CadastroInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Endereco")
    public JAXBElement<Endereco> createEndereco(Endereco value) {
        return new JAXBElement<Endereco>(_Endereco_QNAME, Endereco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Emissor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Emissor")
    public JAXBElement<Emissor> createEmissor(Emissor value) {
        return new JAXBElement<Emissor>(_Emissor_QNAME, Emissor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformativo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfInformativo")
    public JAXBElement<ArrayOfInformativo> createArrayOfInformativo(ArrayOfInformativo value) {
        return new JAXBElement<ArrayOfInformativo>(_ArrayOfInformativo_QNAME, ArrayOfInformativo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoDeclarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfEnderecoDeclarado")
    public JAXBElement<ArrayOfEnderecoDeclarado> createArrayOfEnderecoDeclarado(ArrayOfEnderecoDeclarado value) {
        return new JAXBElement<ArrayOfEnderecoDeclarado>(_ArrayOfEnderecoDeclarado_QNAME, ArrayOfEnderecoDeclarado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfDetalhesEstrangeiro")
    public JAXBElement<ArrayOfDetalhesEstrangeiro> createArrayOfDetalhesEstrangeiro(ArrayOfDetalhesEstrangeiro value) {
        return new JAXBElement<ArrayOfDetalhesEstrangeiro>(_ArrayOfDetalhesEstrangeiro_QNAME, ArrayOfDetalhesEstrangeiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DetalhesDocumento")
    public JAXBElement<DetalhesDocumento> createDetalhesDocumento(DetalhesDocumento value) {
        return new JAXBElement<DetalhesDocumento>(_DetalhesDocumento_QNAME, DetalhesDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfProprietario")
    public JAXBElement<ArrayOfProprietario> createArrayOfProprietario(ArrayOfProprietario value) {
        return new JAXBElement<ArrayOfProprietario>(_ArrayOfProprietario_QNAME, ArrayOfProprietario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmissor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ArrayOfEmissor")
    public JAXBElement<ArrayOfEmissor> createArrayOfEmissor(ArrayOfEmissor value) {
        return new JAXBElement<ArrayOfEmissor>(_ArrayOfEmissor_QNAME, ArrayOfEmissor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Declarante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Declarante")
    public JAXBElement<Declarante> createDeclarante(Declarante value) {
        return new JAXBElement<Declarante>(_Declarante_QNAME, Declarante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Nome", scope = Emissor.class)
    public JAXBElement<String> createEmissorNome(String value) {
        return new JAXBElement<String>(_EmissorNome_QNAME, String.class, Emissor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Principal", scope = Emissor.class)
    public JAXBElement<String> createEmissorPrincipal(String value) {
        return new JAXBElement<String>(_EmissorPrincipal_QNAME, String.class, Emissor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "OutroDocumento", scope = Emissor.class)
    public JAXBElement<String> createEmissorOutroDocumento(String value) {
        return new JAXBElement<String>(_EmissorOutroDocumento_QNAME, String.class, Emissor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CPF_CNPJ", scope = Emissor.class)
    public JAXBElement<Long> createEmissorCPFCNPJ(Long value) {
        return new JAXBElement<Long>(_EmissorCPFCNPJ_QNAME, Long.class, Emissor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Tipo", scope = Emissor.class)
    public JAXBElement<String> createEmissorTipo(String value) {
        return new JAXBElement<String>(_EmissorTipo_QNAME, String.class, Emissor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Mensagem", scope = Informativo.class)
    public JAXBElement<String> createInformativoMensagem(String value) {
        return new JAXBElement<String>(_InformativoMensagem_QNAME, String.class, Informativo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ListaClientes", scope = CadastroInfoRequest.class)
    public JAXBElement<ArrayOfstring> createCadastroInfoRequestListaClientes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CadastroInfoRequestListaClientes_QNAME, ArrayOfstring.class, CadastroInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DataFinal", scope = CadastroInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCadastroInfoRequestDataFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CadastroInfoRequestDataFinal_QNAME, XMLGregorianCalendar.class, CadastroInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaMovBovespa.class)
    public JAXBElement<CadastroInfoRequest> createConsultaMovBovespaRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaMovBovespa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaMovCCResult", scope = ConsultaMovCCResponse.class)
    public JAXBElement<MovimentoResponse> createConsultaMovCCResponseConsultaMovCCResult(MovimentoResponse value) {
        return new JAXBElement<MovimentoResponse>(_ConsultaMovCCResponseConsultaMovCCResult_QNAME, MovimentoResponse.class, ConsultaMovCCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaradosBmfResult", scope = ConsultaDeclaradosBmfResponse.class)
    public JAXBElement<ArrayOfstring> createConsultaDeclaradosBmfResponseConsultaDeclaradosBmfResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConsultaDeclaradosBmfResponseConsultaDeclaradosBmfResult_QNAME, ArrayOfstring.class, ConsultaDeclaradosBmfResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaradosContaCorrenteResult", scope = ConsultaDeclaradosContaCorrenteResponse.class)
    public JAXBElement<ArrayOfstring> createConsultaDeclaradosContaCorrenteResponseConsultaDeclaradosContaCorrenteResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConsultaDeclaradosContaCorrenteResponseConsultaDeclaradosContaCorrenteResult_QNAME, ArrayOfstring.class, ConsultaDeclaradosContaCorrenteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaMovBMFResult", scope = ConsultaMovBMFResponse.class)
    public JAXBElement<MovimentoResponse> createConsultaMovBMFResponseConsultaMovBMFResult(MovimentoResponse value) {
        return new JAXBElement<MovimentoResponse>(_ConsultaMovBMFResponseConsultaMovBMFResult_QNAME, MovimentoResponse.class, ConsultaMovBMFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaCadastro.class)
    public JAXBElement<CadastroInfoRequest> createConsultaCadastroRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaCadastro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaradosCustodiaResult", scope = ConsultaDeclaradosCustodiaResponse.class)
    public JAXBElement<ArrayOfstring> createConsultaDeclaradosCustodiaResponseConsultaDeclaradosCustodiaResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConsultaDeclaradosCustodiaResponseConsultaDeclaradosCustodiaResult_QNAME, ArrayOfstring.class, ConsultaDeclaradosCustodiaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaCadastroResult", scope = ConsultaCadastroResponse.class)
    public JAXBElement<CadastroInfoResponse> createConsultaCadastroResponseConsultaCadastroResult(CadastroInfoResponse value) {
        return new JAXBElement<CadastroInfoResponse>(_ConsultaCadastroResponseConsultaCadastroResult_QNAME, CadastroInfoResponse.class, ConsultaCadastroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaradoResult", scope = ConsultaDeclaradoResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ> createConsultaDeclaradoResponseConsultaDeclaradoResult(ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ value) {
        return new JAXBElement<ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ>(_ConsultaDeclaradoResponseConsultaDeclaradoResult_QNAME, ArrayOfKeyValueOfstringDeclaradoia3Ss9NZ.class, ConsultaDeclaradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaradosBovespaResult", scope = ConsultaDeclaradosBovespaResponse.class)
    public JAXBElement<ArrayOfstring> createConsultaDeclaradosBovespaResponseConsultaDeclaradosBovespaResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConsultaDeclaradosBovespaResponseConsultaDeclaradosBovespaResult_QNAME, ArrayOfstring.class, ConsultaDeclaradosBovespaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NumeroDocumento", scope = DocumentoProprietario.class)
    public JAXBElement<String> createDocumentoProprietarioNumeroDocumento(String value) {
        return new JAXBElement<String>(_DocumentoProprietarioNumeroDocumento_QNAME, String.class, DocumentoProprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "TipoDocumento", scope = DocumentoProprietario.class)
    public JAXBElement<String> createDocumentoProprietarioTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoProprietarioTipoDocumento_QNAME, String.class, DocumentoProprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CNPJCPF", scope = DocumentoProprietario.class)
    public JAXBElement<Long> createDocumentoProprietarioCNPJCPF(Long value) {
        return new JAXBElement<Long>(_DocumentoProprietarioCNPJCPF_QNAME, Long.class, DocumentoProprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "TipoPessoa", scope = DocumentoProprietario.class)
    public JAXBElement<String> createDocumentoProprietarioTipoPessoa(String value) {
        return new JAXBElement<String>(_DocumentoProprietarioTipoPessoa_QNAME, String.class, DocumentoProprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaPaisNacionalidade", scope = EnderecoDeclarado.class)
    public JAXBElement<String> createEnderecoDeclaradoSiglaPaisNacionalidade(String value) {
        return new JAXBElement<String>(_EnderecoDeclaradoSiglaPaisNacionalidade_QNAME, String.class, EnderecoDeclarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Bairro", scope = EnderecoDeclarado.class)
    public JAXBElement<String> createEnderecoDeclaradoBairro(String value) {
        return new JAXBElement<String>(_EnderecoDeclaradoBairro_QNAME, String.class, EnderecoDeclarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaMovCC.class)
    public JAXBElement<CadastroInfoRequest> createConsultaMovCCRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaMovCC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CPF_CNPJ", scope = DetalhesEstrangeiro.class)
    public JAXBElement<Long> createDetalhesEstrangeiroCPFCNPJ(Long value) {
        return new JAXBElement<Long>(_DetalhesEstrangeiroCPFCNPJ_QNAME, Long.class, DetalhesEstrangeiro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CVM", scope = DetalhesEstrangeiro.class)
    public JAXBElement<String> createDetalhesEstrangeiroCVM(String value) {
        return new JAXBElement<String>(_DetalhesEstrangeiroCVM_QNAME, String.class, DetalhesEstrangeiro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "TipoEndereco", scope = EnderecoProprietario.class)
    public JAXBElement<String> createEnderecoProprietarioTipoEndereco(String value) {
        return new JAXBElement<String>(_EnderecoProprietarioTipoEndereco_QNAME, String.class, EnderecoProprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CEP", scope = Endereco.class)
    public JAXBElement<String> createEnderecoCEP(String value) {
        return new JAXBElement<String>(_EnderecoCEP_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Cidade", scope = Endereco.class)
    public JAXBElement<String> createEnderecoCidade(String value) {
        return new JAXBElement<String>(_EnderecoCidade_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaPaisEndereco", scope = Endereco.class)
    public JAXBElement<String> createEnderecoSiglaPaisEndereco(String value) {
        return new JAXBElement<String>(_EnderecoSiglaPaisEndereco_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Complemento", scope = Endereco.class)
    public JAXBElement<String> createEnderecoComplemento(String value) {
        return new JAXBElement<String>(_EnderecoComplemento_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Logradouro", scope = Endereco.class)
    public JAXBElement<String> createEnderecoLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoLogradouro_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Numero", scope = Endereco.class)
    public JAXBElement<String> createEnderecoNumero(String value) {
        return new JAXBElement<String>(_EnderecoNumero_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaPaisResidencia", scope = Endereco.class)
    public JAXBElement<String> createEnderecoSiglaPaisResidencia(String value) {
        return new JAXBElement<String>(_EnderecoSiglaPaisResidencia_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaEstadoEndereco", scope = Endereco.class)
    public JAXBElement<String> createEnderecoSiglaEstadoEndereco(String value) {
        return new JAXBElement<String>(_EnderecoSiglaEstadoEndereco_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Declarante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclaranteResult", scope = ConsultaDeclaranteResponse.class)
    public JAXBElement<Declarante> createConsultaDeclaranteResponseConsultaDeclaranteResult(Declarante value) {
        return new JAXBElement<Declarante>(_ConsultaDeclaranteResponseConsultaDeclaranteResult_QNAME, Declarante.class, ConsultaDeclaranteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NomeProprietario", scope = Proprietario.class)
    public JAXBElement<String> createProprietarioNomeProprietario(String value) {
        return new JAXBElement<String>(_ProprietarioNomeProprietario_QNAME, String.class, Proprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Documento", scope = Proprietario.class)
    public JAXBElement<DocumentoProprietario> createProprietarioDocumento(DocumentoProprietario value) {
        return new JAXBElement<DocumentoProprietario>(_Documento_QNAME, DocumentoProprietario.class, Proprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "EnderecoProprietario", scope = Proprietario.class)
    public JAXBElement<EnderecoProprietario> createProprietarioEnderecoProprietario(EnderecoProprietario value) {
        return new JAXBElement<EnderecoProprietario>(_EnderecoProprietario_QNAME, EnderecoProprietario.class, Proprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DataNascFund", scope = Proprietario.class)
    public JAXBElement<XMLGregorianCalendar> createProprietarioDataNascFund(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProprietarioDataNascFund_QNAME, XMLGregorianCalendar.class, Proprietario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaMovBovespaResult", scope = ConsultaMovBovespaResponse.class)
    public JAXBElement<MovimentoResponse> createConsultaMovBovespaResponseConsultaMovBovespaResult(MovimentoResponse value) {
        return new JAXBElement<MovimentoResponse>(_ConsultaMovBovespaResponseConsultaMovBovespaResult_QNAME, MovimentoResponse.class, ConsultaMovBovespaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaMovBMF.class)
    public JAXBElement<CadastroInfoRequest> createConsultaMovBMFRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaMovBMF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaMovCustodia.class)
    public JAXBElement<CadastroInfoRequest> createConsultaMovCustodiaRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaMovCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DadosAtividadeBovespaEstrangeiro", scope = Documento.class)
    public JAXBElement<ArrayOfDetalhesEstrangeiro> createDocumentoDadosAtividadeBovespaEstrangeiro(ArrayOfDetalhesEstrangeiro value) {
        return new JAXBElement<ArrayOfDetalhesEstrangeiro>(_DocumentoDadosAtividadeBovespaEstrangeiro_QNAME, ArrayOfDetalhesEstrangeiro.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Outros", scope = Documento.class)
    public JAXBElement<DetalhesDocumento> createDocumentoOutros(DetalhesDocumento value) {
        return new JAXBElement<DetalhesDocumento>(_DocumentoOutros_QNAME, DetalhesDocumento.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalhesEstrangeiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DadosAtividadeBmfEstrangeiro", scope = Documento.class)
    public JAXBElement<ArrayOfDetalhesEstrangeiro> createDocumentoDadosAtividadeBmfEstrangeiro(ArrayOfDetalhesEstrangeiro value) {
        return new JAXBElement<ArrayOfDetalhesEstrangeiro>(_DocumentoDadosAtividadeBmfEstrangeiro_QNAME, ArrayOfDetalhesEstrangeiro.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NIF", scope = Documento.class)
    public JAXBElement<String> createDocumentoNIF(String value) {
        return new JAXBElement<String>(_DocumentoNIF_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NIRE", scope = Documento.class)
    public JAXBElement<Long> createDocumentoNIRE(Long value) {
        return new JAXBElement<Long>(_DocumentoNIRE_QNAME, Long.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CVM", scope = Documento.class)
    public JAXBElement<String> createDocumentoCVM(String value) {
        return new JAXBElement<String>(_DocumentoCVM_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "RG", scope = Documento.class)
    public JAXBElement<DetalhesDocumento> createDocumentoRG(DetalhesDocumento value) {
        return new JAXBElement<DetalhesDocumento>(_DocumentoRG_QNAME, DetalhesDocumento.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "GIIN", scope = Documento.class)
    public JAXBElement<String> createDocumentoGIIN(String value) {
        return new JAXBElement<String>(_DocumentoGIIN_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Endereco", scope = Declarante.class)
    public JAXBElement<Endereco> createDeclaranteEndereco(Endereco value) {
        return new JAXBElement<Endereco>(_DeclaranteEndereco_QNAME, Endereco.class, Declarante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Nome", scope = Declarante.class)
    public JAXBElement<String> createDeclaranteNome(String value) {
        return new JAXBElement<String>(_DeclaranteNome_QNAME, String.class, Declarante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CNPJ", scope = Declarante.class)
    public JAXBElement<String> createDeclaranteCNPJ(String value) {
        return new JAXBElement<String>(_DeclaranteCNPJ_QNAME, String.class, Declarante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CodigoEmissor", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoCodigoEmissor(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoCodigoEmissor_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DataEmissao", scope = DetalhesDocumento.class)
    public JAXBElement<XMLGregorianCalendar> createDetalhesDocumentoDataEmissao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetalhesDocumentoDataEmissao_QNAME, XMLGregorianCalendar.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DescricaoDocumento", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoDescricaoDocumento(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoDescricaoDocumento_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "DescricaoEmissor", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoDescricaoEmissor(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoDescricaoEmissor_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaPaisEmissao", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoSiglaPaisEmissao(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoSiglaPaisEmissao_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "TipoDocumento", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoTipoDocumento(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoTipoDocumento_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NumeroDocumento", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoNumeroDocumento(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoNumeroDocumento_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "SiglaEstadoEmissao", scope = DetalhesDocumento.class)
    public JAXBElement<String> createDetalhesDocumentoSiglaEstadoEmissao(String value) {
        return new JAXBElement<String>(_DetalhesDocumentoSiglaEstadoEmissao_QNAME, String.class, DetalhesDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaDeclarados_CF_CC_BOV_BMFResult", scope = ConsultaDeclaradosCFCCBOVBMFResponse.class)
    public JAXBElement<ArrayOfstring> createConsultaDeclaradosCFCCBOVBMFResponseConsultaDeclaradosCFCCBOVBMFResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConsultaDeclaradosCFCCBOVBMFResponseConsultaDeclaradosCFCCBOVBMFResult_QNAME, ArrayOfstring.class, ConsultaDeclaradosCFCCBOVBMFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "request", scope = ConsultaDeclarado.class)
    public JAXBElement<CadastroInfoRequest> createConsultaDeclaradoRequest(CadastroInfoRequest value) {
        return new JAXBElement<CadastroInfoRequest>(_ConsultaMovBovespaRequest_QNAME, CadastroInfoRequest.class, ConsultaDeclarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoContaCorrente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "MovimentoContaCorrente", scope = Declarado.class)
    public JAXBElement<MovimentacaoContaCorrente> createDeclaradoMovimentoContaCorrente(MovimentacaoContaCorrente value) {
        return new JAXBElement<MovimentacaoContaCorrente>(_DeclaradoMovimentoContaCorrente_QNAME, MovimentacaoContaCorrente.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoDeclarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ListaEndereco", scope = Declarado.class)
    public JAXBElement<ArrayOfEnderecoDeclarado> createDeclaradoListaEndereco(ArrayOfEnderecoDeclarado value) {
        return new JAXBElement<ArrayOfEnderecoDeclarado>(_DeclaradoListaEndereco_QNAME, ArrayOfEnderecoDeclarado.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoBovespa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "MovimentoBovespa", scope = Declarado.class)
    public JAXBElement<MovimentacaoBovespa> createDeclaradoMovimentoBovespa(MovimentacaoBovespa value) {
        return new JAXBElement<MovimentacaoBovespa>(_DeclaradoMovimentoBovespa_QNAME, MovimentacaoBovespa.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "MovimentoBmf", scope = Declarado.class)
    public JAXBElement<MovimentacaoBmf> createDeclaradoMovimentoBmf(MovimentacaoBmf value) {
        return new JAXBElement<MovimentacaoBmf>(_DeclaradoMovimentoBmf_QNAME, MovimentacaoBmf.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "CodigoTipoPessoa", scope = Declarado.class)
    public JAXBElement<String> createDeclaradoCodigoTipoPessoa(String value) {
        return new JAXBElement<String>(_DeclaradoCodigoTipoPessoa_QNAME, String.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "Documentacao", scope = Declarado.class)
    public JAXBElement<Documento> createDeclaradoDocumentacao(Documento value) {
        return new JAXBElement<Documento>(_DeclaradoDocumentacao_QNAME, Documento.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoCustodia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "MovimentoCustodia", scope = Declarado.class)
    public JAXBElement<MovimentacaoCustodia> createDeclaradoMovimentoCustodia(MovimentacaoCustodia value) {
        return new JAXBElement<MovimentacaoCustodia>(_DeclaradoMovimentoCustodia_QNAME, MovimentacaoCustodia.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "NomeDeclarado", scope = Declarado.class)
    public JAXBElement<String> createDeclaradoNomeDeclarado(String value) {
        return new JAXBElement<String>(_DeclaradoNomeDeclarado_QNAME, String.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProprietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity", name = "ListaProprietarios", scope = Declarado.class)
    public JAXBElement<ArrayOfProprietario> createDeclaradoListaProprietarios(ArrayOfProprietario value) {
        return new JAXBElement<ArrayOfProprietario>(_DeclaradoListaProprietarios_QNAME, ArrayOfProprietario.class, Declarado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationService", name = "ConsultaMovCustodiaResult", scope = ConsultaMovCustodiaResponse.class)
    public JAXBElement<MovimentoResponse> createConsultaMovCustodiaResponseConsultaMovCustodiaResult(MovimentoResponse value) {
        return new JAXBElement<MovimentoResponse>(_ConsultaMovCustodiaResponseConsultaMovCustodiaResult_QNAME, MovimentoResponse.class, ConsultaMovCustodiaResponse.class, value);
    }

}
