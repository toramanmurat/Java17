package chapter07.working_with_enums.example02;

import chapter07.working_with_enums.example01.Season;

public class EnumValueOfMetod {
	
	public static void main(String[] args) {
		Season s=Season.valueOf("SUMMER");
		System.out.println(s+" "+s.ordinal());
		
//		Season s1=Season.valueOf("summur"); //java.lang.IllegalArgumentException
	}

}
