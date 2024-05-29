package chapter09.sorting_data.example08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SquirrelTest {

	public static void main(String[] args) {
		thenComparingInt();
		reversedMetod();
	}
	
	private static List<Squirrel> createSquirrels(){
		List<Squirrel> squirrels=new ArrayList<Squirrel>();
		squirrels.add(new Squirrel(5, "x squirrel"));
		squirrels.add(new Squirrel(1, "h squirrel"));
		squirrels.add(new Squirrel(6, "y squirrel"));
		squirrels.add(new Squirrel(4, "a squirrel"));
		squirrels.add(new Squirrel(2, "b squirrel"));
		
		return squirrels;
		
		
		
		
	}
	
	private static void thenComparingInt() {
		List<Squirrel> squirrels=createSquirrels();
		
		Comparator<Squirrel> c=Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);
		 Collections.sort(squirrels, c);
		squirrels.forEach(System.out::println);
//				Squirrel [weight=4, species=a squirrel]
//				Squirrel [weight=2, species=b squirrel]
//				Squirrel [weight=1, species=h squirrel]
//				Squirrel [weight=5, species=x squirrel]
//				Squirrel [weight=6, species=y squirrel]	 
	}
	
	private static void reversedMetod() {
		 List<Squirrel> squirrels = createSquirrels();
		 Comparator<Squirrel> c = Comparator
	                .comparing(Squirrel::getSpecies)
	                .reversed();
		 Collections.sort(squirrels, c);
		 System.out.println("#Reverse Metod");
		 squirrels.forEach(System.out::println);
//		 Squirrel [weight=6, species=y squirrel]
//		 Squirrel [weight=5, species=x squirrel]
//		 Squirrel [weight=1, species=h squirrel]
//	     Squirrel [weight=2, species=b squirrel]
//	     Squirrel [weight=4, species=a squirrel]
		 
		
	}
}
