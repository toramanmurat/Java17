package chapter06.questions.question05;

public class Cheetah extends Speedster {

	int numSpots;

	public Cheetah(int numSpots) {
		// INSERT CODE HERE
//		numSpots = numSpots; //0
//		numSpots = this.numSpots; //0
//		this.numSpots = numSpots; //0
//		numSpots = super.numSpots; //0
		super.numSpots = numSpots; //50
		
		
	}

	public static void main(String[] args) {
		Speedster s = new Cheetah(50);
		System.out.print(s.numSpots);
	}

}
