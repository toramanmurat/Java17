package chapter09.sorting_data.example07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Duck implements Comparable<Duck>{
	
	private String name;
	private int weight;
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Duck o) {
		
		return name.compareTo(o.name);
	}
	
	public static void main(String[] args) {
		
		var byWeight=new Comparator<Duck>() {

//			@Override
//			public int compareTo(Duck o1, Duck o2) { //compareTo Does Not Compile
//				
//				return o1.getWeight()-o2.getWeight();
//			}
			@Override
			public int compare(Duck o1, Duck o2) {
				
				return o1.getWeight()-o2.getWeight();
			}
//			
		};
		var ducks = new ArrayList<Duck>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]

	}
	
	
	
	

}
