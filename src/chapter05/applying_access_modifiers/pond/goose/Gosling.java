package chapter05.applying_access_modifiers.pond.goose;

import chapter05.applying_access_modifiers.pond.shore.Bird;

public class Gosling extends Bird{ // kalitim oldugu icin erisim saglanir.

	public void swim() {
		floatInWater();
		System.out.println(text);
	}

	public static void main(String[] args) {
		new Gosling().swim();
	}
}
