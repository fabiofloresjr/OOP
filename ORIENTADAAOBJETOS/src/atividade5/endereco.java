package atividade5;

public class endereco {

	private String rua;
	private int numero;
	
	public endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "endereco: rua=" + rua + ", numero=" + numero;
	}
	
	
}
