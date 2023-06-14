package atividade5;

public class funcionario {

	private endereco endereco;
	private dados_bancarios dados_bancarios;
	private nomes_pais_filhos nomes_pais_filhos;
	private float salario;
	private String setor_de_trabalho;
	private String nome;
	private data_de_nascimento data_de_nascimento;
	
	
	
	public funcionario(atividade5.endereco endereco, atividade5.dados_bancarios dados_bancarios,
			atividade5.nomes_pais_filhos nomes_pais_filhos, float salario, String setor_de_trabalho, String nome,
			atividade5.data_de_nascimento data_de_nascimento) {
		this.endereco = endereco;
		this.dados_bancarios = dados_bancarios;
		this.nomes_pais_filhos = nomes_pais_filhos;
		this.salario = salario;
		this.setor_de_trabalho = setor_de_trabalho;
		this.nome = nome;
		this.data_de_nascimento = data_de_nascimento;
	}
	public endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}
	public dados_bancarios getDados_bancarios() {
		return dados_bancarios;
	}
	public void setDados_bancarios(dados_bancarios dados_bancarios) {
		this.dados_bancarios = dados_bancarios;
	}
	public nomes_pais_filhos getNomes_pais_filhos() {
		return nomes_pais_filhos;
	}
	public void setNomes_pais_filhos(nomes_pais_filhos nomes_pais_filhos) {
		this.nomes_pais_filhos = nomes_pais_filhos;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getSetor_de_trabalho() {
		return setor_de_trabalho;
	}
	public void setSetor_de_trabalho(String setor_de_trabalho) {
		this.setor_de_trabalho = setor_de_trabalho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public data_de_nascimento getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(data_de_nascimento data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	@Override
	public String toString() {
		return "funcionario: endereco=" + endereco + ", dados_bancarios=" + dados_bancarios + ", nomes_pais_filhos="
				+ nomes_pais_filhos + ", salario=" + salario + ", setor_de_trabalho=" + setor_de_trabalho + ", nome="
				+ nome + ", data_de_nascimento=" + data_de_nascimento;
	}
	
	}
