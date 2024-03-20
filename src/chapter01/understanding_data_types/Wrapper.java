package chapter01.understanding_data_types;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int primitive=Integer.parseInt("123"); // String primitive 
		Integer wrapper= Integer.valueOf("123");// String Integer wrapper 
		
		Double apple=Double.valueOf("200.99");
		System.out.println(apple.byteValue()); //-56
		System.out.println(apple.intValue()); // 200
		System.out.println(apple.doubleValue()); //200.99
		
		int max=Integer.max(10,30);
		int min=Integer.min(25, 15);
		int sum=Integer.sum(12, 7);
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		
		long max2=Long.max(10, 25);
		long min2=Long.min(25, 15);
		long sum2=Long.sum(12, 7);
		
		System.out.println(max2);
		System.out.println(min2);
		System.out.println(sum2);
		
	
		
		
		
	}
	
	

}


// primitive type : boolean byte short int long float double char
// Wrapper class: Boolean Byte Short Integer Integer Long Float Double Character

// Byte Short Integer Long Float Double wrapper class'lar Number class'ini inherit eder
