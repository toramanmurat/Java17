package chapter04.creating_and_manipulating_strings;

public class GettingASubstring {
	
	public static void main(String[] args) {
		var name="animals";
		System.out.println(name.substring(3)); // mals 3. index dahil.
		System.out.println(name.substring(name.indexOf('m'))); //mals
		System.out.println(name.substring(3,4)); //m 3 dahil 4 dahil degil degil
		System.out.println(name.substring(3,7)); //mals
		System.out.println(name.substring(3,3)); //empty
		System.out.println(name.substring(1,5)); //nima
//		System.out.println(name.substring(3,2)); //excepitn java.lang.StringIndexOutOfBoundsException
//		System.out.println(name.substring(3,8)); //exception
		
	
	}

}
