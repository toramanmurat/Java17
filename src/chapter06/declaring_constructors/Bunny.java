package chapter06.declaring_constructors;

public class Bunny {
	
	//Default Constructor
	public Bunny() {
		System.out.println("Hop Consturctor.");
	}
	
//	public bunny() {}  //Does Not Compile. Constructor degil
	
	// Constructor degildir. Donus tipi oldugu icin bir metodtur
	// Hata vermez
	public void Bunny() {
		System.out.println("#Bunny Metod");
	} 
	
	public static void main(String[] args) {
		var bunny=new Bunny(); //Hop Consturctor. 
		bunny.Bunny(); //#Bunny Metod
	}

}
