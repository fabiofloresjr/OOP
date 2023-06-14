package bancodedados;

public class BancoDadosMySql implements Usuario {

	private String Usuario;
	@Override
	public void salvarUsuario(String nome) {
		Usuario = nome + " MySql";
	}

	@Override
	public void listarUsuario() {
		System.out.println(Usuario);
	}

}
