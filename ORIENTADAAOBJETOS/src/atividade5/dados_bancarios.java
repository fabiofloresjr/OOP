package atividade5;

public class dados_bancarios {

	private int numero_conta;
	private String banco;
	public dados_bancarios(int numero_conta, String banco) {
		this.numero_conta = numero_conta;
		this.banco = banco;
	}
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	@Override
	public String toString() {
		return "dados_bancarios: numero_conta=" + numero_conta + ", banco=" + banco;
	}
	
	
}
