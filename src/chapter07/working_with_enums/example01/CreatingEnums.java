package chapter07.working_with_enums.example01;

public class CreatingEnums {

	public static void main(String[] args) {
		var s=Season.SUMMER;
		
		System.out.println(Season.SPRING);
		System.out.println(s==Season.SUMMER); // == kontrolu yapabiliriz.
		System.out.println(s.equals(Season.WINTER)); // .equals kontrolu yapabiliriz.
	}
}
