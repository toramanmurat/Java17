package chapter08.writing_simple_lambdas.example01;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		// list of animals
		var animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		print(animals, new CheckIfHopper());
		print(animals, a->a.canHop());
		print(animals, a->a.canSwim());
		print(animals, a->!a.canSwim());
		
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {

			// General check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}
