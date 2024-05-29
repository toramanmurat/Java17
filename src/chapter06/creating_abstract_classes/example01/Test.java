package chapter06.creating_abstract_classes.example01;

public class Test {

	public static void main(String[] args) {
		Canine w = new Fox();
		w.bark(); //Squeak!!

		w=new Wolf();
		w.bark(); //Woooooff!
	}
}
