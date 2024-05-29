package chapter05.overloading_metods;

public class Kiwi {
	public void fly(int numMiles) {
		System.out.println("int");
	}

	public void fly(Integer numMiles) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		Kiwi kiwi=new Kiwi();
		kiwi.fly(5); // int
		kiwi.fly((Integer)5); //Integer
		kiwi.fly(Integer.valueOf(5)); //Integer

	}
}
