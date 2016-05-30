package br.com.cedrotech.extract;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.CadastroInfoRequest;
import br.com.cedrotech.database.Conexao;
import br.com.cedrotech.dtos.ContribuintesC3;
import br.com.cedrotech.dtos.FundoInvestimento;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;

/**
 * Classe responsável por gerara os arquivos de acordo com os layouts
 * 
 * 
 * @author Allan Borges
 *
 */
public class CreateFile {
	
	private ExtractDataWS extractor = new ExtractDataWS();
	
	final static Logger logger = Logger.getLogger(CreateFile.class);
	
	private CadastroInfoRequest cadastroInfo;
	
	private static String CARACTER_PREENCHIMENTO_01 = " ";
	private static String CARACTER_PREENCHIMENTO_02 = "0";

	public static void main(String[] args) throws IOException, SQLException {
		
		ExtractDataWS ex = new ExtractDataWS();
		ExtractDataDB exDb = new ExtractDataDB();
		
		CreateFile create = new CreateFile();	
		Date dateStart = create.getMesInicial(0, 2015);
		Date dateEnd = create.getDiaMesFinal(dateStart);
	/*	
		for (int i = 0 ; i <= 11 ; i++) {
			Date dateStart = create.getMesInicial(i, 2015);
			Date dateEnd = create.getDiaMesFinal(dateStart);
			System.out.println("Mês " + (i + 1));
			System.out.println(dateStart);
			System.out.println(dateEnd);
		}*/
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, Calendar.MAY, 01); //Year, month and day of month
		Date inicio = cal.getTime();
		cal.set(2016, Calendar.MAY, 31);
		Date fim = cal.getTime();
		
		//FileExportEasyWay fileExportEasyWay =  ex.extractData("clear\\mateus.escudero", "123mudar#", 308, dateStart, dateEnd);	
		
		CreateFile createFile = new CreateFile();
		FileExportEasyWay fileExportEasyWay = new FileExportEasyWay();
		
		fileExportEasyWay.setMovFinanceiraM10(exDb.consultaM10(dateStart, dateEnd));
		fileExportEasyWay.setMovFinanceiraM3(exDb.consultaM3(dateStart, dateEnd));
		fileExportEasyWay.setContribuintesC3(exDb.consultaContribuintesC3(dateStart, dateEnd));
		
		Conexao.fechaConexao();
		
