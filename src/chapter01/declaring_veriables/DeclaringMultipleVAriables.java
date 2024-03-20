package chapter01.declaring_veriables;

public class DeclaringMultipleVAriables {

	public static void main(String[] args) {
		String s1,s2; // Legal istedimiz kadar string ifadeyi yan yana vererek tek bir satirda tanimlayabiliriz.
		String s3="yes", s4="no"; // Legal istedigimiz kadar string ifadeyi yan yana tanimlayabilir ve burada istedigimiz bir degiskene deger atamasi yapabiliriz.
		String s5,s6="s6",s7; //Legal
		int i1,i2,i3=0; //Legal 
		
		
//		int num, String value; Does Not Compiler. arasinde " ; " olmalidir.
		
//		int num;
//		String value;
        int num;String value; //Legal 	
        
        boolean b1,b2;
 //      double d1, double d2;  // ya 2. double kaldirilmali yada arasina ";" konulmali.
        double d1; double d2; 
 //       int i4; i5; // arasinda ki ";"  "," yaparsak legaldir. yada int i4; int i5; yapmaliyiz.
        
        
	}
}
