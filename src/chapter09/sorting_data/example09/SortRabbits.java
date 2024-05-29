package chapter09.sorting_data.example09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {

	static record Rabbit(int id) {}
	
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(3));
		rabbits.add(new Rabbit(1));
//		Collections.sort(rabbits); // DOES NOT COMPILE
		
		Comparator<Rabbit> c=(r1,r2)->r1.id-r2.id;
		Collections.sort(rabbits,c);
		System.out.println(rabbits); //[Rabbit[id=1], Rabbit[id=3]]
	}
}
