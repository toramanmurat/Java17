package chapter08.working_with_built_in_functional_interfaces.example02;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TestImplementingSupplier {

	public static void main(String[] args) {
		Supplier<StringBuilder> s1 = StringBuilder::new;
		Supplier<StringBuilder> s2 = () -> new StringBuilder();
		
		System.out.println(s1.get()); // Empty string
		System.out.println(s2.get()); // Empty string
		
		//example3
		
		Supplier<ArrayList<String>> s3 = ArrayList::new;
		ArrayList<String> a1 = s3.get();
		System.out.println(a1); // []
		System.out.println(s3);

	}
}
