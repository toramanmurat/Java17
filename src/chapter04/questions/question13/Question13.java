package chapter04.questions.question13;

public class Question13 {

	public void roar(String roar1,StringBuilder roar2) {
		roar1.concat("!!!"); // String immutuballe ozellikte oldugundan degismeyecektir.
		roar2.append("!!!");
	}

	public static void main(String[] args) {
		var roar1="roar";
		var roar2=new StringBuilder("roar");
		new Question13().roar(roar1, roar2);
		System.out.println(roar1+" "+roar2);


		System.out.println(roar1.concat("--"));
	}

}
