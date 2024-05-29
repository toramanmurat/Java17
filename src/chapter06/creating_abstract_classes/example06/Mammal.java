package chapter06.creating_abstract_classes.example06;

public abstract class Mammal {

	abstract CharSequence chew();

	public Mammal() {
		System.out.println(chew());
	}

}
