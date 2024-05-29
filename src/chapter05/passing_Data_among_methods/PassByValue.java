package chapter05.passing_Data_among_methods;

public class PassByValue {

	public static void main(String[] args) {
		int num=4;
		newNumber(num);
		System.out.println(num); //4
	}

	public static void newNumber(int num) {
		System.out.println("Baslangic degeri ="+num); //4
		num=8;
		System.out.println("Son degeri ="+num); //8
	}
}
