package chapter03.questions.question11;

public class Zoo {

	enum Animal {
		BIRD, FISH, MAMMAL
	}

	static void printLocation(Animal a) {
		long type = switch (a) {
		case BIRD -> 1;
		case FISH -> 2;
		case MAMMAL -> 3;
		default -> 4;
		};
		System.out.println(type);
	}

	public static void main(String[] args) {
		printLocation(Animal.MAMMAL);
	}

}
