package chapter02.questions.question02;

public class Question02 {

	public static void main(String[] args) {
		byte apples=5;
		short oranges=32767;
		int babanas1=apples+oranges;
		long babanas2=apples+oranges;
//		boolean babanas3=apples+oranges; Does Not Compile
		double babanas4=apples+oranges;
//		short bananas5=apples+oranges; // Does Not Compile
		short babanas5=(short) (apples+oranges);
//		byte babanas6=apples+oranges; Does Not Compile

		System.out.println(babanas1+" "+babanas2+" "+babanas4 );
		System.out.println(Short.MAX_VALUE);
		System.out.println(babanas5);

//		apples+orange ifadesi automatically olarak int tipine donusturur.
//		int bir degiskeni int,long ve double atayabiliriz.
//		int bir degiskeni boolean tipine atayamayiz.
//		int bir degiskeni short ve byte atayamayiz. babanas5 te oldugu gibi cast yaparak atayabiliriz.

	}
}
