package chapter01.questions.question22;

public class Price {

	public void admission() {
//		int Amount = 0b11; Does Not Compile
//		int amount = 9L; Does Not Compile.
//		int amount = 0xE; Compile
//		int amount = 1_2.0; Does Not Compile. int'e cast etmemiz lazim
//		double amount = 1_0_.0; Does Not Compile. _ kullanimi yanlis
//		int amount = 0b101; Compile
		double amount = 9_2.1_2;  //Compile
//		double amount = 1_2_.0_0; _ kullanimi


		System.out.print(amount);
		}

	public static void main(String[] args) {

	}
}
