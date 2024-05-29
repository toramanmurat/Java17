package chapter04.questions.question01;

public class Fish {

	public static void main(String[] args) {
		int numFish=4;
		String fishType="tuna";
//		String anotherFish=numFish+1; //Does Not Compile
		String anotherFish=fishType+1;
		System.out.println(anotherFish+""+fishType);
		System.out.println(numFish+""+1);

	}
}
