package formageometrica;

public class Teste {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		System.out.println(t1.totalArea() + " " + t1.getNome());
		Retangulo r1 = new Retangulo();
		System.out.println(r1.totalArea() + " " + r1.getNome());
		Quadrado q1 = new Quadrado();
		System.out.println(q1.totalArea() + " " + q1.getNome());
		FormaGeometrica.showTotalArea(t1);
		FormaGeometrica.showTotalArea(r1);
		FormaGeometrica.showTotalArea(q1);
	}

}
