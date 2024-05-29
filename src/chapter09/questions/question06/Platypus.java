package chapter09.questions.question06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public record Platypus(String name, int beakLength) {
	@Override
	public String toString() {
		return "" + beakLength;
	}

	public static void main(String[] args) {
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p2 = new Platypus("Peter", 5);
		Platypus p3 = new Platypus("Peter", 7);
		
		List<Platypus> list=Arrays.asList(p1,p2,p3);
//		Collections.sort(list,Comparator.comparing(Platypus::beakLength)); //[3, 5, 7]
//		Collections.sort(list,Comparator.comparing(Platypus::beakLength).reversed()); //[7, 5, 3]
//		Collections.sort(list,Comparator.comparing(Platypus::name).thenComparing(Platypus::beakLength));[3, 5, 7]
//		Collections.sort(list,Comparator.comparing(Platypus::name).thenComparing(Comparator.comparing(Platypus::beakLength).reversed()));//[3, 7, 5]
//		Collections.sort(list,Comparator.comparing(Platypus::name).thenComparingNumber(Platypus::beakLength).reversed()); //Does Not Compile
		Collections.sort(list,Comparator.comparing(Platypus::name).thenComparingInt(Platypus::beakLength).reversed()); //[7, 5, 3]


		System.out.println(list);
	}

}
