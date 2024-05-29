package chapter09.working_with_generics.example13;

import chapter09.working_with_generics.example08.Robot;

public class TrickyCrate<T> {
	
	public <T> T tricky(T t) {
		return t;
	}

	public static String crateName() {
		TrickyCrate<Robot> crate=new TrickyCrate<>();
		return crate.tricky("bot");
		
	}
	
}
