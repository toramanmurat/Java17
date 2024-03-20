package chapter04.understanding_equality;

public class UnderstandingEqualityStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello World!");
		StringBuilder sb2=new StringBuilder("Hello World!");
		
		// == ve equals StringBuilder icin ayni calicak. Aynı objeyimi gosteriyorlar.
		// 2 yeni obje olustugu icin iki ifadede false donecektir.
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false
		
		System.out.println(sb1.toString()==sb2.toString()); //false
		System.out.println(sb1.toString().equals(sb2)); //false
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		
		System.out.println("#Example2");
		String sb3="Hello World!";
		String sb4="Hello World!";
		
		System.out.println(sb3==sb4); //true 
		System.out.println(sb3.equals(sb4)); //true
		
		
		
	
	}
}
