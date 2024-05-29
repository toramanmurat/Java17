package chapter06.declaring_constructors;

public class Hamster4 {

	private String color;
	private int weight;

	public Hamster4(int weight,String color) { //First Constructor
		this.weight=weight;
		this.color=color;
	}

	public Hamster4(int weight) { //second Constructor
		this(weight,"brown"); //this anahtar kelimesiyle diger constructor cagrilir
	}

}
