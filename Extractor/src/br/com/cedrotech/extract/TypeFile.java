package br.com.cedrotech.extract;

/**
 * Enum com os tipos de layouts
 * 
 * @author Allan Borges
 *
 */
public enum TypeFile {	
	TODOS("TODOS"),
	CONTRIBUINTESC3("C3"),
	MOVFINANCEIROM10("M10"),
	MOVFINANCEIROM3("M3"),
	MOVFINANCEIRO(""),
	MOVSALDOCONTAS("");
	
	private String label;
	
	private TypeFile (String label) {
		this.setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public static TypeFile getInstance(String label) { 
		for (TypeFile typeFile : TypeFile.values()) {
			if (typeFile.getLabel().equals(label))
				return typeFile;
		}
		return TypeFile.TODOS;
	}
}
