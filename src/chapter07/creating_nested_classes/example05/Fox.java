package chapter07.creating_nested_classes.example05;

public class Fox {

	private class Den {
	}

	public void goHome() {
		new Den();
	}

	public static void visitFriend() {
//		new Den(); // DOES NOT COMPILE
		new Fox().new Den();
	}
}
