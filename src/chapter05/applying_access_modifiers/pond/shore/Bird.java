package chapter05.applying_access_modifiers.pond.shore;

public class Bird {
	protected String text = "floating";

	protected void floatInWater() {
		System.out.print(text); // protected access is ok
	}

}
