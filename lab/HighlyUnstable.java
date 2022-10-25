package lab;

public class HighlyUnstable {
	
	public static void goBoom() throws Exception {
		throw new Exception();
	}
	
	public static void probabilityHex(boolean shouldBlowUp) throws Exception{
		if(shouldBlowUp) {
			throw new ChaosMagicBomb();
		}
		System.out.println("bomb was a dud");
		throw new Exception();
	}

}
