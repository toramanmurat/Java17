package chapter05.applying_access_modifiers.pond.duck;

public class GoodDuckling {
	
	public void makeNoise() {
		var duck=new MotherDuck();
		duck.quack(); // package access is ok
		System.out.println(duck.noise);// package access is ok
		// ayni pakette oldugu icin erisim saglanabilir.
	}

}
