package placas;

public class XgponLC32 extends Placa {

	private String modoDeOperacao; //gpon e xgpon

	public XgponLC32(int nroPortas, int nroSerie) {
		super("LC32 XGPON", nroPortas, nroSerie, "XGPON");
	}

	@Override
	public String toString() {
		return "XgponLC32 [modoDeOperacao=" + modoDeOperacao + ", modelo=" + modelo + ", nroPortas=" + nroPortas
				+ ", nroSerie=" + nroSerie + ", tipoPorta=" + tipoPorta + "]";
	}
	
	
}
