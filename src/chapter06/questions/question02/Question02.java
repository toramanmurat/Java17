package chapter06.questions.question02;

public class Question02 {

	public static final void methodV01() {
		System.out.println("#Static final metod");
	}

	private static int methodV02() {
		return 1;
	}

//	public static abstract methodV03() {}  // Does Not Compile. static ve abstract ayni anda kullanilamaz

//	private abstract void methodV04() {}  //Does Not Compile. private ve abstract ayni anda kullanilamaz.

//	abstract final void methodV05() {} ////Does Not Compile. abstract ve final ayni anda kullanilamaz.

	private final void methodV06() {

		System.out.println("#Private final metod");
	}

	public static void main(String[] args) {
		Question02 q2=new Question02();
		methodV01();
		System.out.println(methodV02());
		q2.methodV06();

	}
}
