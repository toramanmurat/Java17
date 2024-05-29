package chapter09.sorting_data.example01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Duck implements Comparable<Duck> {

	private String name;

	public Duck(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + "]"; // use readable output
	}

	@Override
	public int compareTo(Duck o) {

		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		var ducks=new ArrayList<Duck>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		
		Collections.sort(ducks); // sort by name
		System.out.println(ducks); //[Duck [name=Puddles], Duck [name=Quack]]
		
	}

}
