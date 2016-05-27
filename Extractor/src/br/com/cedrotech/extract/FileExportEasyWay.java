package br.com.cedrotech.extract;

import java.util.List;import br.com.cedrotech.dtos.ContribuintesC3;
import br.com.cedrotech.dtos.FundoInvestimento;
import br.com.cedrotech.dtos.MovFinanceira;
import br.com.cedrotech.dtos.MovFinanceiraM3;

public class FileExportEasyWay {

	private List<ContribuintesC3> contribuintesC3;
	private List<MovFinanceiraM3> movFinanceiraM3;
	private List<MovFinanceira> movFinanceiraM10;
	private List<MovFinanceira> movFinanceiraBovespa;
	private List<FundoInvestimento> cadastroFundoInvest;
	private List<MovFinanceira> movSaldoCustodia;
	
	public List<MovFinanceira> getMovFinanceiraBovespa() {
		return movFinanceiraBovespa;
	}

	public void setMovFinanceiraBovespa(List<MovFinanceira> movFinanceiraBovespa) {
		this.movFinanceiraBovespa = movFinanceiraBovespa;
	}

	public List<FundoInvestimento> getCadastroFundoInvest() {
		return cadastroFundoInvest;
	}

	public void setCadastroFundoInvest(List<FundoInvestimento> cadastroFundoInvest) {
		this.cadastroFundoInvest = cadastroFundoInvest;
	}

	public List<MovFinanceira> getMovSaldoCustodia() {
		return movSaldoCustodia;
	}

	public void setMovSaldoCustodia(List<MovFinanceira> movSaldoCustodia) {
		this.movSaldoCustodia = movSaldoCustodia;
	}

	public List<MovFinanceira> getMovFinanceiraM10() {
		return movFinanceiraM10;
	}

	public void setMovFinanceiraM10(List<MovFinanceira> movFinanceiraM10) {
		this.movFinanceiraM10 = movFinanceiraM10;
	}

	public List<MovFinanceiraM3> getMovFinanceiraM3() {
		return movFinanceiraM3;
	}

	public void setMovFinanceiraM3(List<MovFinanceiraM3> movFinanceiraM3) {
		this.movFinanceiraM3 = movFinanceiraM3;
	}

	public List<ContribuintesC3> getContribuintesC3() {
		return contribuintesC3;
	}

	public void setContribuintesC3(List<ContribuintesC3> contribuintesC3) {
		this.contribuintesC3 = contribuintesC3;
	}	
	
}
