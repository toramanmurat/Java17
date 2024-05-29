package chapter01.creating_objects;

public class Egg {

	public Egg() {
		number=5;

	}
	public static void main(String[] args) {
		Egg egg=new Egg();
		System.out.println(egg.number);
	}

	private int number=3;

	{number=4;}

}

// ilk olarak number 3 , sonra initializer block calisir ve number 4 olur, en son constructor calisir ve son deger 5 olur ve ekrana 5 basar.