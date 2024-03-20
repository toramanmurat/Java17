package chapter04.creating_and_manipulating_strings;

public class FormattingValues {

	public static void main(String[] args) {
		var name = "Kate";
		var orderId = 5;
		System.out.println("Hello " + name + ", order " + orderId + " is ready");
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		
		System.out.println("#Example2");
		var name2 = "James";
		var score = 90.25;
		var total = 100;
		System.out.println("%s:%n Score: %f out of %d"
		.formatted(name2, score, total));
	}
}

// %s String values, %d long values, %f float and double values, %n yeni bir satir.