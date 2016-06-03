package br.com.cedrotech.extract;

/**
 * Formato do nome do arquivo
 * 
 * @author Allan Borges
 *
 */
public enum FormatFile {
	
	MENSAL("yyMM"),
	UNICO(""),
	DIARIO("ddMMyy");
	
	private String format;
	
	private FormatFile(String format) {
		this.setFormat(format);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
