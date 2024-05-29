package chapter06.creating_classes;

public class Beetle extends Insect {

	protected int numberOfLegs=6;
	short age=3;

	public void printData() {
		System.out.println(this.label); //buggy
		System.out.println(super.label); //buggy
		System.out.println(this.age); //3
//		System.out.println(super.age); Does Not Compile
		System.out.println(numberOfLegs); //6
		System.out.println(super.numberOfLegs); //4

		// this anahtar kelimesi mevcutta var ise onu kullanir yoksa super classına bakar.
		// super sadece super class'ina bakacaktir. Yoksa hata verecektir.(12. satirda oldugu gibi)
	}

	public static void main(String[] n) {
		new Beetle().printData();
	}
}
