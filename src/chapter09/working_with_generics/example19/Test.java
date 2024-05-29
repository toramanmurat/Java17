package chapter09.working_with_generics.example19;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<HangGlider> hangGliders = new ArrayList<>();
		List<Goose> gooses = new ArrayList<>();
		
//		anyFlyer(hangGliders); //Does Not Compile
//		anyFlyer(gooses); //Does Not Compile
		
		groupOfFlyers(hangGliders);
		groupOfFlyers(gooses);
		
	}

	private static void anyFlyer(List<Flyer> flyer) {
	}

	private static void groupOfFlyers(List<? extends Flyer> flyer) {
	}
}
