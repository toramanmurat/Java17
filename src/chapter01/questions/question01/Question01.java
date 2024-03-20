package chapter01.questions.question01;

public class Question01 {
	public static void main(String[] args) {
		// 1- Main metod public olmalidir. (A)
		// 2- Main metodun donus tipi void olmalidir. (B ve F)
		// 3- Main metod static olmalidir. (C)
		// 4- Main metod final olabilir. !!!
		
	}


	

}

//main metodu public olmalidir.!
//class A{
//	private static void main(String[] args) {
//		System.out.println("#A main metod");
//		
//	}
//}

//main metodun donus tipi void olmalidir.!
//class B{
//	public static final main(String[] args) {
//		System.out.println("#B main metod");}
//}

//main metod static olmalidir.!
//class C{
//	public  void main(String[] args) {
//		System.out.println("#C main metod");
//	}
//}

// Compile !!!
//class D{
//	public static final void main(String[] args) {
//		System.out.println("#D main metod");
//	}
//}

//Compile !!!
class E{
	public static void main(String[] args) {
		System.out.println("#E main metod");
	}
}

//main metod donus tipi void olmalidir.
//class F{
//	public static  main(String[] args) {}
//}
