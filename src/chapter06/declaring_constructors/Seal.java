package chapter06.declaring_constructors;

public class Seal extends Mammal {

//	public Seal() {
//		super();  Does Not Compile. Super class'inda (Mammal) default constructor olmadigi icin hata verir. Mammal class'ina default constructor eklersek sorun giderilecektir.
//	}

	public Seal() {
		super(6);
	}

}
