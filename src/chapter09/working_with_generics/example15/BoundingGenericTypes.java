package chapter09.working_with_generics.example15;

import java.util.ArrayList;
import java.util.List;

public class BoundingGenericTypes {

	public static void main(String[] args) {
		List<?> a = new ArrayList<String>();
		List<? extends Exception> a2 = new ArrayList<RuntimeException>();
		List<? super Exception> a3 = new ArrayList<Object>();
	}
}
