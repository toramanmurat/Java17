package chapter03.questions.question01;

public class Quesiton01 {

	public static void method1() {

		Season season=Season.WINTER;
		// switch ifadelerde Enum kullanilabilir.
		switch(season) {
		case WINTER -> System.out.println("Winter");
		case SUMMER -> System.out.println("Summer");

		}

		// int kullanilabilir ve Integer kullanilabilir.
		int i=2;
		switch (i) {
		case 1: System.out.println("one");
		case 2: System.out.println("two");
		}

		// Byte ve byte kullanilabilir.
		byte b=5;
		switch(b) {
		case 1 : System.out.println("one");
		case 5 : System.out.println("five");
		}

		// long ve Long kullanilamaz.
		long l=7;
//		switch(l) {}


		// String kullanabiliriz.
		String s="a";
		switch(s) {
		case "a":
			{
				System.out.println("a");
				break;
			}
		case "b":System.out.println("b ");
		case "c": System.out.println("c");
		default :
		}

		// char kullanilabilir.
		char c=10;
		switch(c) {
		case 10: System.out.println(10);
		}

		//var anahtar kelimesi kullanilabilir.
		var v=100;
		switch(v) {
		case 100: System.out.println(100);

		//long ve Long kullanamayiz.
//		double d=10.0;
//		switch(d) {
//
//		}

		var a=1;

		switch(a) {
		case 0 :System.out.println("basarisizi");
		case 1 : System.out.println("Baraşdsfa");

		}


		}






	}

	public static void main(String[] args) {
		method1();
	}

}


enum Season {
    WINTER, SPRING, SUMMER, FALL
}
