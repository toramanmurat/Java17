package chapter05.applying_access_modifiers.pond.duck;

import chapter05.applying_access_modifiers.pond.goose.Goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
//		goose.floatInWater(); // DOES NOT COMPILE
	}

}
