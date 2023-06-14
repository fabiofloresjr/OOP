package bancodedados;

public class BancoDadosOracle implements Usuario{

	private String Usuario;
	@Override
	public void salvarUsuario(String nome) {
		Usuario = nome + " Oracle";
	}

	@Override
	public void listarUsuario() {
		System.out.println(Usuario);
	}

}
