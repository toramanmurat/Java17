package chapter07.questions.question07;

public class ClownFish implements Aquatic{


	@Override
	public int getNumOfGills(int p) {

		return 14;
	}

//	int getNumOfGills(int input) { return 15; }


	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumOfGills(-1));
	}

}
