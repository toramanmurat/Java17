package chapter03.questions.question13;

public class Question13 {

	public static void main(String[] args) {
		 boolean keepGoing = true;
		int result = 15, meters = 10;
	 do {
		 meters--;
		 System.out.println(meters+"--");
		 if(meters==8) {
			keepGoing = false;
		}
		 result -=2;
		} while (keepGoing);
		 System.out.println(result);
	}

}
