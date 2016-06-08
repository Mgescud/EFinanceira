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
import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.Logger;

import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.CadastroInfoRequest;
import br.com.cedrotech.dtos.ColumnsResumeFile;
import br.com.cedrotech.dtos.ContribuintesC3;
import br.com.cedrotech.dtos.FundoInvestimento;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;
import br.com.cedrotech.dtos.ResumeFile;

/**
 * Classe responsável por gerara os arquivos de acordo com os layouts
 * 
 * 
 * @author Allan Borges
 *
 */
public class CreateFile {
	
	
	final static Logger logger = Logger.getLogger(CreateFile.class);
	
	private CadastroInfoRequest cadastroInfo;
	private Long qtdeRegistrosM3 = 0l;
	private Long qtdeRegistrosM10 = 0l;
	private Long qtdeRegistrosC3 = 0l;
	
	private static String CARACTER_PREENCHIMENTO_01 = " ";
	private static String CARACTER_PREENCHIMENTO_02 = "0";
	private static int BUFFER_MAX = 1000;
	

	public static void main(String[] args) throws IOException, SQLException {
		
	/*	ExtractDataWS ex = new ExtractDataWS();
		ExtractDataDB exDb = new ExtractDataDB();
		
		CreateFile create = new CreateFile();	
		Date dateStart = create.getMesInicial(0, 2015);
		Date dateEnd = create.getDiaMesFinal(dateStart);
		
		for (int i = 0 ; i <= 11 ; i++) {
			Date dateStart = create.getMesInicial(i, 2015);
			Date dateEnd = create.getDiaMesFinal(dateStart);
			System.out.println("Mês " + (i + 1));
			System.out.println(dateStart);
			System.out.println(dateEnd);
		}
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, Calendar.MAY, 01); //Year, month and day of month
		Date inicio = cal.getTime();
		cal.set(2016, Calendar.MAY, 31);
		Date fim = cal.getTime();
		
		//FileExportEasyWay fileExportEasyWay =  ex.extractData("clear\\mateus.escudero", "123mudar#", 308, dateStart, dateEnd);	
		
		CreateFile createFile = new CreateFile();
		FileExportEasyWay fileExportEasyWay = new FileExportEasyWay();
		
		fileExportEasyWay.setMovFinanceiraM10(exDb.consultaM10(dateStart, dateEnd, "22173829858"));
		fileExportEasyWay.setMovFinanceiraM3(exDb.consultaM3(dateStart, dateEnd, "10004"));
		fileExportEasyWay.setContribuintesC3(exDb.consultaContribuintesC3(dateStart, dateEnd));
		
		Conexao.fechaConexao();
		
		createFile.createTxt(fileExportEasyWay, TypeFile.MOVFINANCEIROM10, "teste/");
		createFile.createTxt(fileExportEasyWay, TypeFile.MOVFINANCEIROM3, "teste/");
		createFile.createTxt(fileExportEasyWay, TypeFile.CONTRIBUINTESC3, "teste/");*/
		
		CreateFile createF = new CreateFile();
		//createF.create("teste/", 2015, FormatFile.MENSAL, null);
		//por periodo
		//createF.create("teste/", new Date(), new Date());
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
	
	
	public void create(String dest, Date dateStart, Date dateEnd, String cdCliente, TypeFile typeFile) throws IOException, SQLException{
		FileExportEasyWay fileExportEasyWay = new FileExportEasyWay();		
		this.setLayoutInList(fileExportEasyWay, typeFile, dateStart, dateEnd, cdCliente);
		this.createTxt(fileExportEasyWay, typeFile, dest + this.getNameFile(typeFile, null, FormatFile.PERIODO));
	}
	
	private void setLayoutInList (FileExportEasyWay fileExportEasyWay, 
								  TypeFile typeFile,
								  Date dateStart,
								  Date dateEnd,
								  String cdCliente) throws SQLException {
		ExtractDataDB exDb = new ExtractDataDB();
		switch (typeFile) {
		
			case MOVFINANCEIROM10:
				fileExportEasyWay.setMovFinanceiraM10(exDb.consultaM10(dateStart, dateEnd, cdCliente));
			break;	
			
			case MOVFINANCEIROM3:
				fileExportEasyWay.setMovFinanceiraM3(exDb.consultaM3(dateStart, dateEnd, cdCliente));
			break;	
			
			case CONTRIBUINTESC3:
				fileExportEasyWay.setContribuintesC3(exDb.consultaContribuintesC3(dateStart, dateEnd, cdCliente));
			break;	
			
		}
	}
	
	public void create(String dest, Integer ano, FormatFile format, String cdCliente, TypeFile typeFile) throws IOException, SQLException {
		
		FileExportEasyWay fileExportEasyWay = new FileExportEasyWay();
		Long qtdeReg = 0l;
		if (format.getFormat().equals(FormatFile.MENSAL.getFormat())) {
			
			for (int i = 0 ; i <= 11 ; i++) {
				Date dateStart = this.getMesInicial(i, ano);
				Date dateEnd = this.getDiaMesFinal(dateStart);	
				this.setLayoutInList(fileExportEasyWay, typeFile, dateStart, dateEnd, cdCliente);
				qtdeReg = this.createTxt(fileExportEasyWay, typeFile, dest + this.getNameFile(typeFile, dateStart, format));
			}
		} else if (format.getFormat().equals(FormatFile.DIARIO.getFormat())) {
			Calendar cal = Calendar.getInstance();
			Date dateStart = this.getMesInicial(0, ano);
			do {									
				this.setLayoutInList(fileExportEasyWay, typeFile, dateStart, dateStart, cdCliente);
				qtdeReg = this.createTxt(fileExportEasyWay, typeFile, dest + this.getNameFile(typeFile, dateStart, format));
				dateStart = DateUtils.addDays(dateStart, 1);
				cal.setTime(dateStart);				
			} while (ano == cal.get(Calendar.YEAR));
		}
		
		this.createResumeFile(fileExportEasyWay, typeFile, qtdeReg);
	}
	
	private ResumeFile createResumeFile(FileExportEasyWay fileExportEasyWay, TypeFile typeFile, Long qtdeRegistros) {
		BufferedWriter writter = null;
		ResumeFile resumeFile = null;
		try {
			String nameFile =  String.valueOf(typeFile.getLabel() + "_" + System.currentTimeMillis()) + ".txt";
			resumeFile = new ResumeFile();
			resumeFile.setLayout(typeFile.getLabel());
			resumeFile.setIdResume(nameFile);				
			
			Path pathDest = Paths.get(resumeFile.getIdResume());
			
			writter =  Files.newBufferedWriter(pathDest, StandardCharsets.UTF_8 , StandardOpenOption.CREATE);
			writter.append(ColumnsResumeFile.LAYOUT);
			writter.append(typeFile.getLabel());
			writter.newLine();
			writter.append(ColumnsResumeFile.DESCRICAO);
			writter.append(typeFile.getDescription());
			writter.newLine();
			writter.append(ColumnsResumeFile.QTDE_REGISTROS);
			writter.append(qtdeRegistros.toString());
			writter.flush();
			
		} catch (IOException e) {				
			logger.error("Erro ao criar o arquivo de resumo");
		} finally {
			if (writter != null) {
				try {
					writter.close();
				} catch (IOException e) {
					logger.error("Erro ao criar o arquivo de resumo");
				}
			}
		}
			
		return resumeFile;
	}
		
	/**
	 * Cria o arquivo com base no layout passado como argumento
	 * 
	 * @param fileExportEasyWay
	 * @param type
	 * @param dest
	 * @throws IOException
	 */
	private Long createTxt(FileExportEasyWay fileExportEasyWay , TypeFile type, String dest) throws IOException {					
		Path path = Paths.get(dest);
		switch (type) {
			case MOVFINANCEIROM10:
				this.createFileMovFinanceirosM10(fileExportEasyWay, path);
				return qtdeRegistrosM10;
			
			case MOVFINANCEIROM3:
				this.createFileMovFinanceirosM3(fileExportEasyWay, path);
				return qtdeRegistrosM3;
			
			case CONTRIBUINTESC3:
				this.createFileC3(fileExportEasyWay, path);
				return qtdeRegistrosC3;
	
			default:
				return 0l;
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
			logger.info("Criando o arquivo de layout ContribuintesC3...");
			if (!contribuintesC3List.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			int count = 0;
			for (ContribuintesC3 c3 : contribuintesC3List) {
				//trucando as colunas de acordo com o tamanho
				String cpfCnpj = StringUtils.substring(isEmpty(c3.getCpfCnpj()), 0, 14);
				String nomeContr = StringUtils.substring(isEmpty(c3.getNomeContribuinte()), 0, 60);
				String logradouro = StringUtils.substring(isEmpty(c3.getLogradouro()), 0, 80);
				String numero = StringUtils.substring(isEmpty(c3.getNumero()), 0, 8);
				String compl = StringUtils.substring(isEmpty(c3.getCompl()), 0, 40);
				String codMunicipio = StringUtils.substring(isEmpty(c3.getCodMunicipio()), 0, 8);
				String cep = StringUtils.substring(isEmpty(c3.getCep()), 0, 8);
				String bairro = StringUtils.substring(isEmpty(c3.getBairro()), 0, 20);
				String descCidade = StringUtils.substring(isEmpty(c3.getDescCidade()), 0, 30);
				String uf = StringUtils.substring(isEmpty(c3.getUf()), 0, 2);
				String telefone = StringUtils.substring(isEmpty(c3.getTelefone()), 0, 15);
				String dataNasc = StringUtils.substring(isEmpty(c3.getDataNasc()), 0, 8);
				String insMunicipal = StringUtils.substring(isEmpty(c3.getInscMunicipal()), 0, 20);
				String inscInss = StringUtils.substring(isEmpty(c3.getInscInss()), 0, 11);
				String cbo = StringUtils.substring(isEmpty(c3.getCbo()), 0, 6);
				String categoriaTrabalhador = StringUtils.substring(isEmpty(c3.getCategoriaTrabalhador()), 0, 2);
				String imprimeDadosDepoNoRpa = StringUtils.substring(isEmpty(c3.getImprimeDadosDepoNoRpa()), 0, 1);
				String tipoContaBancaria = StringUtils.substring(isEmpty(c3.getTipoContaBancaria()), 0, 1);
				String codBanco = StringUtils.substring(isEmpty(c3.getCodBanco()), 0, 3);
				String codAgencia = StringUtils.substring(isEmpty(c3.getCodAgencia()), 0, 8);
				String nomeAgencia = StringUtils.substring(isEmpty(c3.getNomeAgencia()), 0, 14);
				String contaCorrente = StringUtils.substring(isEmpty(c3.getContaCorrente()), 0, 20);
				String dataIncluSistemaOrigem = StringUtils.substring(isEmpty(c3.getDataInclusaoSistemaOrigem()), 0, 14);
				String dataUltAtualizacaoSisOrigem = StringUtils.substring(isEmpty(c3.getDataUltAtualizacaoSisOrigem()), 0, 8);
				String estrangeiroSemCpf = StringUtils.substring(isEmpty(c3.getEstrangeiroSemCpf()), 0, 1);
				String codPais = StringUtils.substring(isEmpty(c3.getCodPais()), 0, 3);
				String numIdentFiscal = StringUtils.substring(isEmpty(c3.getNumIdentFiscal()), 0, 20);
				String natRelacao = StringUtils.substring(isEmpty(c3.getNatRelacao()), 0, 3);
				String descEstado = StringUtils.substring(isEmpty(c3.getDescEstado()), 0, 40);
				String identProdutorRural = StringUtils.substring(isEmpty(c3.getIdentProdutorRural()), 0, 1);
				String noCEI = StringUtils.substring(isEmpty(c3.getNoCEI()), 0, 12);
				String identMicroEmpresa = StringUtils.substring(isEmpty(c3.getIdentMicroEmpresa()), 0, 1);
				String docFiscalEmitido = StringUtils.substring(isEmpty(c3.getDocFiscalEmitido()), 0, 1);
				String email = StringUtils.substring(isEmpty(c3.getEmail()), 0, 60);
				String pesFisJuridica = StringUtils.substring(isEmpty(c3.getPesFisJuridica()), 0, 1);
				String inscEstadual = StringUtils.substring(isEmpty(c3.getInscEstadual()), 0, 20);
				String dispNif = StringUtils.substring(isEmpty(c3.getDispNif()), 0, 1);
				String retemPisCofinsCs = StringUtils.substring(isEmpty(c3.getRetemPisCofinsCs()), 0, 1);
				String statusContribuinte = StringUtils.substring(isEmpty(c3.getStatusContribuinte()), 0, 1);
				String tipoLogradouro = StringUtils.substring(isEmpty(c3.getTipoLogradouro()), 0, 10);
				String isentoInscrEstadual = StringUtils.substring(isEmpty(c3.getIsentoInscrEstadual()), 0, 1);
				String centralizarGeracaoInf = StringUtils.substring(isEmpty(c3.getCentralizarGeracaoInf()), 0, 1);
				String cpfCnpjContribCentralizador = StringUtils.substring(isEmpty(c3.getCpfCnpjContribCentralizador()), 0, 14);
				String tipoInformesCentralizados = StringUtils.substring(isEmpty(c3.getTipoInformesCentralizados()), 0, 2);
				String codCateTrabalhadorESocial = StringUtils.substring(isEmpty(c3.getCodCateTrabalhadorESocial()), 0, 3);
				String sexo = StringUtils.substring(isEmpty(c3.getSexo()), 0, 1);
				String racaCor = StringUtils.substring(isEmpty(c3.getRacaCor()), 0, 1);
				String estadoCivil = StringUtils.substring(isEmpty(c3.getEstadoCivil()), 0, 1);
				String grauEscolaridade = StringUtils.substring(isEmpty(c3.getGrauEscolaridade()), 0, 2);
				String foneAlternativo = StringUtils.substring(isEmpty(c3.getFoneAlternativo()), 0, 15);
				String emailAlternativo = StringUtils.substring(isEmpty(c3.getEmailAlternativo()), 0, 60);
				String municipioNasc = StringUtils.substring(isEmpty(c3.getMunicipioNasc()), 0, 8);
				String paisNasc = StringUtils.substring(isEmpty(c3.getPaisNasc()), 0, 5);
				String paisNacionalidade = StringUtils.substring(isEmpty(c3.getPaisNacionalidade()), 0, 5);
				String nomeMae = StringUtils.substring(isEmpty(c3.getNomeMae()), 0, 80);
				String nomePai = StringUtils.substring(isEmpty(c3.getNomePai()), 0, 80);
				String codCliente = StringUtils.substring(isEmpty(c3.getCodCliente()), 0, 11);
				//escrevendo no arquivo				
				writer.append(StringUtils.leftPad(cpfCnpj, 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(nomeContr, 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(logradouro, 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(numero, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(compl, 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codMunicipio, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(cep, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(bairro, 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(descCidade, 30, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(uf, 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(telefone, 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(dataNasc, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(insMunicipal, 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(inscInss, 11, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(cbo, 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(categoriaTrabalhador, 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(imprimeDadosDepoNoRpa, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(tipoContaBancaria, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codBanco, 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codAgencia, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(nomeAgencia, 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(contaCorrente, 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(dataIncluSistemaOrigem, 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(dataUltAtualizacaoSisOrigem, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(estrangeiroSemCpf, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codPais, 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(numIdentFiscal, 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(natRelacao, 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(descEstado, 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(identProdutorRural, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(noCEI, 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(identMicroEmpresa, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(docFiscalEmitido, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(email, 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(pesFisJuridica, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(inscEstadual, 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(dispNif, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(retemPisCofinsCs, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(statusContribuinte, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(tipoLogradouro, 10, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isentoInscrEstadual, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(centralizarGeracaoInf, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.leftPad(cpfCnpjContribCentralizador, 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(tipoInformesCentralizados, 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codCateTrabalhadorESocial, 3, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(sexo, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(racaCor, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(estadoCivil, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(grauEscolaridade, 2, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(foneAlternativo, 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(emailAlternativo, 60, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(municipioNasc, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(paisNasc, 5, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(paisNacionalidade, 5, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(nomeMae, 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(nomePai, 80, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codCliente, 11, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
				count++;
				qtdeRegistrosC3++;
				if (count % BUFFER_MAX == 0)
					writer.flush();
			}
			
			if (!contribuintesC3List.isEmpty() && writer != null)
				writer.flush();
			
		}catch (IOException e) {
			logger.error("Erro na criação do layout de CadastroC3 ...");
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
			logger.info("Criando o arquivo de layout MovFinanceirosM3...");
			if (!movFinanceiraM3.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			int count = 0;
			for (MovFinanceiraM3 mov : movFinanceiraM3) {
				//trucando as colunas de acordo com o tamanho
				String codEmpresa = StringUtils.substring(isEmpty(mov.getCodEmpresa()), 0, 5);
				String filial =  StringUtils.substring(isEmpty(mov.getFilial()), 0 , 4);
				String cpfCnpj = StringUtils.substring(isEmpty(mov.getCpfCnpj()), 0, 14);
				String codRendimento = StringUtils.substring(isEmpty(mov.getCodRendimento()), 0, 4);
				String codTipoServico = StringUtils.substring(isEmpty(mov.getCodTipoServico()), 0, 12);
				String tipoLancto = StringUtils.substring(isEmpty(mov.getTipoLancto()), 0, 40);
				String anoMes = StringUtils.substring(isEmpty(mov.getAnoMes()), 0, 6);
				String saldo = StringUtils.substring(isEmpty(mov.getSaldo()), 0, 17);
				String codDependente = StringUtils.substring(isEmpty(mov.getCodDependente()), 0, 10);
				String numeroAgencia = StringUtils.substring(isEmpty(mov.getNumeroAgencia()), 0, 8);
				String numeroContaCorrente = StringUtils.substring(isEmpty(mov.getNumeroContaCorrente()), 0, 12);
				String dataEncConta = StringUtils.substring(isEmpty(mov.getDataEncConta()), 0, 8);
				String codIntermediario = StringUtils.substring(isEmpty(mov.getCodIntermediario()), 0, 14);
				String tipoRelacaoTerceiro = StringUtils.substring(isEmpty(mov.getTipoRelacaoTerceiro()), 0, 1);
				String cpfCnpjProcurador = StringUtils.substring(isEmpty(mov.getCpfCnpjProcurador()), 0, 14);
				//escrevendo no arquivo
				writer.append(StringUtils.rightPad(codEmpresa, 5, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(filial, 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.leftPad(cpfCnpj, 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(codRendimento, 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codTipoServico, 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(tipoLancto, 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(anoMes, 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(saldo, 17, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codDependente, 10, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(numeroAgencia, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(numeroContaCorrente, 12, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(dataEncConta, 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(codIntermediario, 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(tipoRelacaoTerceiro, 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(cpfCnpjProcurador, 14, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
				count++;
				qtdeRegistrosM3++;
				if (count % BUFFER_MAX == 0)
					writer.flush();
				
			}
			
			if (!movFinanceiraM3.isEmpty() && writer != null)
				writer.flush();
			
		} catch (IOException e) {
			logger.error("Erro na criação do layout de MovFinanceirosM3 ...");
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
			logger.info("Criando o arquivo de layout MovFinanceiroM10...");
			if (!movFinanceiraM10.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 , StandardOpenOption.CREATE);	
			}
			int count = 0;			
			for (MovFinanceira mov : movFinanceiraM10) {
				//trucando as colunas de acordo com o tamanho
				String codEmpresa  = StringUtils.substring(isEmpty(mov.getCodEmpresa()), 0, 5);
				String filial = StringUtils.substring(isEmpty(mov.getFilial()), 0, 4);				
				String cpfCnpj = StringUtils.substring(isEmpty(mov.getCpfCnpj()), 0, 14);
				String numeroDoc = StringUtils.substring(isEmpty(mov.getNumeroDoc()), 0, 18);
				String dataOperacao = StringUtils.substring(isEmpty(mov.getDataOperacao()), 0, 8);
				String codOperacao = StringUtils.substring(isEmpty(mov.getCodOperacao()), 0, 40);
				String valorOperacao = StringUtils.substring(isEmpty(mov.getValorOperacao()), 0, 17);
				String sinalOperacao = StringUtils.substring(isEmpty(mov.getSinalOperacao()), 0, 1);
				String numeroAuxDoc = StringUtils.substring(isEmpty(mov.getNumeroAuxiliarDoc()), 0, 20);
				String observacoes = StringUtils.substring(isEmpty(mov.getObservacoes()), 0, 120);
				String dataInclusao = StringUtils.substring(isEmpty(mov.getDataInclusao()), 0, 8);
				String tipoMov = StringUtils.substring(isEmpty(mov.getTipoMov()), 0, 1);
				String numeroDocEstorn = StringUtils.substring(isEmpty(mov.getNumeroDocEstornado()), 0, 18);
				String numeroAuxDoc2 = StringUtils.substring(isEmpty(mov.getNumeroDocAuxiliarEstornado()), 0, 20);
				String dataOperacaoDocEstorn = StringUtils.substring(isEmpty(mov.getDataOperacaoDocEstornado()), 0, 8);
				String codOperacaoDocEstorn = StringUtils.substring(isEmpty(mov.getCodOperacaoDocEstornado()), 0, 40);
				String codDependente = StringUtils.substring(isEmpty(mov.getCodDependente()), 0, 15);
				String cpfCnpjDocEstornado = StringUtils.substring(isEmpty(mov.getCpfCnpjDocEstornado()), 0, 14);
				String divisao = StringUtils.substring(isEmpty(mov.getDivisao()), 0, 6);
				String cnpjScp = StringUtils.substring(isEmpty(mov.getCnpjScp()), 0, 14);
				String mesmaTitularidade = StringUtils.substring(isEmpty(mov.getMesmaTitularidade()), 0, 1);
				String codIntermediario = StringUtils.substring(isEmpty(mov.getCodIntermediario()), 0, 14);
				String dataEncConta = StringUtils.substring(isEmpty(mov.getDataEncConta()), 0, 8);
				String numeroConta = StringUtils.substring(isEmpty(mov.getNumeroConta()), 0, 50);
				//escrevendo no arquivo
				writer.append(StringUtils.rightPad(isEmpty(codEmpresa), 5, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(isEmpty(filial), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.leftPad(isEmpty(cpfCnpj), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(numeroDoc), 18, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(dataOperacao), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(codOperacao), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(valorOperacao), 17, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(sinalOperacao), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(numeroAuxDoc), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(observacoes), 120, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(dataInclusao), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(tipoMov), 1, CARACTER_PREENCHIMENTO_01));		
				writer.append(StringUtils.rightPad(isEmpty(numeroDocEstorn), 18, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(numeroAuxDoc2), 20, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(dataOperacaoDocEstorn), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(codOperacaoDocEstorn), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(codDependente), 15, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.leftPad(isEmpty(cpfCnpjDocEstornado), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(divisao), 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.leftPad(isEmpty(cnpjScp), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(isEmpty(mesmaTitularidade), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(codIntermediario), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(dataEncConta), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(isEmpty(numeroConta), 50, CARACTER_PREENCHIMENTO_01));
				writer.newLine();
				qtdeRegistrosM10++;
				count++;
				if (count % BUFFER_MAX == 0)
					writer.flush();
			}
			
			if (writer != null)
				writer.flush();
			
		} catch (IOException e) {
			logger.error("Erro na criação do layout de MovFinanceirosM10 ...");
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
	private String getNameFile (TypeFile type, Date date, FormatFile format) {
		
		String nomeArquivo = "";
		
		switch (type) {
		
			case MOVFINANCEIROM10:
				nomeArquivo = String.format("MOVDF%s.txt", Utils.getNameFile(date, format));
			break;
			
			case MOVFINANCEIROM3:
				nomeArquivo = String.format("CONTCOR%s.txt", Utils.getNameFile(date, format));
			break;	
			
			case CONTRIBUINTESC3:
				nomeArquivo = String.format("CONTRI%s.txt", Utils.getNameFile(date, format));
			break;	
		}
		//TODO retornar o nome adequado futuramente
		return nomeArquivo;
	}
	
	
}
