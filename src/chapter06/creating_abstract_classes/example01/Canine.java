package chapter06.creating_abstract_classes.example01;

public abstract class Canine {
	
	public abstract String getSound();
	
	public void bark() {
		System.out.println(getSound());
	}

}
