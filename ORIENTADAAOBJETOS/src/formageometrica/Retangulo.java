package formageometrica;

public class Retangulo extends FormaGeometrica{
	
	public Retangulo() {
		nome = "Retangulo";
		area = 2;
	}
	

	@Override
	public float totalArea() {
		return 2;
	}

	@Override
	public String getNome() {
		return nome;
	}

}
