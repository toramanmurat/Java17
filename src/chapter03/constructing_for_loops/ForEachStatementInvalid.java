package chapter03.constructing_for_loops;

import java.util.List;

public class ForEachStatementInvalid {

	public static void main(String[] args) {
		String[] names = new String[] { "Jack", "Joe", "Leo" };
		printName(names);
		System.out.println("For Each ----");
		printNameForEach(names);

		System.out.println("For Each List ---");
		printNameForEach(List.of(names));

	}

	public static void printName(String[] names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void printNameForEach(String[] names) {
		for (var name : names) {
			System.out.println(name);
		}
	}

	public static void printNameForEach(List<String> names) {
		for (var name : names) {
			System.out.println(name);
		}
	}

}
