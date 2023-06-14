package placas;

public class Main {

	public static void main(String[] args) {

		GponLC32 gpon = new GponLC32(4, 12345);
		XgponLC32 xgpon = new XgponLC32(3, 1234);
		
		System.out.println(gpon);
		System.out.println(xgpon);
	}

}