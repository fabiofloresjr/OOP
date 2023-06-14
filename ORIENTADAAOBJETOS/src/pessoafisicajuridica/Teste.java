package pessoafisicajuridica;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica pf1 = new PessoaFisica("Fabio", "Porto Alegre", 12345678, "022.169.230-40", "410987130958");
		PessoaJuridica pj1 = new PessoaJuridica("Junior", "Porto Alegre", 12345678, "3214510-3958710", "2194153");
		System.out.println(pf1);
		System.out.println(pj1);
	}

}
 