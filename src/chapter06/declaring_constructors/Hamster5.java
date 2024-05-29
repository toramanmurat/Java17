package chapter06.declaring_constructors;

public class Hamster5 {

	private String color;
	private int weight;

	public Hamster5(int weight,String color) { //First Constructor
		this.weight=weight;
		this.color=color;
	}

	public Hamster5(int weight) { //second Constructor
//		this(weight,"brown");  Compile
		System.out.println("chew");

//		this(weight,"brown"); Does Not Compile. This anahtar kelimesi varsa ilk ifade olmaz zorunda
	}

}
