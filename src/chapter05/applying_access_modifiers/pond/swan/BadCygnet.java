package chapter05.applying_access_modifiers.pond.swan;

import chapter05.applying_access_modifiers.pond.duck.MotherDuck;

public class BadCygnet {
	
	public void makeNoise() {
		var duck=new MotherDuck();
//		duck.quack(); // Does Not Compile
//		System.out.println(duck.noise); //Does Not Compile
		
		// farkli bir paketten erisim saglamaya calistigimizda hata aliriz.
	}

}