		createFile.createTxt(fileExportEasyWay, TypeFile.MOVFINANCEIROM3, "teste/");
	}	

	private Date getMesInicial (int mes, int ano) {
	  Calendar gc = new GregorianCalendar();
	  gc.set(Calendar.YEAR, ano);
	  gc.set(Calendar.MONTH, mes);
	  gc.set(Calendar.DAY_OF_MONTH, 1);
	  return gc.getTime();    
	}
	
	private Date getDiaMesFinal (Date monthStart) {
	  Calendar gc = new GregorianCalendar();
	  gc.setTime(monthStart);	  
	  gc.add(Calendar.MONTH, 1);
	  gc.add(Calendar.DAY_OF_MONTH, -1);
	  return gc.getTime();
	}
		
	/**
	 * Cria o arquivo com base no layout passado como argumento
	 * 
	 * @param fileExportEasyWay
	 * @param type
	 * @param dest
	 * @throws IOException
	 */
	public void createTxt(FileExportEasyWay fileExportEasyWay , TypeFile type, String dest) throws IOException {					
		Path path = Paths.get(dest + this.getNameFile(type));
		
		switch (type) {
			case MOVFINANCEIROM10:
				this.createFileMovFinanceirosM10(fileExportEasyWay, path);
			break;
			
			case MOVFINANCEIROM3:
				this.createFileMovFinanceirosM3(fileExportEasyWay, path);
			break;
			
			case CONTRIBUINTESC3:
				this.createFileC3(fileExportEasyWay, path);
			break;	
	
			default:
			break;
		}		
	}
	
	/**
	 * Layout de fundo de Investimento
	 * 
	 * @param fileExportEasyWay
	 * @param path
	 * @throws IOException
	 */
	//TODO tentar genaralizar esses métodos de geração de arquivos futuramente
	private void createFileFundosInvestimento(FileExportEasyWay fileExportEasyWay, Path path) throws IOException {
		
		List<FundoInvestimento> listFundoInvestimento = fileExportEasyWay.getCadastroFundoInvest();
		
		BufferedWriter writer = null;
		try {
			
			if (!listFundoInvestimento.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8);	
			}
			
			for (FundoInvestimento fund : listFundoInvestimento) {
				writer.append(StringUtils.rightPad(fund.getCodigoEmpresa(), 5, CARACTER_PREENCHIMENTO_01));		
				writer.append(StringUtils.rightPad(fund.getCodigoFilial(), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getDescricaoFilial(), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCnpj(), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getEndereco(), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getNumero(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCompl(), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getTelefone(), 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCodMunicipio(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getBairro(), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCep(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCodPagInss(), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getInscEstadual(), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getInscMunicipal(), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getRefereAFundoInvestimento(), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getDataInicioAtividades(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getDataFimAtividades(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getDataInclusaoNoSistemaOrigem(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getDataUltimaGeracaoNoSistemaOrigem(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getTipoFundo(), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getCodClassTribut(), 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getNoCEI(), 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getgIIN(), 19, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getSiglaPaisCadastro(), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getSiglaPaisResFiscal(), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(fund.getTipoDaInstFinan(), 3, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
			}
						
		 }catch (IOException e) {
			 logger.error("Erro na criação do layout de FundosInvestimento");
		 }finally {
			if (writer != null)
				writer.close();
		 }					
	}
	
	/**
	 * Layout de cadastro C3 
	 *  
	 * @param fileExportEasyWay
	 * @param path
	 * @throws IOException
	 */
	//TODO tentar genaralizar esses métodos de geração de arquivos futuramente
	private void createFileC3(FileExportEasyWay fileExportEasyWay, Path path) throws IOException{
			
		List<ContribuintesC3> contribuintesC3List = fileExportEasyWay.getContribuintesC3();
		BufferedWriter writer = null;
		try {
			logger.info("Criando o arquivo de layout ContribuintesC3");
			if (!contribuintesC3List.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			
			for (ContribuintesC3 c3 : contribuintesC3List) {
				
				writer.append(StringUtils.rightPad(isEmpty(c3.getCpfCnpj()), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNomeContribuinte()), 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getLogradouro()), 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNumero()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCompl()), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodMunicipio()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCep()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getBairro()), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDescCidade()), 30, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getUf()), 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getTelefone()), 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDataNasc()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getInscMunicipal()), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getInscInss()), 11, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCbo()), 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCategoriaTrabalhador()), 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getImprimeDadosDepoNoRpa()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getTipoContaBancaria()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodBanco()), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodAgencia()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNomeAgencia()), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getContaCorrente()), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDataInclusaoSistemaOrigem()), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDataUltAtualizacaoSisOrigem()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getEstrangeiroSemCpf()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodPais()), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNumIdentFiscal()), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNatRelacao()), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDescEstado()), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getIdentProdutorRural()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNoCEI()), 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getIdentMicroEmpresa()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDocFiscalEmitido()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getEmail()), 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getPesFisJuridica()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getInscEstadual()), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getDispNif()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getRetemPisCofinsCs()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getStatusContribuinte()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getTipoLogradouro()), 10, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getIsentoInscrEstadual()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCentralizarGeracaoInf()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCpfCnpjContribCentralizador()), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(c3.getTipoInformesCentralizados()), 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodCateTrabalhadorESocial()), 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getSexo()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getRacaCor()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getEstadoCivil()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getGrauEscolaridade()), 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getFoneAlternativo()), 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getEmailAlternativo()), 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getMunicipioNasc()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getPaisNasc()), 5, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getPaisNacionalidade()), 5, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNomeMae()), 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getNomePai()), 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(c3.getCodCliente()), 11, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
				
			}
			
		}catch (IOException e) {
			logger.error("Erro na criação do layout de CadastroC3");
		} finally {
			if (writer != null)
				writer.close();
		}
			
	}
	
	
 	/**
 	 * Layout M3 de informações de movimentações
 	 * 
 	 * @param fileExportEasyWay
 	 * @param path
 	 * @throws IOException
 	 */
	//TODO tentar genaralizar esses métodos de geração de arquivos futuramente
 	private void createFileMovFinanceirosM3(FileExportEasyWay fileExportEasyWay, Path path) throws IOException{
 		
 		List<MovFinanceiraM3> movFinanceiraM3 = fileExportEasyWay.getMovFinanceiraM3();
 		BufferedWriter writer = null;
		try {
			logger.info("Criando o arquivo de layout MovFinanceirosM3");
			if (!movFinanceiraM3.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			
			for (MovFinanceiraM3 mov : movFinanceiraM3) {
				
				writer.append(StringUtils.rightPad(isEmpty(mov.getCodEmpresa()), 5, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(isEmpty(mov.getFilial()), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCpfCnpj()), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCodRendimento()), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCodTipoServico()), 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getTipoLancto()), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getAnoMes()), 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getSaldo()), 17, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCodDependente()), 10, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getNumeroAgencia()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getDataEncConta()), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCodIntermediario()), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getTipoRelacaoTerceiro()), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(mov.getCpfCnpjProcurador()), 14, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
			}
			
			if (!movFinanceiraM3.isEmpty() && writer != null)
				writer.flush();
			
		} catch (IOException e) {
			logger.error("Erro na criação do layout de MovFinanceirosM3");
		} finally {
			if (writer != null)
				writer.close();
		}
 	}
 	
 	private String isEmpty(String str) {
 		return (StringUtils.isEmpty(str) ? "" : str);
 	}
	
 	/**
 	 * Layout M10 de informações de movimentações
 	 * 
 	 * @param fileExportEasyWay
 	 * @param path
 	 * @throws IOException
 	 */
	//TODO tentar genaralizar esses métodos de geração de arquivos futuramente
	private void createFileMovFinanceirosM10(FileExportEasyWay fileExportEasyWay, Path path) throws IOException{		
		
		List<MovFinanceira> movFinanceiraM10 = fileExportEasyWay.getMovFinanceiraM10();
		
		BufferedWriter writer = null;
		
		try {
			logger.info("Criando o arquivo de layout MovFinanceiroM10");
			if (!movFinanceiraM10.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			
			for (MovFinanceira mov : movFinanceiraM10) {
				writer.append(StringUtils.rightPad(mov.getCodEmpresa(), 5, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(mov.getFilial(), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCpfCnpj(), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getNumeroDoc(), 18, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getDataOperacao(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCodOperacao(), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getValorOperacao(), 17, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getSinalOperacao(), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getNumeroAuxiliarDoc(), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getObservacoes(), 120, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getDataInclusao(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getTipoMov(), 1, CARACTER_PREENCHIMENTO_01));				
				writer.newLine();
			}
			
			if (writer != null)
				writer.flush();
			
		} catch (IOException e) {
			logger.error("Erro na criação do layout de MovFinanceirosM10");
		} finally {
			if (writer != null)
				writer.close();
		}
			
	}
	
		
	/**
	 * Cria o nome do arquivo com base em seu Layout ou formato (mês/ano,dia/mês/ano)
	 * 
	 * @param type
	 * @return
	 */
	private String getNameFile (TypeFile type) {
		
		String nomeArquivo = "";
		
		switch (type) {
		
			case MOVFINANCEIROM10:
				
			break;
			
			case MOVFINANCEIROM3:
				
			break;	
			
			case CONTRIBUINTESC3:
				
			break;	
		}
		//TODO retornar o nome adequado futuramente
		return "MOVDFAAMM.txt";
	}
	
	
}
