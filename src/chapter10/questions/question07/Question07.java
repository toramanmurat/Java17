package chapter10.questions.question07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question07 {

	public static void main(String[] args) {

	}

	private static List<String> sort(List<String> list) {
		var copy = new ArrayList<String>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}

//	private static List<String> metodA(List<String> list) {
//		return list.stream().compare((a, b) -> b.compareTo(a)).collect(Collectors.toList());
//	}

//  private static List<String> methodB(List<String> list) {
//  return list.stream()
//          .compare((a, b) -> b.compareTo(a)).sort(); // There is no compare method!
//}

//private static List<String> methodC(List<String> list) {
//  return list.stream()
//          .compareTo((a, b) -> b.compareTo(a)) // There is no compareTo method!
//          .collect(Collectors.toList());
//}

//private static List<String> methodD(List<String> list) {
//  return list.stream()
//          .compareTo((a, b) -> b.compareTo(a)) .sort(); // There is no compareTo method!
//}

//private static List<String> methodE(List<String> list) {
//  return list.stream()
//          .sorted((a, b) -> b.compareTo(a))
//          .collect(); // DOES NOT COMPILE
//}

	private static List<String> methodF(List<String> list) {
		return list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
	}
}
