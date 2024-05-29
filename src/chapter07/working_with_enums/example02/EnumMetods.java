package chapter07.working_with_enums.example02;

import chapter07.working_with_enums.example01.Season;

public class EnumMetods {

	public static void main(String[] args) {

		for(var season: Season.values()) {
			System.out.println(season.name()+" "+season.ordinal());
		}

//		if(Season.SUMMER==2) {}  //Season.SUMMER degeri 2 olsada böyle bir kontrol yapamayiz
	}

//	WINTER 0
//	SPRING 1
//	SUMMER 2
//	FALL 3
}


// season.name() ->
// season.ordinal()