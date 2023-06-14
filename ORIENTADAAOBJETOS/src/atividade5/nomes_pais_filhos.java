package atividade5;

public class nomes_pais_filhos {

	private String nomePais;
	private String nomeFilhos;
	
	
	
	public nomes_pais_filhos(String nomePais, String nomeFilhos) {
		this.nomePais = nomePais;
		this.nomeFilhos = nomeFilhos;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public String getNomeFilhos() {
		return nomeFilhos;
	}
	public void setNomeFilhos(String nomeFilhos) {
		this.nomeFilhos = nomeFilhos;
	}
	@Override
	public String toString() {
		return "nomes_pais_filhos: nomePais=" + nomePais + ", nomeFilhos=" + nomeFilhos;
	}
	
	
}
