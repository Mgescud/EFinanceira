package br.com.cedrotech.extract;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
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

import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.CadastroInfoRequest;
import br.com.cedrotech.dtos.FundoInvestimento;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;

public class CreateFile {
	
	private ExtractDataWS extractor = new ExtractDataWS();
	
	private CadastroInfoRequest cadastroInfo;
	
	private static String CARACTER_PREENCHIMENTO_01 = " ";
	private static String CARACTER_PREENCHIMENTO_02 = "0";

	public static void main(String[] args) throws IOException, SQLException {
		
		ExtractDataWS ex = new ExtractDataWS();
		ExtractDataDB exDb = new ExtractDataDB();
		
		CreateFile create = new CreateFile();	
		Date dateStart = create.getMesInicial(0, 2015);
		Date dateEnd = create.getDiaMesFinal(dateStart);
		
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
		
	public void createTxt(FileExportEasyWay fileExportEasyWay , TypeFile type, String dest) throws IOException {					
		Path path = Paths.get(dest + this.getNameFile(type));
		
		switch (type) {
			case MOVFINANCEIROM10:
				this.createFileMovFinanceirosM10(fileExportEasyWay, path);
			break;
			
			case MOVFINANCEIROM3:
				this.createFileMovFinanceirosM3(fileExportEasyWay, path);
			break;
	
			default:
			break;
		}		
	}
	
	private void createFileFundosInvestimento(FileExportEasyWay fileExportEasyWay, Path path) throws IOException {
		
		List<FundoInvestimento> listFundoInvestimento = fileExportEasyWay.getCadastroFundoInvest();
		
		BufferedWriter writer = null;
		try {
			
			if (!listFundoInvestimento.isEmpty()) {
				writer =  Files.newBufferedWriter(path);	
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
			}
						
		 }catch (IOException e) {
				e.printStackTrace();
		 }finally {
			if (writer != null)
				writer.close();
		 }					
	}
	
 	private void createFileMovFinanceirosM3(FileExportEasyWay fileExportEasyWay, Path path) throws IOException{
 		
 		List<MovFinanceiraM3> movFinanceiraM3 = fileExportEasyWay.getMovFinanceiraM3();
 		BufferedWriter writer = null;
		try {
			
			if (!movFinanceiraM3.isEmpty()) {
				writer =  Files.newBufferedWriter(path, StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);	
			}
			
			for (MovFinanceiraM3 mov : movFinanceiraM3) {
				writer.append(StringUtils.rightPad(mov.getCodEmpresa(), 5, CARACTER_PREENCHIMENTO_01));				
				writer.append(StringUtils.rightPad(mov.getFilial(), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCpfCnpj(), 14, CARACTER_PREENCHIMENTO_02));
				writer.append(StringUtils.rightPad(mov.getCodRendimento(), 4, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCodTipoServico(), 12, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getTipoLancto(), 40, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getAnoMes(), 6, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getSaldo(), 17, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCodDependente(), 10, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getNumeroAgencia(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getDataEncConta(), 8, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCodIntermediario(), 14, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getTipoRelacaoTerceiro(), 1, CARACTER_PREENCHIMENTO_01));
				writer.append(StringUtils.rightPad(mov.getCpfCnpjProcurador(), 14, CARACTER_PREENCHIMENTO_01));
				
				writer.newLine();
			}
			
			if (writer != null)
				writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
		}
 	}
			
	private void createFileMovFinanceirosM10(FileExportEasyWay fileExportEasyWay, Path path) throws IOException{		
		
		List<MovFinanceira> movFinanceiraM10 = fileExportEasyWay.getMovFinanceiraM10();
		
		BufferedWriter writer = null;
		try {
			
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
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
		}
			
	}
	
		
	private String getNameFile (TypeFile type) {
		
		String nomeArquivo = "";
		
		switch (type) {
			case MOVFINANCEIROM10:
				
			break;
			
			case MOVFINANCEIROM3:
				
			break;	
			
			
			
		}
		//TODO retornar o nome adequado futuramente
		return "MOVDFAAMM.txt";
	}
	
	
}
