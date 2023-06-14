package atividade5;

public class data_de_nascimento {

	private int dia;
	private int mes;
	private int ano;
	
	public data_de_nascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "data_de_nascimento: dia=" + dia + ", mes=" + mes + ", ano=" + ano;
	}
	
	
	
	
}
