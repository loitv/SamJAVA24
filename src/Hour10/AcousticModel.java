package Hour10;

public class AcousticModel extends Model {
	
	String method = "Acoustic";
	public void connect() {
		System.out.println("Conecting to Internet using " + method);
	}
	public void disConnect() {
		System.out.println("Disconnect " + method + " Model");
	}
}
