package br.com.cedrotech.extract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import br.com.cedrotech.database.Conexao;
import br.com.cedrotech.dtos.ContribuintesC3;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;

public class ExtractDataDB {
	
	private Connection conn = Conexao.getConexao();
	
	public ExtractDataDB () throws SQLException {
		
	}
	
	final static Logger logger = Logger.getLogger(ExtractDataDB.class);
			
	public List<MovFinanceira> consultaM10 (Date inicio, Date fim, String cdCliente) throws SQLException {
		StringBuilder sql = new StringBuilder();		
		List<MovFinanceira> listMovFinanceira = new ArrayList<>();		
		
		sql.append(" select 308 as codigo_empresa, ");
		sql.append(" t.cd_cpfcgc as cpf_cliente, ");
		sql.append(" t.nr_lancamento as numero_documento, ");
		sql.append(" TO_CHAR(t.dt_lancamento, 'DDMMYYYY') as data_operacao, ");
		sql.append(" ABS(t.vl_lancamento) as valor_lancamento, ");
		sql.append(" case ");
		sql.append(" when vl_lancamento < 0 then 'D' ");
		sql.append(" else 'C' end sinal_operacao, ");
		sql.append(" t.cd_cliente as numero_conta, ");
		sql.append("t.ds_lancamento as observacao ");
		sql.append(" from CORRWIN.TCCHISMOV t ");
		//TODO passar data como parametro
		
		sql.append(" where t.dt_lancamento between  TO_DATE(?,'dd/mm/yyyy') and  TO_DATE(?,'dd/mm/yyyy') ");
		
		if (StringUtils.isNotBlank(cdCliente))
			sql.append(" and t.cd_cliente = ? ");
		
		sql.append(" Order by t.cd_cpfcgc, t.dt_lancamento ");
		
		PreparedStatement  prepStament = null;
		try {
			prepStament = conn.prepareStatement(sql.toString());	
			prepStament.setString(1, Utils.parseDateToString(inicio));
			prepStament.setString(2, Utils.parseDateToString(fim));
			
			if (StringUtils.isNotBlank(cdCliente))
				prepStament.setString(3, cdCliente);
			
			ResultSet rs = prepStament.executeQuery();				
			listMovFinanceira = (List<MovFinanceira>) CreateObject.createObject(rs, TypeFile.MOVFINANCEIROM10);			
		} catch (SQLException e) {
			logger.error("Erro na execução da query de consultaM10 : " + e.getMessage());
		} finally {
			if (prepStament != null)
				prepStament.close();
		}
		
		return listMovFinanceira;
	}
		
	
	public List<MovFinanceiraM3> consultaM3 (Date inicio, Date fim, String cdCliente) throws SQLException {
		StringBuilder sql = new StringBuilder();
		List<MovFinanceiraM3> listMovFinanceira = new ArrayList<>();
		
		sql.append(" select 308 As CodigoEmpresa,");
		sql.append(" 		'' as Filial,");
		sql.append("	    BOL.CD_CPFCGC as CPFCNPJ,");
		sql.append("        9999 as CodigoRendimento,");
		sql.append("		DS_MERCADO as CodigoTipoServico,");
		sql.append("	    '' as TipoLancamento,");
		sql.append("	    TO_CHAR(Dt_Movimento,'yyyyMM') as anoMes,");
		sql.append("	    SUM( Vl_Custo ) as Saldo,");
		sql.append("		1 as NumeroAgencia,");
		sql.append("		SIN.CD_CLIENTE as NumeroContaCorrente,");
		sql.append(" 		'' as DataEncerramentoConta,");
		sql.append("		'' as CodigoIntermediario,");
		sql.append("		3 as TipoRelacaoTerceiro,");
		sql.append("		'' as CNPJ");
		sql.append(" from VW_SINACORAR_POSATIVOS SIN ");
		sql.append(" join CORRWIN.TSCCLIBOL BOL ON SIN.CD_CLIENTE = BOL.CD_CLIENTE ");		
		sql.append(" where dt_movimento between TO_DATE(?,'dd/mm/yyyy')  and TO_DATE(?,'dd/mm/yyyy')");		
		
		if (StringUtils.isNotBlank(cdCliente))
			sql.append(" AND SIN.cd_cliente = ? ");
		
		sql.append(" Group By 308,");
		sql.append("	      BOL.CD_CPFCGC,");
		sql.append("		  DS_MERCADO,");
		sql.append("		  TO_CHAR(Dt_Movimento,'yyyyMM'),");
		sql.append("		  SIN.CD_CLIENTE");
		sql.append(" Order by SIN.CD_CLIENTE, TO_CHAR(Dt_Movimento,'yyyyMM') ");
		
		PreparedStatement  prepStament = null;
		try {
			prepStament = conn.prepareStatement(sql.toString());
			prepStament.setString(1, Utils.parseDateToString(inicio));
			prepStament.setString(2, Utils.parseDateToString(fim));
			
			if (StringUtils.isNotBlank(cdCliente))
				prepStament.setString(3, cdCliente); 
			
			ResultSet rs = prepStament.executeQuery();
			listMovFinanceira = (List<MovFinanceiraM3>) CreateObject.createObject(rs, TypeFile.MOVFINANCEIROM3);			
		} catch (SQLException e) {
			logger.error("Erro na execução da query de consultaM3 : " + e.getMessage());
		} finally {
			if (prepStament != null)
				prepStament.close();
		}
		
		return listMovFinanceira;
	}
	
	public List<ContribuintesC3> consultaContribuintesC3(Date inicio, Date fim, String cdCliente) throws SQLException{
		String sql = LoadFiles.loadSql("files/c3.txt");
		
		if (StringUtils.isNotBlank(cdCliente))
			sql += " WHERE F.CD_CLIENTE = ? ";
		
		List<ContribuintesC3> contribuintesC3List = new ArrayList<>();
		
		PreparedStatement  prepStament = null;
		
		try {
			prepStament = conn.prepareStatement(sql);
			
			if (StringUtils.isNotBlank(cdCliente))
				prepStament.setString(1, cdCliente);
			
			ResultSet rs = prepStament.executeQuery();
			contribuintesC3List = (List<ContribuintesC3>) CreateObject.createObject(rs, TypeFile.CONTRIBUINTESC3);			
		} catch (SQLException e) { e.printStackTrace(); 
			logger.error("Erro na execucação da query de consultaContribuintesC3: " + e.getMessage());
		} finally {
			if (prepStament != null)
				prepStament.close();
		}		
		
		return contribuintesC3List;
	}

}
