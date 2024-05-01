package chapter07.questions.quesion04;

public sealed class ArmoredAnimal permits Armadillo {
	public ArmoredAnimal(int size) {
	}

	@Override
	public String toString() {
		return "Strong";
	}

	public static void main(String[] a) {
		var c = new Armadillo(10, null);
		System.out.println(c);
	}
}
final class Armadillo extends ArmoredAnimal {
	@Override
	public String toString() {
		return "Cute";
	}

	public Armadillo(int size, String name) {
		super(size);
	}
}

//sealed tanimlanan bir class,
// permit anahtar kelimesi olacak.
// permit edilen class; sealed ya non-sealed yada final olarak tanimlanmalidir.