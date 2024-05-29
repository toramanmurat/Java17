 package chapter09.working_with_generics.example17;

import java.util.ArrayList;
import java.util.List;

public class CreatingUpperBounded {

	public static void main(String[] args) {
//		ArrayList<Number> list = new ArrayList<Integer>(); //Does Not Compile
		List<? extends Number> list = new ArrayList<Integer>();
	}
}
