package chapter05.applying_access_modifiers.pond.duck;

public class BadDuckling {

	public void makeNoise() {
		var duck=new FatherDuck();
//		duck.quack(); //Does Not Compile
//		System.out.println(duck.noise); //Does Not Compile
		// Private degiskenlere, metodlara sadece ayni siniftan erisim saglanabilir.
	}

}
