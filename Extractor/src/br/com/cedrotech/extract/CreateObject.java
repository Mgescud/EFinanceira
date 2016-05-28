package br.com.cedrotech.extract;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cedrotech.dtos.ContribuintesC3;
import br.com.cedrotech.dtos.DtoObject;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;

/**
 * Classe para criação dos objetos(Dto) de forma adequada
 * com base no resultSet das query's executadas
 * 
 * @author Allan Borges
 *
 */
public class CreateObject {

	public static List<? extends DtoObject> createObject(ResultSet result, TypeFile typeFile) {
		List<? extends DtoObject> dtoObjectList = new ArrayList<>();
		if (result != null) {
			try {				
				switch (typeFile) {
				
					case MOVFINANCEIROM10:
						dtoObjectList = createM10Object(result);
					break;	
					
					case MOVFINANCEIROM3:
						dtoObjectList = createM3Object(result);
					break;	
					
					case CONTRIBUINTESC3:
						dtoObjectList = createContribuinteC3(result);
					default:
					break;
				}				
				
			} catch (SQLException e) {
				throw new IllegalArgumentException("ResultSet Com Erro");
			} finally {
				try {
					result.close();
				} catch (SQLException e) {
					throw new IllegalArgumentException("Erro no fechamento Com Erro");
				}
			}
		}
		return dtoObjectList;		
	}
	
	
	private static List<ContribuintesC3> createContribuinteC3(ResultSet result) throws SQLException {
		List<ContribuintesC3> contribuintesC3List = new ArrayList<>();
		while (result.next()) {
			ContribuintesC3 contrC3 = new ContribuintesC3();
			contrC3.setCpfCnpj(result.getString("CPF_CONTRIBUINTE"));
			contrC3.setNomeContribuinte(result.getString("NM_CONTRIBUINTE"));
			contrC3.setLogradouro(result.getString("LOGRADOURO"));
			contrC3.setNumero(result.getString("NUMERO"));
			contrC3.setCompl(result.getString("COMPLEMENTO"));
			contrC3.setCodMunicipio(result.getString("CODIGO_MUNICIPIO"));
			contrC3.setBairro(result.getString("BAIRRO"));
			contrC3.setDescCidade(result.getString("CIDADE"));
			contrC3.setUf(result.getString("ESTADO"));
			contrC3.setTelefone(result.getString("TELEFONE"));
			contrC3.setDataNasc(result.getString("DATA_NASCIMENTO"));
			contrC3.setTipoContaBancaria(result.getString("TIPO_CONTA"));
			contrC3.setCodBanco(result.getString("CODIGO_BANCO"));
			contrC3.setCodAgencia(result.getString("AGENCIA"));
			contrC3.setNomeAgencia(result.getString("NOME_AGENCIA"));
			contrC3.setContaCorrente(result.getString("CONTA_CORRENTE"));
			contrC3.setDataInclusaoSistemaOrigem(result.getString("DATA_INCLUSAO"));
			contrC3.setDataUltAtualizacaoSisOrigem(result.getString("DATA_ULTIMA_ATUALIZACAO"));
			contrC3.setCodPais(result.getString("PAIS"));
			contrC3.setEmail(result.getString("EMAIL"));
			contrC3.setPesFisJuridica(result.getString("PESSOA_FISICA_JURIDICA"));
			contrC3.setDispNif(result.getString("DISPENSADO_NIF"));
			contrC3.setStatusContribuinte(result.getString("STATUS_CONTRIBUINTE"));
			contrC3.setTipoLogradouro(result.getString("TIPO_LOGRADOURO"));
			contrC3.setCentralizarGeracaoInf(result.getString("CENTRALIZAR_GERACAO_INFORMES"));
			contrC3.setTipoInformesCentralizados(result.getString("TIPOS_INFORMES_CENTRALIZADOS"));
			contrC3.setSexo(result.getString("SEXO"));
			contrC3.setEstadoCivil(result.getString("ESTADO_CIVIL"));
			contrC3.setFoneAlternativo(result.getString("FONE_ALTERNATIVO"));
			contrC3.setEmailAlternativo(result.getString("EMAIL_ALTERNATIVO"));
			contrC3.setDescCidade(result.getString("CIDADE_NASCIMENTO"));
			contrC3.setPaisNasc(result.getString("PAIS_NASCIMENTO"));
			contrC3.setNomeMae(result.getString("NOME_MAE"));
			contrC3.setNomePai(result.getString("NOME_PAI"));
			contrC3.setCodCliente(result.getString("CODIGO_CLIENTE"));
			contribuintesC3List.add(contrC3);
			
		}
		return contribuintesC3List;
	}
	
	private static List<MovFinanceira> createM10Object(ResultSet result) throws SQLException {
		List<MovFinanceira> movFinanceiraList = new ArrayList<>();  
		while (result.next()) {
			MovFinanceira mov10 = new MovFinanceira();
			mov10.setCodEmpresa(result.getString("codigo_empresa"));
			mov10.setCpfCnpj(result.getString("cpf_cliente"));
			mov10.setNumeroDoc(result.getString("numero_documento"));
			mov10.setDataOperacao(result.getString("data_operacao"));
			mov10.setValorOperacao(result.getString("valor_lancamento"));
			mov10.setSinalOperacao(result.getString("sinal_operacao"));
			mov10.setNumeroConta(result.getString("numero_conta"));
			mov10.setObservacoes(result.getString("observacao"));					
			movFinanceiraList.add(mov10);
		}
		return movFinanceiraList;
	}
	
	public static List<MovFinanceiraM3> createM3Object(ResultSet result) throws SQLException {
		List<MovFinanceiraM3> movFinanceiraM3List = new ArrayList<>();
		while (result.next()) {
			MovFinanceiraM3 mov3 = new MovFinanceiraM3();
			mov3.setCodEmpresa(result.getString("CodigoEmpresa"));
			mov3.setFilial(result.getString("Filial"));
			mov3.setCpfCnpj(result.getString("CPFCNPJ"));
			mov3.setCodRendimento(result.getString("CodigoRendimento"));
			mov3.setCodTipoServico(result.getString("CodigoTipoServico"));
			mov3.setTipoLancto(result.getString("TipoLancamento"));
			mov3.setAnoMes(result.getString("AnoMes"));
			mov3.setSaldo(result.getString("Saldo"));			
			mov3.setNumeroAgencia(result.getString("NumeroAgencia"));
			mov3.setNumeroContaCorrente(result.getString("NumeroAgencia"));
			mov3.setDataEncConta(result.getString("DataEncerramentoConta"));
			mov3.setCodIntermediario(result.getString("CodigoIntermediario"));
			mov3.setTipoRelacaoTerceiro(result.getString("TipoRelacaoTerceiro"));
			mov3.setCpfCnpjProcurador(result.getString("CNPJ"));
			movFinanceiraM3List.add(mov3);
		}
		return movFinanceiraM3List;
	}
}
