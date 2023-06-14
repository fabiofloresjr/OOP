package formageometrica;

public abstract class FormaGeometrica {

	protected String nome;
	protected float area;
	
	public abstract float totalArea();

	public FormaGeometrica() {
	}
	public String getNome() {
		return nome;
	}
	public static void showTotalArea(FormaGeometrica forma){

         System.out.println("Total Area: " + forma.totalArea());
    }
	
	
}