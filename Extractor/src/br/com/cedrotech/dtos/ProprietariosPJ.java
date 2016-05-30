package br.com.cedrotech.dtos;

public class ProprietariosPJ implements DtoObject {
	
	private String cnpj;
	private String cpfCnpjProp;
	private String siglaPais;
	private String reportavelPais;
	private String vigenciaInicial;
	private String vigenciaFinal;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCpfCnpjProp() {
		return cpfCnpjProp;
	}
	public void setCpfCnpjProp(String cpfCnpjProp) {
		this.cpfCnpjProp = cpfCnpjProp;
	}
	public String getSiglaPais() {
		return siglaPais;
	}
	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	public String getReportavelPais() {
		return reportavelPais;
	}
	public void setReportavelPais(String reportavelPais) {
		this.reportavelPais = reportavelPais;
	}
	public String getVigenciaInicial() {
		return vigenciaInicial;
	}
	public void setVigenciaInicial(String vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}
	public String getVigenciaFinal() {
		return vigenciaFinal;
	}
	public void setVigenciaFinal(String vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}
	

}
