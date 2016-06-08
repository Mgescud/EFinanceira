package br.com.cedrotech.extract;

/**
 * Enum com os tipos de layouts
 * 
 * @author Allan Borges
 *
 */
public enum TypeFile {	
	TODOS("TODOS",""),
	CONTRIBUINTESC3("C3", "Contribuintes"),
	MOVFINANCEIROM10("M10","Movimentos para a E-Financeira"),
	MOVFINANCEIROM3("M3","Saldos de Contas Correntes");
	
	private String label;
	private String description;
	
	private TypeFile (String label, String description) {
		this.setLabel(label);
		this.setDescription(description);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
