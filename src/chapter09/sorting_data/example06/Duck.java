package chapter09.sorting_data.example06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck implements Comparable<Duck> {

	private String name;
	private int weight;

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

	public Duck() {
		super();
	}

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Duck o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
//		Comparator<Duck> byWeight = new Comparator<Duck>() {
//
//			@Override
//			public int compare(Duck o1, Duck o2) {
//				// TODO Auto-generated method stub
//				return o1.getWeight() - o2.getWeight();
//			}
//		};

//		Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();
		
		Comparator<Duck> byWeight=Comparator.comparing(Duck::getWeight);
		
		var ducks = new ArrayList<Duck>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]

	}

}
