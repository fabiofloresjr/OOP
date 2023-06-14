package formageometrica;

public class Triangulo extends FormaGeometrica {

	public Triangulo() {
		nome = "Triangulo";
		area = 1;
	}

	@Override
	public float totalArea() {
		return 1;
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	

}
