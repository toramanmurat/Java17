package chapter09.using_the_set_interface.example02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		 Set<Integer> set = new TreeSet<>();
		 boolean b1 = set.add(66); // true
		 boolean b2 = set.add(10); // true
		 boolean b3 = set.add(66); // false
		 boolean b4 = set.add(8); // true
		 set.forEach(System.out::println); // 8 10 66
	}
}
