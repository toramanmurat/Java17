package chapter02.assingining_values;

public class AppliyingCasting2 {

	public static void main(String[] args) {
		short mouse = 10;
		short hamster = 3;

//		short capybara = mouse * hamster; // DOES NOT COMPILE
//		short capybara = (short)mouse * hamster; //Does Not Compile
//		short capybara = 1 + (short)(mouse * hamster);// Does Not Compile
		short capybara = (short)(mouse * hamster);
		short capybara2=(short) (mouse * hamster);
		System.out.println(capybara);
		System.out.println(capybara2);

		byte b1=10;
		byte b2=2;
		byte b3=(byte) (b1+b2);
		System.out.println(b3);




	}
}
