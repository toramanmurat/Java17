package chapter07.implementing_interfaces.example15;

public interface ZooTrainTour {

	abstract int getTrainName();

	private static void ride() {
	}

	default void playHorn() {
		getTrainName();
		ride();
	}

//	public static void slowDown() { //Does Not Compile
//		playHorn();
//	}

	static void speedUp() {
		ride();
	}

}
