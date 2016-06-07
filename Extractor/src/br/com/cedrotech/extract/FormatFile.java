package br.com.cedrotech.extract;

/**
 * Formato do nome(ano/MM , dd/MM/yy) do arquivo 
 * 
 * @author Allan Borges
 *
 */
public enum FormatFile {
	
	MENSAL("yyMM", "Mensal"),
	PERIODO("", "Periodo"),
	DIARIO("ddMMyy", "Diario");
	
	private String format;
	private String label;
	
	private FormatFile(String format, String label) {
		this.setFormat(format);
		this.setLabel(label);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public static FormatFile getInstance(String label) { 
		for (FormatFile fFile : FormatFile.values()) {
			if (fFile.getLabel().equals(label))
				return fFile;
		}
		return null;
	}
}
