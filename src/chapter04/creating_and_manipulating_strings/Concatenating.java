package chapter04.creating_and_manipulating_strings;

public class Concatenating {
	
	public static void main(String[] args) {
		
		System.out.println(1+2); //3
		System.out.println("a"+"b"); //ab
		System.out.println("a"+"b"+3); //ab3
		System.out.println(1+2+"c"); //3c soldan saga degerlendirilecektir.
		System.out.println("c"+1+2); //c12  soldan saga degerlendirilecektir.
		System.out.println("c"+null); //cnull
		
		System.out.println("\nExample1");
		int three=3;
		String four="4";
		System.out.println(1+2+three+four); //64 1+2+3=6 daha sonra string ifade geldiği icin concat islemi 64
		
		
		System.out.println("\nExample2");
		var s="1";
		s+="2";
		s+="3";
		System.out.println(s); //123
		
		System.out.println("\nExample3");
		var s1=1;
		s1+=2;
//		s1+="3"; //Does Not Compile
		System.out.println(s1+"3"); //33
		
		System.out.println("\nExample4");
		
		var s2="1";
		s2 +="2";
		s2 +=3;
		System.out.println(s2); //123
		
		
	
	
	}

}

// + operatoru;
// eger iki ifade de sayi ise toplama anlamina gelecektir. 2+1=3;
// eger iki ifadeden biri String ise concat edilecektir. "a"+ "b" = ab  1+"a"=1a

