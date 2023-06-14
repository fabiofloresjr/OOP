package placas;

public class Placa {

	protected String modelo; //LC32 GPON e LC32 XGPON
	protected int nroPortas;
	protected int nroSerie;
	protected String tipoPorta; //GPON, XGPON
	
	public Placa(String modelo, int nroPortas, int nroSerie, String tipoPorta) {
		this.nroPortas = nroPortas;
		this.nroSerie = nroSerie;
	}

	@Override
	public String toString() {
		return "Placa [modelo=" + modelo + ", nroPortas=" + nroPortas + ", nroSerie=" + nroSerie + ", tipoPorta="
				+ tipoPorta + "]";
	}
	
	
	
}
