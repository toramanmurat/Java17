package chapter05.overloading_metods;

public class Dove {
	public void fly(int numMiles) {
		System.out.println("int");
	}

	public void fly(short numFeet) {
		System.out.println("short");
	}

	public static void main(String[] args) {
		Dove dove=new Dove();
		dove.fly(5);
		dove.fly((short)5);

	}

}
