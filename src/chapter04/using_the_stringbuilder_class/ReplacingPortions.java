package chapter04.using_the_stringbuilder_class;

public class ReplacingPortions {

	public static void main(String[] args) {

		replacev1();
		replacev2();
	}

	private static void replacev1() {
		var builder = new StringBuilder("pigeon dirty"); 
		builder.replace(3, 6, "sty");//baslangic index 3 (dahil), bitis index 6(dahil degil), degistirelecek string ifade
		System.out.println(builder); //pigsty dirty
	}
	
	private static void replacev2() {
		var builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 100, "");
		System.out.println(builder); //pig
	}
	
	
}

// public StringBuilder replace(int startIndex, int endIndex, String newString)
