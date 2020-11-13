package br.com.animati;

public enum ConselhoProfissionalType {

	CNS ("Cartão Nacional de Saúde"),
	CRM ("Conselho Regional de Medicina");
	
	private String descricao;
	
	ConselhoProfissionalType(String descricao) {
		this.descricao = descricao;	
		}

	public String getDescricao() {
		return descricao;
	}
	
}
