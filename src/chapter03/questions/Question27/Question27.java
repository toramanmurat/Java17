package chapter03.questions.Question27;

public class Question27 {

	public static void main(String[] args) {
		byte amphibian = 1;
		String name = "Frog";
		String color = switch (amphibian) {
		case 1 -> {
			yield "Red";
		}
		case 2 -> {
			if (name.equals("Frog")) // case icerisinde if var ve switch sonucu bir degiskene ataniyorsa. else bloguda olmasi gerekiyor!
				yield "Green";
			else
				yield "Yellow";
		}
		case 3 -> {
			yield "Purple";
		}
		default -> throw new RuntimeException();
		};
		System.out.print(color);
	}
}
