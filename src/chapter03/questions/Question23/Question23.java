package chapter03.questions.Question23;

public class Question23 {
	
	public static void main(String[] args) {
		int penguin = 50, turtle = 75;
		boolean older = penguin >= turtle;
		System.out.println(older); // older false
		if (older = true) System.out.println("Success"); // older=true -> older degiskenine true atanmis !!! 
//		else System.out.println("Failure");
		else if(penguin != 50) System.out.println("Other");
		else System.out.println("Failure");
	}

}
