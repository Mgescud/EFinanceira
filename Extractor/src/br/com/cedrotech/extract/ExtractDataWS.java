package br.com.cedrotech.extract;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy.KeyValueOfstringMovimentacaoBmfrOPkRgXy;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ.KeyValueOfstringMovimentacaoBovespayxntLrBJ;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd.KeyValueOfstringMovimentacaoCustodiaDPLaOjVd;

import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.Cadastro;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.CadastroInfoRequest;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.IEFinanceira;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentacaoFinanceiraBovespa;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentoResponse;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.PosicaoBtc;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.PosicaoTesouroDireto;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.PosicaoVisOpcOpvTer;
import br.com.cedrotech.dtos.MovFinanceira;

public class ExtractDataWS {

	public static void main(String[] args) {
		
		ExtractDataWS ex = new ExtractDataWS();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, Calendar.APRIL, 01); //Year, month and day of month
		Date inicio = cal.getTime();
		cal.set(2016, Calendar.APRIL, 31);
		Date fim = cal.getTime();
		
		ex.extractData("clear\\mateus.escudero", "123mudar#", 308, inicio, fim);
		
	}
	
	public FileExportEasyWay extractData(String usuario, 
							String senha, 
						    Integer codEmpresa, 
						    Date inicioDate,
						    Date finalDate) {
		
		IEFinanceira ws = this.autenticaWS(usuario, senha, codEmpresa);	
		FileExportEasyWay fileEasyWay = new FileExportEasyWay();
		
		if (ws != null) {
			CadastroInfoRequest cadastroInfo = this.createRequest(usuario, senha, codEmpresa, inicioDate, finalDate);	
			//bovespa movimentação
			List<MovFinanceira> movFinanceiraBovespas = this.consultaMovimentacaoFinanceira(cadastroInfo, ws, TypeConsulta.MOVCUST);
			fileEasyWay.setMovSaldoCustodia(movFinanceiraBovespas);
		}		
		
		return fileEasyWay;
	}
	
	public List<MovFinanceira> consultaMovimentacaoFinanceira(CadastroInfoRequest cadastroInfo, IEFinanceira ws, TypeConsulta tipo) {		
		List<MovFinanceira> movFinanceiras = null;		
		switch(tipo) {
			case BOVESPA:
				movFinanceiras = this.consultaMovimentacaoBovespa(cadastroInfo, ws);
			break;				
			
			case MOVCUST:
				movFinanceiras = this.consultaMovimentacaoCustodia(cadastroInfo, ws);
			break;	
			
		}
		return movFinanceiras;
	}
	
	private List<MovFinanceira> consultaMovimentacaoCustodia(CadastroInfoRequest cadastroInfo, IEFinanceira ws) {
		try{ 
		
			MovimentoResponse movRes = ws.consultaMovCustodia(cadastroInfo);
			
			List<MovFinanceira> movFinanceirasBmf = new ArrayList<>();
			
			if (movRes != null) {
				
				ArrayOfKeyValueOfstringMovimentacaoCustodiaDPLaOjVd arrayKey = movRes.getDadosCustodia().getValue();
				
				for ( KeyValueOfstringMovimentacaoCustodiaDPLaOjVd k : arrayKey.getKeyValueOfstringMovimentacaoCustodiaDPLaOjVd()) {
					
					List<PosicaoBtc> posicaoBtcList =  k.getValue().getPosicaoBTC().getValue().getPosicaoBtc();
					for (PosicaoBtc pos : posicaoBtcList) {
						System.out.println("\n\n--------Posicao BTC ---------");
						System.out.println("Codigo ISIN: " + pos.getCodigoIsin().getValue());	
						System.out.println("Numero Distribuição" + pos.getNumeroDistribuicao());
						System.out.println("Numero Contrato " +  pos.getNumeroContrato().getValue());
						System.out.println("Data Vencimento "  + pos.getDataVencimento().getValue().toGregorianCalendar().getTime());
						System.out.println("QuantidadeAcoes " + pos.getQuantidadeAcoes().getValue());
						
						
					}
					
					List<PosicaoTesouroDireto> posicaoTesouroDiretoList = k.getValue().getPosicaoTesouroDireto().getValue().getPosicaoTesouroDireto();
					for (PosicaoTesouroDireto posTesouro :  posicaoTesouroDiretoList) {
						System.out.println("\n\n-----Posicao Tesouro Direto -----------");
						System.out.println("DataVencimento: " + posTesouro.getDataVencimento());
						System.out.println("NumeroExtrato: " + posTesouro.getNumeroExtrato());
						System.out.println("Quantidade: " + posTesouro.getQuantidade().getValue());
						System.out.println("TipoTitulo: " + posTesouro.getTipoTitulo().getValue());
						System.out.println("ValorPosicao: "  + posTesouro.getValorPosicao().getValue());
					}
					
					List<PosicaoVisOpcOpvTer> posicaoVisOpcOpvList = k.getValue().getPosicaoVisOpcOpvTer().getValue().getPosicaoVisOpcOpvTer();
					for (PosicaoVisOpcOpvTer posVisOpcOpvTer : posicaoVisOpcOpvList) {
						System.out.println("\n\n-----PosicaoVisOpcOpvTer -----------");
						System.out.println("CodigoIsin : " + posVisOpcOpvTer.getCodigoIsin().getValue());
						System.out.println("CodigoMercado : " + posVisOpcOpvTer.getCodigoMercado().getValue());
						System.out.println("NumeroDistribuicao : " + posVisOpcOpvTer.getNumeroDistribuicao());
						System.out.println("QuantidadeDisponivel : " + posVisOpcOpvTer.getQuantidadeDisponivel().getValue());
						System.out.println("TipoMercado: " + posVisOpcOpvTer.getTipoMercado().getValue() );
						System.out.println("ValorPosicao: " + posVisOpcOpvTer.getValorPosicao().getValue());
						System.out.println("CodigoCarteira: " + posVisOpcOpvTer.getCodigoCarteira());
					}
					
				}
			}
			
		} catch (Exception ex) {
			System.out.println("Falha na consulta de Movimentação da bovespa");
		}
		
		return null;
	}
	
	private List<MovFinanceira> consultaMovimentacaoBmf(CadastroInfoRequest cadastroInfo, IEFinanceira ws) {
		try {
			MovimentoResponse movRes = ws.consultaMovBMF(cadastroInfo);
			
			ws.consultaMovCustodia(cadastroInfo).getDadosCustodia().getValue().getKeyValueOfstringMovimentacaoCustodiaDPLaOjVd().get(0).getValue().getPosicaoBTC().getValue();
						
			List<MovFinanceira> movFinanceirasBmf = new ArrayList<>();
			
			if (movRes != null) {
				
				if (movRes.getDadosBMF() != null) {
					ArrayOfKeyValueOfstringMovimentacaoBmfrOPkRgXy arrayKey = movRes.getDadosBMF().getValue();
					
					for (KeyValueOfstringMovimentacaoBmfrOPkRgXy k : arrayKey.getKeyValueOfstringMovimentacaoBmfrOPkRgXy()) {
										
						System.out.println("------------DADOS Cliente---------------");
						System.out.println("CPF cpnj :" + k.getKey());
						
						String[] dataInfoHeader = k.getKey().split("\\|");
											
						k.getValue().getMovimentoFuturos().getValue().getMovimentacaoFinanceiraBmf();
						k.getValue().getMovimentoOpcoes().getValue().getMovimentacaoFinanceiraBmf();
						k.getValue().getPosicaoFuturosOpcoesUltimoDiaMes().getValue();
						
						k.getValue().getPosicaoOpcaoFlexivelUltimoDiaMes();
						k.getValue().getPosicaoSwapUltimoDiaMes();
						k.getValue().getPosicaoFuturosOpcoesUltimoDiaMes();
						k.getValue().getPosicaoOuroDisponivelUltimoDiaMes();

						//k.getValue().get
						
						/*for (MovimentacaoFinanceiraBovespa m : movFinanBovespa) {	
							MovFinanceira movFinanceira = new MovFinanceira();
							movFinanceira.setCpfCnpj(dataInfoHeader[0]);
							movFinanceira.setCodEmpresa(String.valueOf(cadastroInfo.getCodigoEmpresa()));	
							movFinanceira.setTipoMov("N");
							this.calculaOperacao(movFinanceira, 
												 (m.getValorCredito() != null ? m.getValorCredito().toString() : "0" ),
												 (m.getValorDebito() != null ? m.getValorDebito().toString() : "0"));
							movFinanceira.setCodOperacao(m.getCodigoNegocio().getValue());
							movFinanceira.setDataOperacao(m.getMesAnoMovimento().getValue());
							
							movFinanceirasBovespa.add(movFinanceira);
						}*/
						
					}
				}
				
			}
						
		} catch (Exception ex) {
			System.out.println("Falha na consulta de Movimentação da bovespa");
		}
		return null;
	}
	
	private List<MovFinanceira> consultaMovimentacaoBovespa(CadastroInfoRequest cadastroInfo, IEFinanceira ws) {
		try {
			MovimentoResponse movRes = ws.consultaMovBovespa(cadastroInfo);
			
			List<MovFinanceira> movFinanceirasBovespa = new ArrayList<>();
			
			if (movRes != null) {
				if (movRes.getDadosBovespa() != null) {
					ArrayOfKeyValueOfstringMovimentacaoBovespayxntLrBJ arrayKey = movRes.getDadosBovespa().getValue();				
					for (KeyValueOfstringMovimentacaoBovespayxntLrBJ k : arrayKey.getKeyValueOfstringMovimentacaoBovespayxntLrBJ()) {
										
						System.out.println("------------DADOS Cliente---------------");
						System.out.println("CPF cpnj :" + k.getKey());
						
						String[] dataInfoHeader = k.getKey().split("\\|");
											
						List<MovimentacaoFinanceiraBovespa> movFinanBovespa = k.getValue().getMovimentoBovespa().getValue().getMovimentacaoFinanceiraBovespa();
						for (MovimentacaoFinanceiraBovespa m : movFinanBovespa) {	
							MovFinanceira movFinanceira = new MovFinanceira();
							movFinanceira.setCpfCnpj(dataInfoHeader[0]);
							movFinanceira.setCodEmpresa(String.valueOf(cadastroInfo.getCodigoEmpresa()));	
							movFinanceira.setTipoMov("N");
							this.calculaOperacao(movFinanceira, 
												 (m.getValorCredito() != null ? m.getValorCredito().toString() : "0" ),
												 (m.getValorDebito() != null ? m.getValorDebito().toString() : "0"));
							movFinanceira.setCodOperacao(m.getCodigoNegocio().getValue());
							movFinanceira.setDataOperacao(m.getMesAnoMovimento().getValue());
							
							movFinanceirasBovespa.add(movFinanceira);
						}
						
					}
				}
				return movFinanceirasBovespa;
			}
						
		} catch (Exception ex) {
			System.out.println("Falha na consulta de Movimentação da bovespa");
		}
		return null;
	}
	
	private void calculaOperacao(MovFinanceira movFinanceira, String creditoStr, String debitoStr) {
	
		BigDecimal creditoValue = null;
		BigDecimal debitoValue = null;
		
		if (StringUtils.isBlank(creditoStr)) {
			creditoValue = BigDecimal.ZERO;
		} else {
			creditoValue = new BigDecimal(creditoStr); 
		}
		
		if (StringUtils.isBlank(debitoStr)) {
			debitoValue = BigDecimal.ZERO;
		} else {
			debitoValue = new BigDecimal(debitoStr);
		}
		
		BigDecimal valorOperacao = creditoValue.subtract(debitoValue);
		
		if (valorOperacao.compareTo(BigDecimal.ZERO) == -1) 
			movFinanceira.setSinalOperacao("D");
		else 
			movFinanceira.setSinalOperacao("C");
	
		valorOperacao = valorOperacao.setScale(2, BigDecimal.ROUND_DOWN);
		
		movFinanceira.setValorOperacao(valorOperacao.abs().toString());
	}
	
	
	
	/**
	 * Criar o objeto de request para o WS
	 * 
	 * @param usuario
	 * @param senha
	 * @param codEmpresa
	 * @param inicioDate
	 * @param finalDate
	 */
	public CadastroInfoRequest createRequest(String usuario, 
											 String senha, 
											 Integer codEmpresa, 
											 Date inicioDate,
											 Date finalDate) {
		
			
		GregorianCalendar calIni = new GregorianCalendar();
		GregorianCalendar calFim = null;
		XMLGregorianCalendar dateIniXml = null;
		XMLGregorianCalendar dateFimXml = null;		
		calIni.setTime(inicioDate);		
		if (finalDate != null) {
			calFim = new GregorianCalendar();
			calFim.setTime(finalDate);
		}	
		
		try {
			dateIniXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(calIni);
			if (calFim != null) {
				dateFimXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(calFim);
			}
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		//objeto de requisição
		CadastroInfoRequest request = new CadastroInfoRequest();
		
		request.setAnalitico(false);
		request.setCodigoEmpresa(codEmpresa);
		request.setDataInicio(dateIniXml);
		// a data final fica diferente no WS
		if (dateFimXml != null) {
			JAXBElement<XMLGregorianCalendar> jaxBElementGregorian = new JAXBElement<XMLGregorianCalendar>(
					new QName(XMLGregorianCalendar.class.getSimpleName()), XMLGregorianCalendar.class, 
	                null, dateFimXml);			
			request.setDataFinal(jaxBElementGregorian);
		}
		
		
		return request;
	}
	
	
	private IEFinanceira autenticaWS(String usuario, String senha, Integer codEmpresa) {
		
		Cadastro cad = new Cadastro();
		IEFinanceira port = cad.getWSHttpBindingIEFinanceira();
		try {
			Boolean result = port.authenticate(usuario, senha, codEmpresa);
			if (result) {
				return port;
			} else {
				return null;
			}
		} catch (Exception ex) {
			System.out.println("Falha na autenticação" );
		}
		return null;
	}
	
}
