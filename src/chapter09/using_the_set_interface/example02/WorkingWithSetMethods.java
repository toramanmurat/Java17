package chapter09.using_the_set_interface.example02;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSetMethods {

	public static void main(String[] args) {
//		Set<Character> letters = Set.of('z', 'o', 'o'); //java.lang.IllegalArgumentException: duplicate element: o
		Set<Character> letters = Set.of('z', 'o', 'x');
		Set<Character> copy=Set.copyOf(letters);
		Set<Integer> set=new HashSet<>();
		boolean b1=set.add(66); //true
		boolean b2=set.add(10); //true
		boolean b3=set.add(66);  //false
		boolean b4=set.add(8); //true
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		set.forEach(System.out::println); //66 8 10
		
		
	}
}

//LinkedHashSet elemanlar ekledigimiz sirayla tutulacaktir.