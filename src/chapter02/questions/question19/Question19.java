package chapter02.questions.question19;

public class Question19 {

	public static void main(String[] args) {
		int start=7;
		int end=4;
		end +=++start;
		start=(byte) (Byte.MAX_VALUE+1);

		System.out.println(end);
		System.out.println(start);

	}
}
