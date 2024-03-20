package chapter06.declaring_constructors;

public class Hamster2 {
	
	private String color;
	private int weight;
	
	public Hamster2(int weight,String color) { //First Constructor
		this.weight=weight;
		this.color=color;
	}
	
	public Hamster2(int weight) { //second Constructor
//		Hamster2(weight,"brown");  Does Not Compile
	}

}
