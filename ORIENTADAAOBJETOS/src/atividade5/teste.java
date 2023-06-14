package atividade5;

public class teste {

	public static void main(String[] args) {

		funcionario f1 = new funcionario(new endereco("Assis Brasil", 8450),
										new dados_bancarios(115, "Santander"),
										new nomes_pais_filhos("Roger", "Pedrinho"),
										10000, "Professor", "Cláudio",
										new data_de_nascimento(22, 3, 2000)
										);
		System.out.println(f1);
	}

}
