package br.com.cedrotech.dtos;

import java.util.Date;

public class ResumeFile {
	
	private String layout;
	private Long qtde;
	private String descErro;
	private Date dateInicio;
	
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public Long getQtde() {
		return qtde;
	}
	public void setQtde(Long qtde) {
		this.qtde = qtde;
	}
	public String getDescErro() {
		return descErro;
	}
	public void setDescErro(String descErro) {
		this.descErro = descErro;
	}
	public Date getDateInicio() {
		return dateInicio;
	}
	public void setDateInicio(Date dateInicio) {
		this.dateInicio = dateInicio;
	}

}
