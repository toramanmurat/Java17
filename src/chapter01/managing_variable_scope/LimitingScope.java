package chapter01.managing_variable_scope;

public class LimitingScope {

	public void eatIfHungry(boolean hungry) {
		// bitesOfCheese degiskeni if blogu icerisinde tanimlanmistir ve bu bloktan
		// ciktiktan sonra scope disina cikariz ve bitesOfCheese ulasilamaz.
		if (hungry) {
			int bitesOfCheese = 1;
			System.out.println(bitesOfCheese);
		} // bitesOfCheese goes out of scope here

//		System.out.println(bitesOfCheese)); Does not comğile

	}

	public void eatIfHungry2(boolean hungry) {
		if(hungry) {
			int bitesOfCheese=1;
			{
				var teenBit=true;
				System.out.println(bitesOfCheese);
//				iceride ki block disarida ki bloga erisim saglayabiliyor.
			}
		}

//		System.out.println(teenBit); Does Not Compile disarida ki block iceride ki bloga erisim saglayamaz.
	}
}
