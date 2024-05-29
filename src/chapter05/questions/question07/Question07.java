package chapter05.questions.question07;

public class Question07 {

	public static void main(String[] args) {
		Question07 question=new Question07();
		question.method();

	}

	void method() {

//		jugglee();  Does Not Compile.
		System.out.println(jugglee(true)); //0
		System.out.println(jugglee(true, true)); //1
		System.out.println(jugglee(true, true, true)); //2
//		jugglee(true, {true, true});  Does Not Compile
		System.out.println(jugglee(true, new boolean[2])); //2


	}

	public int jugglee(boolean b, boolean... b2) {
		 return b2.length;
	}
}
