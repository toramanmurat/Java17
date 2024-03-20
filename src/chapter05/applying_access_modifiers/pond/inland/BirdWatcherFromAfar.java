package chapter05.applying_access_modifiers.pond.inland;

import chapter05.applying_access_modifiers.pond.shore.Bird;

public class BirdWatcherFromAfar {
	public void watchBird() {
		Bird bird = new Bird();
//		bird.floatInWater(); // DOES NOT COMPILE
//		System.out.print(bird.text); // DOES NOT COMPILE
	}

}
