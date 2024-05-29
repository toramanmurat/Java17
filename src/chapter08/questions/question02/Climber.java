package chapter08.questions.question02;

public class Climber {

	public static void main(String[] args) {
//		check((h,m)->h.append(m).isEmpty(),5); Does Not Compile
	}

	private static void check(Climb climb,int height) {
		if(climb.isTooHigh(height, 10)) {
			System.out.println("too high");
		} else {
			System.out.println("ok");
		}
	}
}
