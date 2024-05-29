package chapter04.questions.question08;

public class Question08 {

	public static void main(String[] args) {
		var string = "12345";
		var builder = new StringBuilder("12345");
		System.out.println("#A :"+builder.charAt(4)); //5
//		System.out.println(builder.replace(2,4,"6")); //1265
		System.out.println("#B :"+builder.replace(2,4,"6").charAt(3)); //5
//		System.out.println(builder.replace(2, 5, "6"));//126
		System.out.println("#C :"+builder.replace(2, 5, "6").charAt(2));
//		System.out.println("#D :"+string.charAt(5)); java.lang.StringIndexOutOfBoundsException Does Not Compile
//		System.out.println("#E :"+string.length ); Does Not Compile
		System.out.println("#Example E:" +string.length());
		System.out.println("#F :"+string.replace("123", "1").charAt(2)); //5


		var string2="1234567891";
		var builder2=new StringBuilder("1234567891");
		System.out.println("#Example String :"+string2.replace('2','0')); //1034567891
		System.out.println("#Example StringBuilder :"+builder2.replace(2, 8, "0")); //12091

	}
}
//replace ilk index dahil degil son index dahil aradakileri degistir.(StringBuilder)
//String icin replace(char ,char);