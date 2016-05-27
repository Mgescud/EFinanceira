
package br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfDeclarado;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfEmissor;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.ArrayOfInformativo;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.Declarante;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity package. 
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

    private final static QName _MovimentacaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "Movimentacao_VisOpcOpvTer");
    private final static QName _ArrayOfMovimentacaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfMovimentacao_VisOpcOpvTer");
    private final static QName _MovimentacaoBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "MovimentacaoBovespa");
    private final static QName _MovimentacaoCustodia_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentacaoCustodia");
    private final static QName _ArrayOfPosicaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfPosicao_VisOpcOpvTer");
    private final static QName _MovimentacaoFinanceiraBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "MovimentacaoFinanceiraBovespa");
    private final static QName _MovimentacaoBTC_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentacaoBTC");
    private final static QName _ArrayOfPosicaoBtc_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfPosicaoBtc");
    private final static QName _MovimentacaoBmf_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentacaoBmf");
    private final static QName _Base_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "Base");
    private final static QName _MovimentacaoSimples_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "MovimentacaoSimples");
    private final static QName _MovimentoResponse_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "MovimentoResponse");
    private final static QName _MovimentacaoTD_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentacaoTD");
    private final static QName _ArrayOfPosicaoTesouroDireto_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfPosicaoTesouroDireto");
    private final static QName _PosicaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "Posicao_VisOpcOpvTer");
    private final static QName _MovimentoCustodia_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentoCustodia");
    private final static QName _MovimentoBMF_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentoBMF");
    private final static QName _PosicaoBtc_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "PosicaoBtc");
    private final static QName _MovimentacaoDetalhada_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "MovimentacaoDetalhada");
    private final static QName _PosicaoTesouroDireto_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "PosicaoTesouroDireto");
    private final static QName _CadastroInfoResponse_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "CadastroInfoResponse");
    private final static QName _ArrayOfPosicaoFinanceiraUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "ArrayOfPosicaoFinanceiraUltimoDiaMes");
    private final static QName _ArrayOfMovimentacaoTD_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfMovimentacaoTD");
    private final static QName _MovimentacaoFinanceiraBmf_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentacaoFinanceiraBmf");
    private final static QName _ArrayOfMovimentacaoFinanceiraBmf_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "ArrayOfMovimentacaoFinanceiraBmf");
    private final static QName _MovimentacaoFinanceiraCC_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "MovimentacaoFinanceiraCC");
    private final static QName _ArrayOfMovimentacaoDetalhada_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "ArrayOfMovimentacaoDetalhada");
    private final static QName _ArrayOfMovimentacaoSimples_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "ArrayOfMovimentacaoSimples");
    private final static QName _PosicaoFinanceiraUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "PosicaoFinanceiraUltimoDiaMes");
    private final static QName _MovimentacaoContaCorrente_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "MovimentacaoContaCorrente");
    private final static QName _ArrayOfMovimentacaoBTC_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ArrayOfMovimentacaoBTC");
    private final static QName _ArrayOfMovimentacaoFinanceiraBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "ArrayOfMovimentacaoFinanceiraBovespa");
    private final static QName _MovimentoCustodiaQuantidade_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "Quantidade");
    private final static QName _MovimentacaoDetalhadaDebitoMesmaTitularidade_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "DebitoMesmaTitularidade");
    private final static QName _MovimentacaoDetalhadaDebito_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "Debito");
    private final static QName _MovimentacaoDetalhadaValorDisponivelFinal_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "ValorDisponivelFinal");
    private final static QName _MovimentacaoDetalhadaCreditoMesmaTitularidade_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "CreditoMesmaTitularidade");
    private final static QName _MovimentacaoDetalhadaCredito_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "Credito");
    private final static QName _MovimentoResponseDadosBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "DadosBovespa");
    private final static QName _MovimentoResponseDadosBMF_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "DadosBMF");
    private final static QName _MovimentoResponseDadosCC_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "DadosCC");
    private final static QName _MovimentoResponseDadosCustodia_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "DadosCustodia");
    private final static QName _MovimentoResponseInformativos_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "Informativos");
    private final static QName _MovimentacaoBovespaMovimentoBovespa_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "MovimentoBovespa");
    private final static QName _MovimentacaoBovespaListaEmissor_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "ListaEmissor");
    private final static QName _MovimentacaoFinanceiraBovespaMesAnoMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "MesAnoMovimento");
    private final static QName _MovimentacaoFinanceiraBovespaCodigoNegocio_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", "CodigoNegocio");
    private final static QName _MovimentoBMFMercado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "Mercado");
    private final static QName _MovimentoBMFCommodity_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "Commodity");
    private final static QName _MovimentoBMFMesAnoMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MesAnoMovimento");
    private final static QName _PosicaoFinanceiraUltimoDiaMesVariavel_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "Variavel");
    private final static QName _MovimentacaoFinanceiraCCMesAnoMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "MesAnoMovimento");
    private final static QName _MovimentacaoFinanceiraCCDataEncerramentoConta_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "DataEncerramentoConta");
    private final static QName _MovimentacaoFinanceiraCCProduto_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "Produto");
    private final static QName _MovimentacaoFinanceiraBmfSerie_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "Serie");
    private final static QName _BaseDataReferencia_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataReferencia");
    private final static QName _MovimentacaoVisOpcOpvTerTipoMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "TipoMovimento");
    private final static QName _MovimentacaoVisOpcOpvTerTipoMercado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "TipoMercado");
    private final static QName _MovimentacaoVisOpcOpvTerIndicadorContabilMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "IndicadorContabilMovimento");
    private final static QName _MovimentacaoVisOpcOpvTerCodigoIsin_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "CodigoIsin");
    private final static QName _MovimentacaoVisOpcOpvTerNumeroExtrato_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "NumeroExtrato");
    private final static QName _MovimentacaoContaCorrentePagamentoAcumulado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "PagamentoAcumulado");
    private final static QName _MovimentacaoContaCorrenteBalancoConta_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "BalancoConta");
    private final static QName _MovimentacaoSimplesValorLancamento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "ValorLancamento");
    private final static QName _MovimentacaoSimplesTipoPagamento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", "TipoPagamento");
    private final static QName _MovimentacaoCustodiaMovimentacaoTesouroDireto_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentacaoTesouroDireto");
    private final static QName _MovimentacaoCustodiaMovimentacaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "MovimentacaoVisOpcOpvTer");
    private final static QName _MovimentacaoCustodiaPosicaoBTC_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "PosicaoBTC");
    private final static QName _MovimentacaoCustodiaPosicaoVisOpcOpvTer_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "PosicaoVisOpcOpvTer");
    private final static QName _PosicaoTesouroDiretoValorPosicao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ValorPosicao");
    private final static QName _PosicaoTesouroDiretoTipoTitulo_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "TipoTitulo");
    private final static QName _PosicaoTesouroDiretoDataPosicao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataPosicao");
    private final static QName _PosicaoVisOpcOpvTerQuantidadeDisponivel_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "QuantidadeDisponivel");
    private final static QName _PosicaoVisOpcOpvTerDataAquisicaoTitulo_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataAquisicaoTitulo");
    private final static QName _PosicaoVisOpcOpvTerCodigoMercado_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "CodigoMercado");
    private final static QName _PosicaoVisOpcOpvTerValorAquisicaoTitulo_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ValorAquisicaoTitulo");
    private final static QName _PosicaoVisOpcOpvTerCodigoNegocio_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "CodigoNegocio");
    private final static QName _MovimentacaoBTCDataVencimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataVencimento");
    private final static QName _MovimentacaoBTCNumeroContrato_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "NumeroContrato");
    private final static QName _MovimentacaoBTCNaturezaOperacao_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "NaturezaOperacao");
    private final static QName _CadastroInfoResponseDeclarante_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "Declarante");
    private final static QName _CadastroInfoResponseListaDeclarados_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", "ListaDeclarados");
    private final static QName _PosicaoBtcQuantidadeAcoes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "QuantidadeAcoes");
    private final static QName _PosicaoBtcIndicadorTomadorDoador_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "IndicadorTomadorDoador");
    private final static QName _MovimentacaoTDDataOrigem_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataOrigem");
    private final static QName _MovimentacaoTDValorCredito_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ValorCredito");
    private final static QName _MovimentacaoTDDataNegocio_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataNegocio");
    private final static QName _MovimentacaoTDDataMovimento_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "DataMovimento");
    private final static QName _MovimentacaoTDTipoTitularidade_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "TipoTitularidade");
    private final static QName _MovimentacaoTDValorDebito_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", "ValorDebito");
    private final static QName _MovimentacaoBmfListaEmissor_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "ListaEmissor");
    private final static QName _MovimentacaoBmfMovimentoFuturos_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentoFuturos");
    private final static QName _MovimentacaoBmfPosicaoOpcaoFlexivelUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "PosicaoOpcaoFlexivelUltimoDiaMes");
    private final static QName _MovimentacaoBmfPosicaoFuturosOpcoesUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "PosicaoFuturosOpcoesUltimoDiaMes");
    private final static QName _MovimentacaoBmfMovimentoSwapFlexivel_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentoSwapFlexivel");
    private final static QName _MovimentacaoBmfMovimentoOpcoes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "MovimentoOpcoes");
    private final static QName _MovimentacaoBmfPosicaoOuroDisponivelUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "PosicaoOuroDisponivelUltimoDiaMes");
    private final static QName _MovimentacaoBmfPosicaoSwapUltimoDiaMes_QNAME = new QName("http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", "PosicaoSwapUltimoDiaMes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MovimentacaoBmf }
     * 
     */
    public MovimentacaoBmf createMovimentacaoBmf() {
        return new MovimentacaoBmf();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoFinanceiraBmf }
     * 
     */
    public ArrayOfMovimentacaoFinanceiraBmf createArrayOfMovimentacaoFinanceiraBmf() {
        return new ArrayOfMovimentacaoFinanceiraBmf();
    }

    /**
     * Create an instance of {@link ArrayOfPosicaoFinanceiraUltimoDiaMes }
     * 
     */
    public ArrayOfPosicaoFinanceiraUltimoDiaMes createArrayOfPosicaoFinanceiraUltimoDiaMes() {
        return new ArrayOfPosicaoFinanceiraUltimoDiaMes();
    }

    /**
     * Create an instance of {@link MovimentacaoFinanceiraBmf }
     * 
     */
    public MovimentacaoFinanceiraBmf createMovimentacaoFinanceiraBmf() {
        return new MovimentacaoFinanceiraBmf();
    }

    /**
     * Create an instance of {@link MovimentoBMF }
     * 
     */
    public MovimentoBMF createMovimentoBMF() {
        return new MovimentoBMF();
    }

    /**
     * Create an instance of {@link PosicaoFinanceiraUltimoDiaMes }
     * 
     */
    public PosicaoFinanceiraUltimoDiaMes createPosicaoFinanceiraUltimoDiaMes() {
        return new PosicaoFinanceiraUltimoDiaMes();
    }

    /**
     * Create an instance of {@link MovimentacaoSimples }
     * 
     */
    public MovimentacaoSimples createMovimentacaoSimples() {
        return new MovimentacaoSimples();
    }

    /**
     * Create an instance of {@link MovimentacaoContaCorrente }
     * 
     */
    public MovimentacaoContaCorrente createMovimentacaoContaCorrente() {
        return new MovimentacaoContaCorrente();
    }

    /**
     * Create an instance of {@link MovimentacaoFinanceiraCC }
     * 
     */
    public MovimentacaoFinanceiraCC createMovimentacaoFinanceiraCC() {
        return new MovimentacaoFinanceiraCC();
    }

    /**
     * Create an instance of {@link MovimentacaoDetalhada }
     * 
     */
    public MovimentacaoDetalhada createMovimentacaoDetalhada() {
        return new MovimentacaoDetalhada();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoDetalhada }
     * 
     */
    public ArrayOfMovimentacaoDetalhada createArrayOfMovimentacaoDetalhada() {
        return new ArrayOfMovimentacaoDetalhada();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoSimples }
     * 
     */
    public ArrayOfMovimentacaoSimples createArrayOfMovimentacaoSimples() {
        return new ArrayOfMovimentacaoSimples();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoFinanceiraBovespa }
     * 
     */
    public ArrayOfMovimentacaoFinanceiraBovespa createArrayOfMovimentacaoFinanceiraBovespa() {
        return new ArrayOfMovimentacaoFinanceiraBovespa();
    }

    /**
     * Create an instance of {@link MovimentacaoFinanceiraBovespa }
     * 
     */
    public MovimentacaoFinanceiraBovespa createMovimentacaoFinanceiraBovespa() {
        return new MovimentacaoFinanceiraBovespa();
    }

    /**
     * Create an instance of {@link MovimentacaoBovespa }
     * 
     */
    public MovimentacaoBovespa createMovimentacaoBovespa() {
        return new MovimentacaoBovespa();
    }

    /**
     * Create an instance of {@link MovimentoResponse }
     * 
     */
    public MovimentoResponse createMovimentoResponse() {
        return new MovimentoResponse();
    }

    /**
     * Create an instance of {@link CadastroInfoResponse }
     * 
     */
    public CadastroInfoResponse createCadastroInfoResponse() {
        return new CadastroInfoResponse();
    }

    /**
     * Create an instance of {@link PosicaoVisOpcOpvTer }
     * 
     */
    public PosicaoVisOpcOpvTer createPosicaoVisOpcOpvTer() {
        return new PosicaoVisOpcOpvTer();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoBTC }
     * 
     */
    public ArrayOfMovimentacaoBTC createArrayOfMovimentacaoBTC() {
        return new ArrayOfMovimentacaoBTC();
    }

    /**
     * Create an instance of {@link MovimentacaoBTC }
     * 
     */
    public MovimentacaoBTC createMovimentacaoBTC() {
        return new MovimentacaoBTC();
    }

    /**
     * Create an instance of {@link MovimentacaoTD }
     * 
     */
    public MovimentacaoTD createMovimentacaoTD() {
        return new MovimentacaoTD();
    }

    /**
     * Create an instance of {@link ArrayOfPosicaoBtc }
     * 
     */
    public ArrayOfPosicaoBtc createArrayOfPosicaoBtc() {
        return new ArrayOfPosicaoBtc();
    }

    /**
     * Create an instance of {@link ArrayOfPosicaoTesouroDireto }
     * 
     */
    public ArrayOfPosicaoTesouroDireto createArrayOfPosicaoTesouroDireto() {
        return new ArrayOfPosicaoTesouroDireto();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoVisOpcOpvTer }
     * 
     */
    public ArrayOfMovimentacaoVisOpcOpvTer createArrayOfMovimentacaoVisOpcOpvTer() {
        return new ArrayOfMovimentacaoVisOpcOpvTer();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link MovimentacaoCustodia }
     * 
     */
    public MovimentacaoCustodia createMovimentacaoCustodia() {
        return new MovimentacaoCustodia();
    }

    /**
     * Create an instance of {@link ArrayOfPosicaoVisOpcOpvTer }
     * 
     */
    public ArrayOfPosicaoVisOpcOpvTer createArrayOfPosicaoVisOpcOpvTer() {
        return new ArrayOfPosicaoVisOpcOpvTer();
    }

    /**
     * Create an instance of {@link MovimentacaoVisOpcOpvTer }
     * 
     */
    public MovimentacaoVisOpcOpvTer createMovimentacaoVisOpcOpvTer() {
        return new MovimentacaoVisOpcOpvTer();
    }

    /**
     * Create an instance of {@link PosicaoTesouroDireto }
     * 
     */
    public PosicaoTesouroDireto createPosicaoTesouroDireto() {
        return new PosicaoTesouroDireto();
    }

    /**
     * Create an instance of {@link MovimentoCustodia }
     * 
     */
    public MovimentoCustodia createMovimentoCustodia() {
        return new MovimentoCustodia();
    }

    /**
     * Create an instance of {@link PosicaoBtc }
     * 
     */
    public PosicaoBtc createPosicaoBtc() {
        return new PosicaoBtc();
    }

    /**
     * Create an instance of {@link ArrayOfMovimentacaoTD }
     * 
     */
    public ArrayOfMovimentacaoTD createArrayOfMovimentacaoTD() {
        return new ArrayOfMovimentacaoTD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "Movimentacao_VisOpcOpvTer")
    public JAXBElement<MovimentacaoVisOpcOpvTer> createMovimentacaoVisOpcOpvTer(MovimentacaoVisOpcOpvTer value) {
        return new JAXBElement<MovimentacaoVisOpcOpvTer>(_MovimentacaoVisOpcOpvTer_QNAME, MovimentacaoVisOpcOpvTer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfMovimentacao_VisOpcOpvTer")
    public JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer> createArrayOfMovimentacaoVisOpcOpvTer(ArrayOfMovimentacaoVisOpcOpvTer value) {
        return new JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer>(_ArrayOfMovimentacaoVisOpcOpvTer_QNAME, ArrayOfMovimentacaoVisOpcOpvTer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoBovespa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "MovimentacaoBovespa")
    public JAXBElement<MovimentacaoBovespa> createMovimentacaoBovespa(MovimentacaoBovespa value) {
        return new JAXBElement<MovimentacaoBovespa>(_MovimentacaoBovespa_QNAME, MovimentacaoBovespa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoCustodia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoCustodia")
    public JAXBElement<MovimentacaoCustodia> createMovimentacaoCustodia(MovimentacaoCustodia value) {
        return new JAXBElement<MovimentacaoCustodia>(_MovimentacaoCustodia_QNAME, MovimentacaoCustodia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfPosicao_VisOpcOpvTer")
    public JAXBElement<ArrayOfPosicaoVisOpcOpvTer> createArrayOfPosicaoVisOpcOpvTer(ArrayOfPosicaoVisOpcOpvTer value) {
        return new JAXBElement<ArrayOfPosicaoVisOpcOpvTer>(_ArrayOfPosicaoVisOpcOpvTer_QNAME, ArrayOfPosicaoVisOpcOpvTer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoFinanceiraBovespa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "MovimentacaoFinanceiraBovespa")
    public JAXBElement<MovimentacaoFinanceiraBovespa> createMovimentacaoFinanceiraBovespa(MovimentacaoFinanceiraBovespa value) {
        return new JAXBElement<MovimentacaoFinanceiraBovespa>(_MovimentacaoFinanceiraBovespa_QNAME, MovimentacaoFinanceiraBovespa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoBTC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoBTC")
    public JAXBElement<MovimentacaoBTC> createMovimentacaoBTC(MovimentacaoBTC value) {
        return new JAXBElement<MovimentacaoBTC>(_MovimentacaoBTC_QNAME, MovimentacaoBTC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoBtc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfPosicaoBtc")
    public JAXBElement<ArrayOfPosicaoBtc> createArrayOfPosicaoBtc(ArrayOfPosicaoBtc value) {
        return new JAXBElement<ArrayOfPosicaoBtc>(_ArrayOfPosicaoBtc_QNAME, ArrayOfPosicaoBtc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentacaoBmf")
    public JAXBElement<MovimentacaoBmf> createMovimentacaoBmf(MovimentacaoBmf value) {
        return new JAXBElement<MovimentacaoBmf>(_MovimentacaoBmf_QNAME, MovimentacaoBmf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "Base")
    public JAXBElement<Base> createBase(Base value) {
        return new JAXBElement<Base>(_Base_QNAME, Base.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "MovimentacaoSimples")
    public JAXBElement<MovimentacaoSimples> createMovimentacaoSimples(MovimentacaoSimples value) {
        return new JAXBElement<MovimentacaoSimples>(_MovimentacaoSimples_QNAME, MovimentacaoSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "MovimentoResponse")
    public JAXBElement<MovimentoResponse> createMovimentoResponse(MovimentoResponse value) {
        return new JAXBElement<MovimentoResponse>(_MovimentoResponse_QNAME, MovimentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoTD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoTD")
    public JAXBElement<MovimentacaoTD> createMovimentacaoTD(MovimentacaoTD value) {
        return new JAXBElement<MovimentacaoTD>(_MovimentacaoTD_QNAME, MovimentacaoTD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoTesouroDireto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfPosicaoTesouroDireto")
    public JAXBElement<ArrayOfPosicaoTesouroDireto> createArrayOfPosicaoTesouroDireto(ArrayOfPosicaoTesouroDireto value) {
        return new JAXBElement<ArrayOfPosicaoTesouroDireto>(_ArrayOfPosicaoTesouroDireto_QNAME, ArrayOfPosicaoTesouroDireto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosicaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "Posicao_VisOpcOpvTer")
    public JAXBElement<PosicaoVisOpcOpvTer> createPosicaoVisOpcOpvTer(PosicaoVisOpcOpvTer value) {
        return new JAXBElement<PosicaoVisOpcOpvTer>(_PosicaoVisOpcOpvTer_QNAME, PosicaoVisOpcOpvTer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoCustodia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentoCustodia")
    public JAXBElement<MovimentoCustodia> createMovimentoCustodia(MovimentoCustodia value) {
        return new JAXBElement<MovimentoCustodia>(_MovimentoCustodia_QNAME, MovimentoCustodia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentoBMF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentoBMF")
    public JAXBElement<MovimentoBMF> createMovimentoBMF(MovimentoBMF value) {
        return new JAXBElement<MovimentoBMF>(_MovimentoBMF_QNAME, MovimentoBMF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosicaoBtc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "PosicaoBtc")
    public JAXBElement<PosicaoBtc> createPosicaoBtc(PosicaoBtc value) {
        return new JAXBElement<PosicaoBtc>(_PosicaoBtc_QNAME, PosicaoBtc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoDetalhada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "MovimentacaoDetalhada")
    public JAXBElement<MovimentacaoDetalhada> createMovimentacaoDetalhada(MovimentacaoDetalhada value) {
        return new JAXBElement<MovimentacaoDetalhada>(_MovimentacaoDetalhada_QNAME, MovimentacaoDetalhada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosicaoTesouroDireto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "PosicaoTesouroDireto")
    public JAXBElement<PosicaoTesouroDireto> createPosicaoTesouroDireto(PosicaoTesouroDireto value) {
        return new JAXBElement<PosicaoTesouroDireto>(_PosicaoTesouroDireto_QNAME, PosicaoTesouroDireto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "CadastroInfoResponse")
    public JAXBElement<CadastroInfoResponse> createCadastroInfoResponse(CadastroInfoResponse value) {
        return new JAXBElement<CadastroInfoResponse>(_CadastroInfoResponse_QNAME, CadastroInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "ArrayOfPosicaoFinanceiraUltimoDiaMes")
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> createArrayOfPosicaoFinanceiraUltimoDiaMes(ArrayOfPosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes>(_ArrayOfPosicaoFinanceiraUltimoDiaMes_QNAME, ArrayOfPosicaoFinanceiraUltimoDiaMes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoTD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfMovimentacaoTD")
    public JAXBElement<ArrayOfMovimentacaoTD> createArrayOfMovimentacaoTD(ArrayOfMovimentacaoTD value) {
        return new JAXBElement<ArrayOfMovimentacaoTD>(_ArrayOfMovimentacaoTD_QNAME, ArrayOfMovimentacaoTD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoFinanceiraBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentacaoFinanceiraBmf")
    public JAXBElement<MovimentacaoFinanceiraBmf> createMovimentacaoFinanceiraBmf(MovimentacaoFinanceiraBmf value) {
        return new JAXBElement<MovimentacaoFinanceiraBmf>(_MovimentacaoFinanceiraBmf_QNAME, MovimentacaoFinanceiraBmf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "ArrayOfMovimentacaoFinanceiraBmf")
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> createArrayOfMovimentacaoFinanceiraBmf(ArrayOfMovimentacaoFinanceiraBmf value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBmf>(_ArrayOfMovimentacaoFinanceiraBmf_QNAME, ArrayOfMovimentacaoFinanceiraBmf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoFinanceiraCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "MovimentacaoFinanceiraCC")
    public JAXBElement<MovimentacaoFinanceiraCC> createMovimentacaoFinanceiraCC(MovimentacaoFinanceiraCC value) {
        return new JAXBElement<MovimentacaoFinanceiraCC>(_MovimentacaoFinanceiraCC_QNAME, MovimentacaoFinanceiraCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoDetalhada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "ArrayOfMovimentacaoDetalhada")
    public JAXBElement<ArrayOfMovimentacaoDetalhada> createArrayOfMovimentacaoDetalhada(ArrayOfMovimentacaoDetalhada value) {
        return new JAXBElement<ArrayOfMovimentacaoDetalhada>(_ArrayOfMovimentacaoDetalhada_QNAME, ArrayOfMovimentacaoDetalhada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "ArrayOfMovimentacaoSimples")
    public JAXBElement<ArrayOfMovimentacaoSimples> createArrayOfMovimentacaoSimples(ArrayOfMovimentacaoSimples value) {
        return new JAXBElement<ArrayOfMovimentacaoSimples>(_ArrayOfMovimentacaoSimples_QNAME, ArrayOfMovimentacaoSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "PosicaoFinanceiraUltimoDiaMes")
    public JAXBElement<PosicaoFinanceiraUltimoDiaMes> createPosicaoFinanceiraUltimoDiaMes(PosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<PosicaoFinanceiraUltimoDiaMes>(_PosicaoFinanceiraUltimoDiaMes_QNAME, PosicaoFinanceiraUltimoDiaMes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimentacaoContaCorrente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "MovimentacaoContaCorrente")
    public JAXBElement<MovimentacaoContaCorrente> createMovimentacaoContaCorrente(MovimentacaoContaCorrente value) {
        return new JAXBElement<MovimentacaoContaCorrente>(_MovimentacaoContaCorrente_QNAME, MovimentacaoContaCorrente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoBTC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ArrayOfMovimentacaoBTC")
    public JAXBElement<ArrayOfMovimentacaoBTC> createArrayOfMovimentacaoBTC(ArrayOfMovimentacaoBTC value) {
        return new JAXBElement<ArrayOfMovimentacaoBTC>(_ArrayOfMovimentacaoBTC_QNAME, ArrayOfMovimentacaoBTC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBovespa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "ArrayOfMovimentacaoFinanceiraBovespa")
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa> createArrayOfMovimentacaoFinanceiraBovespa(ArrayOfMovimentacaoFinanceiraBovespa value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa>(_ArrayOfMovimentacaoFinanceiraBovespa_QNAME, ArrayOfMovimentacaoFinanceiraBovespa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "Quantidade", scope = MovimentoCustodia.class)
    public JAXBElement<Float> createMovimentoCustodiaQuantidade(Float value) {
        return new JAXBElement<Float>(_MovimentoCustodiaQuantidade_QNAME, Float.class, MovimentoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "DebitoMesmaTitularidade", scope = MovimentacaoDetalhada.class)
    public JAXBElement<Float> createMovimentacaoDetalhadaDebitoMesmaTitularidade(Float value) {
        return new JAXBElement<Float>(_MovimentacaoDetalhadaDebitoMesmaTitularidade_QNAME, Float.class, MovimentacaoDetalhada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "Debito", scope = MovimentacaoDetalhada.class)
    public JAXBElement<Float> createMovimentacaoDetalhadaDebito(Float value) {
        return new JAXBElement<Float>(_MovimentacaoDetalhadaDebito_QNAME, Float.class, MovimentacaoDetalhada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "ValorDisponivelFinal", scope = MovimentacaoDetalhada.class)
    public JAXBElement<Float> createMovimentacaoDetalhadaValorDisponivelFinal(Float value) {
        return new JAXBElement<Float>(_MovimentacaoDetalhadaValorDisponivelFinal_QNAME, Float.class, MovimentacaoDetalhada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "CreditoMesmaTitularidade", scope = MovimentacaoDetalhada.class)
    public JAXBElement<Float> createMovimentacaoDetalhadaCreditoMesmaTitularidade(Float value) {
        return new JAXBElement<Float>(_MovimentacaoDetalhadaCreditoMesmaTitularidade_QNAME, Float.class, MovimentacaoDetalhada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "Credito", scope = MovimentacaoDetalhada.class)
    public JAXBElement<Float> createMovimentacaoDetalhadaCredito(Float value) {
        return new JAXBElement<Float>(_MovimentacaoDetalhadaCredito_QNAME, Float.class, MovimentacaoDetalhada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "DadosBovespa", scope = MovimentoResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ> createMovimentoResponseDadosBovespa(ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ value) {
        return new JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ>(_MovimentoResponseDadosBovespa_QNAME, ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.class, MovimentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "DadosBMF", scope = MovimentoResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy> createMovimentoResponseDadosBMF(ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy value) {
        return new JAXBElement<ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy>(_MovimentoResponseDadosBMF_QNAME, ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.class, MovimentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "DadosCC", scope = MovimentoResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx> createMovimentoResponseDadosCC(ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx value) {
        return new JAXBElement<ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx>(_MovimentoResponseDadosCC_QNAME, ArrayOfKeyValueOfstringMovimentacaoContaCorrentePiMj0Lwx.class, MovimentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "DadosCustodia", scope = MovimentoResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd> createMovimentoResponseDadosCustodia(ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd value) {
        return new JAXBElement<ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd>(_MovimentoResponseDadosCustodia_QNAME, ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.class, MovimentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformativo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "Informativos", scope = MovimentoResponse.class)
    public JAXBElement<ArrayOfInformativo> createMovimentoResponseInformativos(ArrayOfInformativo value) {
        return new JAXBElement<ArrayOfInformativo>(_MovimentoResponseInformativos_QNAME, ArrayOfInformativo.class, MovimentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBovespa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "MovimentoBovespa", scope = MovimentacaoBovespa.class)
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa> createMovimentacaoBovespaMovimentoBovespa(ArrayOfMovimentacaoFinanceiraBovespa value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBovespa>(_MovimentacaoBovespaMovimentoBovespa_QNAME, ArrayOfMovimentacaoFinanceiraBovespa.class, MovimentacaoBovespa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmissor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "ListaEmissor", scope = MovimentacaoBovespa.class)
    public JAXBElement<ArrayOfEmissor> createMovimentacaoBovespaListaEmissor(ArrayOfEmissor value) {
        return new JAXBElement<ArrayOfEmissor>(_MovimentacaoBovespaListaEmissor_QNAME, ArrayOfEmissor.class, MovimentacaoBovespa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "MesAnoMovimento", scope = MovimentacaoFinanceiraBovespa.class)
    public JAXBElement<String> createMovimentacaoFinanceiraBovespaMesAnoMovimento(String value) {
        return new JAXBElement<String>(_MovimentacaoFinanceiraBovespaMesAnoMovimento_QNAME, String.class, MovimentacaoFinanceiraBovespa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Bovespa", name = "CodigoNegocio", scope = MovimentacaoFinanceiraBovespa.class)
    public JAXBElement<String> createMovimentacaoFinanceiraBovespaCodigoNegocio(String value) {
        return new JAXBElement<String>(_MovimentacaoFinanceiraBovespaCodigoNegocio_QNAME, String.class, MovimentacaoFinanceiraBovespa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "Mercado", scope = MovimentoBMF.class)
    public JAXBElement<String> createMovimentoBMFMercado(String value) {
        return new JAXBElement<String>(_MovimentoBMFMercado_QNAME, String.class, MovimentoBMF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "Commodity", scope = MovimentoBMF.class)
    public JAXBElement<String> createMovimentoBMFCommodity(String value) {
        return new JAXBElement<String>(_MovimentoBMFCommodity_QNAME, String.class, MovimentoBMF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MesAnoMovimento", scope = MovimentoBMF.class)
    public JAXBElement<String> createMovimentoBMFMesAnoMovimento(String value) {
        return new JAXBElement<String>(_MovimentoBMFMesAnoMovimento_QNAME, String.class, MovimentoBMF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "Variavel", scope = PosicaoFinanceiraUltimoDiaMes.class)
    public JAXBElement<String> createPosicaoFinanceiraUltimoDiaMesVariavel(String value) {
        return new JAXBElement<String>(_PosicaoFinanceiraUltimoDiaMesVariavel_QNAME, String.class, PosicaoFinanceiraUltimoDiaMes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "MesAnoMovimento", scope = MovimentacaoFinanceiraCC.class)
    public JAXBElement<String> createMovimentacaoFinanceiraCCMesAnoMovimento(String value) {
        return new JAXBElement<String>(_MovimentacaoFinanceiraCCMesAnoMovimento_QNAME, String.class, MovimentacaoFinanceiraCC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "DataEncerramentoConta", scope = MovimentacaoFinanceiraCC.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoFinanceiraCCDataEncerramentoConta(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoFinanceiraCCDataEncerramentoConta_QNAME, XMLGregorianCalendar.class, MovimentacaoFinanceiraCC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "Produto", scope = MovimentacaoFinanceiraCC.class)
    public JAXBElement<String> createMovimentacaoFinanceiraCCProduto(String value) {
        return new JAXBElement<String>(_MovimentacaoFinanceiraCCProduto_QNAME, String.class, MovimentacaoFinanceiraCC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "Serie", scope = MovimentacaoFinanceiraBmf.class)
    public JAXBElement<String> createMovimentacaoFinanceiraBmfSerie(String value) {
        return new JAXBElement<String>(_MovimentacaoFinanceiraBmfSerie_QNAME, String.class, MovimentacaoFinanceiraBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataReferencia", scope = Base.class)
    public JAXBElement<String> createBaseDataReferencia(String value) {
        return new JAXBElement<String>(_BaseDataReferencia_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "TipoMovimento", scope = MovimentacaoVisOpcOpvTer.class)
    public JAXBElement<String> createMovimentacaoVisOpcOpvTerTipoMovimento(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerTipoMovimento_QNAME, String.class, MovimentacaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "TipoMercado", scope = MovimentacaoVisOpcOpvTer.class)
    public JAXBElement<String> createMovimentacaoVisOpcOpvTerTipoMercado(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerTipoMercado_QNAME, String.class, MovimentacaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "IndicadorContabilMovimento", scope = MovimentacaoVisOpcOpvTer.class)
    public JAXBElement<String> createMovimentacaoVisOpcOpvTerIndicadorContabilMovimento(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerIndicadorContabilMovimento_QNAME, String.class, MovimentacaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoIsin", scope = MovimentacaoVisOpcOpvTer.class)
    public JAXBElement<String> createMovimentacaoVisOpcOpvTerCodigoIsin(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerCodigoIsin_QNAME, String.class, MovimentacaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NumeroExtrato", scope = MovimentacaoVisOpcOpvTer.class)
    public JAXBElement<Integer> createMovimentacaoVisOpcOpvTerNumeroExtrato(Integer value) {
        return new JAXBElement<Integer>(_MovimentacaoVisOpcOpvTerNumeroExtrato_QNAME, Integer.class, MovimentacaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "PagamentoAcumulado", scope = MovimentacaoContaCorrente.class)
    public JAXBElement<ArrayOfMovimentacaoSimples> createMovimentacaoContaCorrentePagamentoAcumulado(ArrayOfMovimentacaoSimples value) {
        return new JAXBElement<ArrayOfMovimentacaoSimples>(_MovimentacaoContaCorrentePagamentoAcumulado_QNAME, ArrayOfMovimentacaoSimples.class, MovimentacaoContaCorrente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoDetalhada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "BalancoConta", scope = MovimentacaoContaCorrente.class)
    public JAXBElement<ArrayOfMovimentacaoDetalhada> createMovimentacaoContaCorrenteBalancoConta(ArrayOfMovimentacaoDetalhada value) {
        return new JAXBElement<ArrayOfMovimentacaoDetalhada>(_MovimentacaoContaCorrenteBalancoConta_QNAME, ArrayOfMovimentacaoDetalhada.class, MovimentacaoContaCorrente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "ValorLancamento", scope = MovimentacaoSimples.class)
    public JAXBElement<Float> createMovimentacaoSimplesValorLancamento(Float value) {
        return new JAXBElement<Float>(_MovimentacaoSimplesValorLancamento_QNAME, Float.class, MovimentacaoSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.CC", name = "TipoPagamento", scope = MovimentacaoSimples.class)
    public JAXBElement<String> createMovimentacaoSimplesTipoPagamento(String value) {
        return new JAXBElement<String>(_MovimentacaoSimplesTipoPagamento_QNAME, String.class, MovimentacaoSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoTD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoTesouroDireto", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfMovimentacaoTD> createMovimentacaoCustodiaMovimentacaoTesouroDireto(ArrayOfMovimentacaoTD value) {
        return new JAXBElement<ArrayOfMovimentacaoTD>(_MovimentacaoCustodiaMovimentacaoTesouroDireto_QNAME, ArrayOfMovimentacaoTD.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoVisOpcOpvTer", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer> createMovimentacaoCustodiaMovimentacaoVisOpcOpvTer(ArrayOfMovimentacaoVisOpcOpvTer value) {
        return new JAXBElement<ArrayOfMovimentacaoVisOpcOpvTer>(_MovimentacaoCustodiaMovimentacaoVisOpcOpvTer_QNAME, ArrayOfMovimentacaoVisOpcOpvTer.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoBtc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "PosicaoBTC", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfPosicaoBtc> createMovimentacaoCustodiaPosicaoBTC(ArrayOfPosicaoBtc value) {
        return new JAXBElement<ArrayOfPosicaoBtc>(_MovimentacaoCustodiaPosicaoBTC_QNAME, ArrayOfPosicaoBtc.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoBTC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "MovimentacaoBTC", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfMovimentacaoBTC> createMovimentacaoCustodiaMovimentacaoBTC(ArrayOfMovimentacaoBTC value) {
        return new JAXBElement<ArrayOfMovimentacaoBTC>(_MovimentacaoBTC_QNAME, ArrayOfMovimentacaoBTC.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoTesouroDireto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "PosicaoTesouroDireto", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfPosicaoTesouroDireto> createMovimentacaoCustodiaPosicaoTesouroDireto(ArrayOfPosicaoTesouroDireto value) {
        return new JAXBElement<ArrayOfPosicaoTesouroDireto>(_PosicaoTesouroDireto_QNAME, ArrayOfPosicaoTesouroDireto.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoVisOpcOpvTer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "PosicaoVisOpcOpvTer", scope = MovimentacaoCustodia.class)
    public JAXBElement<ArrayOfPosicaoVisOpcOpvTer> createMovimentacaoCustodiaPosicaoVisOpcOpvTer(ArrayOfPosicaoVisOpcOpvTer value) {
        return new JAXBElement<ArrayOfPosicaoVisOpcOpvTer>(_MovimentacaoCustodiaPosicaoVisOpcOpvTer_QNAME, ArrayOfPosicaoVisOpcOpvTer.class, MovimentacaoCustodia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ValorPosicao", scope = PosicaoTesouroDireto.class)
    public JAXBElement<Float> createPosicaoTesouroDiretoValorPosicao(Float value) {
        return new JAXBElement<Float>(_PosicaoTesouroDiretoValorPosicao_QNAME, Float.class, PosicaoTesouroDireto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "Quantidade", scope = PosicaoTesouroDireto.class)
    public JAXBElement<Float> createPosicaoTesouroDiretoQuantidade(Float value) {
        return new JAXBElement<Float>(_MovimentoCustodiaQuantidade_QNAME, Float.class, PosicaoTesouroDireto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "TipoTitulo", scope = PosicaoTesouroDireto.class)
    public JAXBElement<String> createPosicaoTesouroDiretoTipoTitulo(String value) {
        return new JAXBElement<String>(_PosicaoTesouroDiretoTipoTitulo_QNAME, String.class, PosicaoTesouroDireto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataPosicao", scope = PosicaoTesouroDireto.class)
    public JAXBElement<XMLGregorianCalendar> createPosicaoTesouroDiretoDataPosicao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PosicaoTesouroDiretoDataPosicao_QNAME, XMLGregorianCalendar.class, PosicaoTesouroDireto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "QuantidadeDisponivel", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<Float> createPosicaoVisOpcOpvTerQuantidadeDisponivel(Float value) {
        return new JAXBElement<Float>(_PosicaoVisOpcOpvTerQuantidadeDisponivel_QNAME, Float.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ValorPosicao", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<Float> createPosicaoVisOpcOpvTerValorPosicao(Float value) {
        return new JAXBElement<Float>(_PosicaoTesouroDiretoValorPosicao_QNAME, Float.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataAquisicaoTitulo", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<XMLGregorianCalendar> createPosicaoVisOpcOpvTerDataAquisicaoTitulo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PosicaoVisOpcOpvTerDataAquisicaoTitulo_QNAME, XMLGregorianCalendar.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "TipoMercado", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<String> createPosicaoVisOpcOpvTerTipoMercado(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerTipoMercado_QNAME, String.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoMercado", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<String> createPosicaoVisOpcOpvTerCodigoMercado(String value) {
        return new JAXBElement<String>(_PosicaoVisOpcOpvTerCodigoMercado_QNAME, String.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ValorAquisicaoTitulo", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<Float> createPosicaoVisOpcOpvTerValorAquisicaoTitulo(Float value) {
        return new JAXBElement<Float>(_PosicaoVisOpcOpvTerValorAquisicaoTitulo_QNAME, Float.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoNegocio", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<String> createPosicaoVisOpcOpvTerCodigoNegocio(String value) {
        return new JAXBElement<String>(_PosicaoVisOpcOpvTerCodigoNegocio_QNAME, String.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoIsin", scope = PosicaoVisOpcOpvTer.class)
    public JAXBElement<String> createPosicaoVisOpcOpvTerCodigoIsin(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerCodigoIsin_QNAME, String.class, PosicaoVisOpcOpvTer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataVencimento", scope = MovimentacaoBTC.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoBTCDataVencimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoBTCDataVencimento_QNAME, XMLGregorianCalendar.class, MovimentacaoBTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NumeroContrato", scope = MovimentacaoBTC.class)
    public JAXBElement<String> createMovimentacaoBTCNumeroContrato(String value) {
        return new JAXBElement<String>(_MovimentacaoBTCNumeroContrato_QNAME, String.class, MovimentacaoBTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoIsin", scope = MovimentacaoBTC.class)
    public JAXBElement<String> createMovimentacaoBTCCodigoIsin(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerCodigoIsin_QNAME, String.class, MovimentacaoBTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NaturezaOperacao", scope = MovimentacaoBTC.class)
    public JAXBElement<String> createMovimentacaoBTCNaturezaOperacao(String value) {
        return new JAXBElement<String>(_MovimentacaoBTCNaturezaOperacao_QNAME, String.class, MovimentacaoBTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Declarante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "Declarante", scope = CadastroInfoResponse.class)
    public JAXBElement<Declarante> createCadastroInfoResponseDeclarante(Declarante value) {
        return new JAXBElement<Declarante>(_CadastroInfoResponseDeclarante_QNAME, Declarante.class, CadastroInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeclarado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "ListaDeclarados", scope = CadastroInfoResponse.class)
    public JAXBElement<ArrayOfDeclarado> createCadastroInfoResponseListaDeclarados(ArrayOfDeclarado value) {
        return new JAXBElement<ArrayOfDeclarado>(_CadastroInfoResponseListaDeclarados_QNAME, ArrayOfDeclarado.class, CadastroInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformativo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Response", name = "Informativos", scope = CadastroInfoResponse.class)
    public JAXBElement<ArrayOfInformativo> createCadastroInfoResponseInformativos(ArrayOfInformativo value) {
        return new JAXBElement<ArrayOfInformativo>(_MovimentoResponseInformativos_QNAME, ArrayOfInformativo.class, CadastroInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataVencimento", scope = PosicaoBtc.class)
    public JAXBElement<XMLGregorianCalendar> createPosicaoBtcDataVencimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoBTCDataVencimento_QNAME, XMLGregorianCalendar.class, PosicaoBtc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "QuantidadeAcoes", scope = PosicaoBtc.class)
    public JAXBElement<Long> createPosicaoBtcQuantidadeAcoes(Long value) {
        return new JAXBElement<Long>(_PosicaoBtcQuantidadeAcoes_QNAME, Long.class, PosicaoBtc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NumeroContrato", scope = PosicaoBtc.class)
    public JAXBElement<String> createPosicaoBtcNumeroContrato(String value) {
        return new JAXBElement<String>(_MovimentacaoBTCNumeroContrato_QNAME, String.class, PosicaoBtc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "IndicadorTomadorDoador", scope = PosicaoBtc.class)
    public JAXBElement<String> createPosicaoBtcIndicadorTomadorDoador(String value) {
        return new JAXBElement<String>(_PosicaoBtcIndicadorTomadorDoador_QNAME, String.class, PosicaoBtc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "CodigoIsin", scope = PosicaoBtc.class)
    public JAXBElement<String> createPosicaoBtcCodigoIsin(String value) {
        return new JAXBElement<String>(_MovimentacaoVisOpcOpvTerCodigoIsin_QNAME, String.class, PosicaoBtc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataVencimento", scope = MovimentacaoTD.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoTDDataVencimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoBTCDataVencimento_QNAME, XMLGregorianCalendar.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataOrigem", scope = MovimentacaoTD.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoTDDataOrigem(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoTDDataOrigem_QNAME, XMLGregorianCalendar.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ValorCredito", scope = MovimentacaoTD.class)
    public JAXBElement<Float> createMovimentacaoTDValorCredito(Float value) {
        return new JAXBElement<Float>(_MovimentacaoTDValorCredito_QNAME, Float.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataNegocio", scope = MovimentacaoTD.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoTDDataNegocio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoTDDataNegocio_QNAME, XMLGregorianCalendar.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "DataMovimento", scope = MovimentacaoTD.class)
    public JAXBElement<XMLGregorianCalendar> createMovimentacaoTDDataMovimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovimentacaoTDDataMovimento_QNAME, XMLGregorianCalendar.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "TipoTitularidade", scope = MovimentacaoTD.class)
    public JAXBElement<String> createMovimentacaoTDTipoTitularidade(String value) {
        return new JAXBElement<String>(_MovimentacaoTDTipoTitularidade_QNAME, String.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "ValorDebito", scope = MovimentacaoTD.class)
    public JAXBElement<Float> createMovimentacaoTDValorDebito(Float value) {
        return new JAXBElement<Float>(_MovimentacaoTDValorDebito_QNAME, Float.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NaturezaOperacao", scope = MovimentacaoTD.class)
    public JAXBElement<String> createMovimentacaoTDNaturezaOperacao(String value) {
        return new JAXBElement<String>(_MovimentacaoBTCNaturezaOperacao_QNAME, String.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.Custodia", name = "NumeroExtrato", scope = MovimentacaoTD.class)
    public JAXBElement<Integer> createMovimentacaoTDNumeroExtrato(Integer value) {
        return new JAXBElement<Integer>(_MovimentacaoVisOpcOpvTerNumeroExtrato_QNAME, Integer.class, MovimentacaoTD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmissor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "ListaEmissor", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfEmissor> createMovimentacaoBmfListaEmissor(ArrayOfEmissor value) {
        return new JAXBElement<ArrayOfEmissor>(_MovimentacaoBmfListaEmissor_QNAME, ArrayOfEmissor.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentoFuturos", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> createMovimentacaoBmfMovimentoFuturos(ArrayOfMovimentacaoFinanceiraBmf value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBmf>(_MovimentacaoBmfMovimentoFuturos_QNAME, ArrayOfMovimentacaoFinanceiraBmf.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "PosicaoOpcaoFlexivelUltimoDiaMes", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> createMovimentacaoBmfPosicaoOpcaoFlexivelUltimoDiaMes(ArrayOfPosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes>(_MovimentacaoBmfPosicaoOpcaoFlexivelUltimoDiaMes_QNAME, ArrayOfPosicaoFinanceiraUltimoDiaMes.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "PosicaoFuturosOpcoesUltimoDiaMes", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> createMovimentacaoBmfPosicaoFuturosOpcoesUltimoDiaMes(ArrayOfPosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes>(_MovimentacaoBmfPosicaoFuturosOpcoesUltimoDiaMes_QNAME, ArrayOfPosicaoFinanceiraUltimoDiaMes.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentoSwapFlexivel", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> createMovimentacaoBmfMovimentoSwapFlexivel(ArrayOfMovimentacaoFinanceiraBmf value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBmf>(_MovimentacaoBmfMovimentoSwapFlexivel_QNAME, ArrayOfMovimentacaoFinanceiraBmf.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimentacaoFinanceiraBmf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "MovimentoOpcoes", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfMovimentacaoFinanceiraBmf> createMovimentacaoBmfMovimentoOpcoes(ArrayOfMovimentacaoFinanceiraBmf value) {
        return new JAXBElement<ArrayOfMovimentacaoFinanceiraBmf>(_MovimentacaoBmfMovimentoOpcoes_QNAME, ArrayOfMovimentacaoFinanceiraBmf.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "PosicaoOuroDisponivelUltimoDiaMes", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> createMovimentacaoBmfPosicaoOuroDisponivelUltimoDiaMes(ArrayOfPosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes>(_MovimentacaoBmfPosicaoOuroDisponivelUltimoDiaMes_QNAME, ArrayOfPosicaoFinanceiraUltimoDiaMes.class, MovimentacaoBmf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPosicaoFinanceiraUltimoDiaMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bovespa.com.br/Sinacor.InformacaoApoio.Integration.Service.Owner.Public.Contracts.EFinanceira.IntegrationEntity.BMF", name = "PosicaoSwapUltimoDiaMes", scope = MovimentacaoBmf.class)
    public JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes> createMovimentacaoBmfPosicaoSwapUltimoDiaMes(ArrayOfPosicaoFinanceiraUltimoDiaMes value) {
        return new JAXBElement<ArrayOfPosicaoFinanceiraUltimoDiaMes>(_MovimentacaoBmfPosicaoSwapUltimoDiaMes_QNAME, ArrayOfPosicaoFinanceiraUltimoDiaMes.class, MovimentacaoBmf.class, value);
    }

}
