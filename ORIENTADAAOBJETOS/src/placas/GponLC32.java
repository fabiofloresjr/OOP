package placas;

public class GponLC32 extends Placa {

	
	
	public GponLC32(int nroPortas, int nroSerie) {
		super("LC 32GPON", nroPortas, nroSerie, "GPON");
	}

	@Override
	public String toString() {
		return "GponLC32 [modelo=" + modelo + ", nroPortas=" + nroPortas + ", nroSerie=" + nroSerie + ", tipoPorta="
				+ tipoPorta + ", toString()=" + super.toString() + "]";
	}

	
}
