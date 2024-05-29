package chapter06.questions.question04;

public class Platypus extends Mammal {

	int sneeze() {
		return 1;
	}

	public Platypus() {

		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5); // default constructor olmadıgı icin hata verecektir.Mammal class'ina default
						// constructor eklersek cikti Mammal olacaktir.
//		new Platypus();  Test!! . Mammal#Default Constructor Platypus

	}

}

///Sorunun cevanı F sikki dir.
