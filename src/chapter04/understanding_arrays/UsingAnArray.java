package chapter04.understanding_arrays;

public class UsingAnArray {

	public static void main(String[] args) {
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]);

//		System.out.println(mammals.length()); Does Not Compile

		var birds = new String[6];
		System.out.println(birds.length); // Array'in size doner.
	}
}
