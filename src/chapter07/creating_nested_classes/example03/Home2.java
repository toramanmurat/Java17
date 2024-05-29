package chapter07.creating_nested_classes.example03;

public class Home2 {

	private String greeting = "Hi"; // Outer class instance variable

	protected class Room2 { // Inner class declaration
		public int repeat = 3;

		public void enter() {
			for (int i = 0; i < repeat; i++) {
				greet(greeting);
			}
		}

		private static void greet(String message) {
			System.out.println(message);
		}

	}

	public void enterRoom2() { // Instance method in outer class
		var room2 = new Room2(); // Create the inner class instance
		room2.enter();
	}

	public static void main(String[] args) {

		var home2 = new Home2(); // Create the outer class instance
		home2.enterRoom2();

		Room2 room2=home2.new Room2(); // Create the inner class instance
		room2.enter();

		new Home2().new Room2().enter();// Sorry, it looks ugly to us too!
	}

}

// Inner class --> public, protected,package,private alabilirler
// Bir sinifi kalitabilir yada implement edebilir.
// absract veya final olabilir.
//