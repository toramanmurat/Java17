package chapter09.working_with_generics.example04;

import chapter09.working_with_generics.example03.Elephant;

public class Test {

	public static void main(String[] args) {
		Elephant elephant=new Elephant();
		Integer numPounds=15_000;
		SizeLimitedCrate<Elephant, Integer> c1=new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);
		
	}
}
