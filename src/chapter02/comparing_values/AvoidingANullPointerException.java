package chapter02.comparing_values;

public class AvoidingANullPointerException {

	public static void main(String[] args) {

		Duck duck = null;

		Duck duck2=new Duck();
		duck2.age=3;
		
		methodNoException(duck);
		methodNoException(duck2);
//		methodNullPointerException(duck);

	}

	static void methodNoException(Duck duck) {
		if (duck != null && duck.getAge() < 5) {
			System.out.println("No Exception");
			
		}

	}

	static void methodNullPointerException(Duck duck) {
		if (duck != null & duck.getAge() < 5) { // Could throw a NullPointerException
			// Do something
		}
	}
}

class Duck {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

//Null Pointer Exception bir referans degisken uzerinden bir metoda erismeye calistigimizda ortaya cikacaktir.