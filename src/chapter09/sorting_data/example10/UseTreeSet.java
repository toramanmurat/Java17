package chapter09.sorting_data.example10;

import java.util.Set;
import java.util.TreeSet;

import chapter09.sorting_data.example01.Duck;

public class UseTreeSet {

	static class Rabbit{int id;}
	public static void main(String[] args) {
		Set<Duck> ducks=new TreeSet<>();
		ducks.add(new Duck("Puddles"));
		
		Set<Rabbit> rabbits = new TreeSet<>();
		rabbits.add(new Rabbit()); // java.lang.ClassCastException
	}
}
