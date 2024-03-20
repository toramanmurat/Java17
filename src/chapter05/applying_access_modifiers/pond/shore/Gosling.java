package chapter05.applying_access_modifiers.pond.shore;

public class Gosling extends Bird {

	public void swim() {
		floatInWater(); // protected access is ok
		System.out.print(text); // protected access is ok
	}

	public static void main(String[] args) {
		new Gosling().swim();
	}

}
