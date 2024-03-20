package chapter01.understanding_data_types;

public class LiteralUnderscoreCharacter {
	
	public static void main(String[] args) {
		int million1=1000000;
		int million2=1_000_000;
		
//		double notAtStart=_1000.00; Does Not Compile
//		double notAtEnd=1000.00_; Does Not Compile
//		double notByDecimal=1000_.00; Does Not Compile
		double annayingButLegal=1_00_0.0_0;
		double reallyUgly=1_______2;
		
		
		System.out.println(million1+" "+million2+" "+annayingButLegal+" "+reallyUgly);
		
				
		
		
	}
	

}
