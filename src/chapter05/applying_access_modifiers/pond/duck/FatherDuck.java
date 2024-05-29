package chapter05.applying_access_modifiers.pond.duck;

public class FatherDuck {

	private String noise="quack";

	private void quack() {
		System.out.println(noise); // Private :Ayni sinifta yer aldigi icin degiskene erisim saglayabilir
	}

}

