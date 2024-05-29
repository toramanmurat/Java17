package chapter06.creating_abstract_classes.example06;

public class Platypus extends Mammal{

	@Override
	String chew() {
		return "yummy!";
	}

	public static void main(String[] args) {
		new Platypus();
	}

}
