package chapter07.understanding_polymorphism.example07;

public class Kangaroo extends Marsupial {

	protected int age=6;

	public static boolean isBiped() {
		return true;
	}

	public static void main(String[] args) {
		Kangaroo joey=new Kangaroo();
		Marsupial moey=joey;
		System.out.println(Kangaroo.isBiped()); //true
		System.out.println(Marsupial.isBiped()); //false
		System.out.println(joey.age); //6
		System.out.println(moey.age); //2
	}
}
