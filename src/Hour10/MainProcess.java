package Hour10;

public class MainProcess {

	public static void main(String[] args) {
		AcousticModel am = new AcousticModel();
		am.method = "Acoustic";
		am.speed = 3000;
		am.displaySpeed();
		am.disConnect();
	}
}
