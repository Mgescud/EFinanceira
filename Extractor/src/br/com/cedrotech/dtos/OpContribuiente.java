package br.com.cedrotech.dtos;

public class OpContribuiente {
	
	private String cpfCnpj;
	private String codServicoOp;
	private String prioridadeServico;
	private String calculaPensaoAlimenticia;
	private String criterioParaCalculoPensao;
	private String percentualASerAplicadoSobRend;
	private String imprimeRecibo;
	private String imprimeDadosParaDepRecb;
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getCodServicoOp() {
		return codServicoOp;
	}
	public void setCodServicoOp(String codServicoOp) {
		this.codServicoOp = codServicoOp;
	}
	public String getPrioridadeServico() {
		return prioridadeServico;
	}
	public void setPrioridadeServico(String prioridadeServico) {
		this.prioridadeServico = prioridadeServico;
	}
	public String getCalculaPensaoAlimenticia() {
		return calculaPensaoAlimenticia;
	}
	public void setCalculaPensaoAlimenticia(String calculaPensaoAlimenticia) {
		this.calculaPensaoAlimenticia = calculaPensaoAlimenticia;
	}
	public String getCriterioParaCalculoPensao() {
		return criterioParaCalculoPensao;
	}
	public void setCriterioParaCalculoPensao(String criterioParaCalculoPensao) {
		this.criterioParaCalculoPensao = criterioParaCalculoPensao;
	}
	public String getPercentualASerAplicadoSobRend() {
		return percentualASerAplicadoSobRend;
	}
	public void setPercentualASerAplicadoSobRend(String percentualASerAplicadoSobRend) {
		this.percentualASerAplicadoSobRend = percentualASerAplicadoSobRend;
	}
	public String getImprimeRecibo() {
		return imprimeRecibo;
	}
	public void setImprimeRecibo(String imprimeRecibo) {
		this.imprimeRecibo = imprimeRecibo;
	}
	public String getImprimeDadosParaDepRecb() {
		return imprimeDadosParaDepRecb;
	}
	public void setImprimeDadosParaDepRecb(String imprimeDadosParaDepRecb) {
		this.imprimeDadosParaDepRecb = imprimeDadosParaDepRecb;
	}

}
