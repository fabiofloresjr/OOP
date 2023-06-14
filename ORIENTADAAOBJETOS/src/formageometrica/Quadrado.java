package formageometrica;

public class Quadrado extends FormaGeometrica {

	public Quadrado() {
		nome = "Quadrado";
		area = 3;
	}

	@Override
	public float totalArea() {
		return 3;
	}

	@Override
	public String getNome() {
		return nome;
	}
	

}
