package bancodedados;

public class Teste {

	public static void main(String[] args) {
		BancoDadosMySql sql = new BancoDadosMySql();
		BancoDadosOracle oracle = new BancoDadosOracle();

		sql.salvarUsuario("BANCO 1");
		oracle.salvarUsuario("BANCO 2");
		sql.listarUsuario();
		oracle.listarUsuario();
	}

}
