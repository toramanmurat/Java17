package chapter06.questions.question01;

public class BirdSeed {

	private int numberBags;
	boolean call;
	
	public BirdSeed() {
//		BirdSeed(2); // Does Not Compile
//		new BirdSeed(2); // Compile. ancak 0 yazdirir.
		this(2); //2
		call=false;
//		BirdSeed(2); //Does Not Compile 
//		new BirdSeed(2);  // Compile. ancak 0 yazdirir.
//		this(2); this ve super en ustte olmasi gerekir.
		
	}

	public BirdSeed(int numberBags) {
		this.numberBags=numberBags;
	}
	
	public static void main(String[] args) {
		var seed=new BirdSeed();
		System.out.println(seed.numberBags);
	}
}
