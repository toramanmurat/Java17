package chapter06.declaring_constructors;

public class Hamster3 {

	private String color;
	private int weight;

	public Hamster3(int weight,String color) { //First Constructor
		this.weight=weight;
		this.color=color;
	}

	public Hamster3(int weight) { //second Constructor
		new Hamster3(weight,"brown");  // Compile olur. ancak yeni bir extra obje olusur.

	}

}
