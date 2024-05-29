package chapter09.sorting_data.example03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LegacyDuck implements Comparable{
	private String name;

	@Override
	public int compareTo(Object o) {
		LegacyDuck d=(LegacyDuck) o;  // cast because no generics
		return name.compareTo(d.name);
	}
	
	public static void main(String[] args) {
		
		var legacyDucks=new ArrayList<String>();
		legacyDucks.add("Quack");
		legacyDucks.add("Puddles");
		legacyDucks.add("Dummy");
		
		Collections.sort(legacyDucks);
		System.out.println(legacyDucks); //[Dummy, Puddles, Quack]
	}
	
	

}
