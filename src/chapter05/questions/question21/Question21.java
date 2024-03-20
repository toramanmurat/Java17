package chapter05.questions.question21;

public class Question21 {
	public void moo(int m, int... n) {}
//	public void moo(int a, int... b) {} Does Not Compile
//	public int moo(char ch) {}  Does Not Compile
	public void moooo(int... z) {} // Compile. Ancak overloads metod degil
	private void moo(int... x) {} // OK
	public void moooo(int y) {} // Compile. Ancak overloads metod degil
	
//	public void moo(int... c, int d) {} Does Not Compile. varargs sonda olmasi gerekir.
//	public void moo(int... i, int j...) {}  Does Not Compile. 2 tane varargs ifade olamaz.
	
	
	

}
