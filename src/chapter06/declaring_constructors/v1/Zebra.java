package chapter06.declaring_constructors.v1;

public class Zebra extends Animal{

	public Zebra(int age) {
		super(age); //refer to constructor in Animal

	}

	public Zebra() {
		this(4); //refer to constructor in Zebra with int argument
	}



}
