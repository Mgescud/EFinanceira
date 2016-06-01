package br.com.cedrotech.extract;

public enum FormatFile {
	
	MENSAL("yyMM"),
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
