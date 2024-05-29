package chapter03.questions.question07;

public class Question07 {
	public static void main(String[] args) {
		int[] weather = new int[2];
		weather[0] = 1;
		weather[1] = 2;

		print(weather);

	}

//	A
//	static private void print(int[] weather) {
//		for (int i=weather.length; i>0; i--) { //java.lang.ArrayIndexOutOfBoundsException exception
//			// weather[2] ? ornegimize gore 3 elemanli bir dizi degil
//			// weather.length-1 yaparsak kodumuz calisir.
//			System.out.println(weather[i]);
//
//		}
//	}

//	B
	static private void print(int[] weather) {
		for (int i=weather.length-1; i>=0; i--) {
			System.out.println(weather[i]);

		}
	}

//	C
//	static private void print(int[] weather) {
//		for (var w : weather) {
//			System.out.println(weather[i]); // w yazdirirsak kod derlenir.
//
//		}
//	}

//  D
//	static private void print(int[] weather) {
//		for (int i = weather.length - 1; i >= 0; i--) {
//			System.out.println(weather[i]);
//		}
//	}

//	E
//	static private void print(int[] weather) {
//		for (int i=0, int j=3; i<weather.length; ++i) {  // int i=0,j=3 yaparsak hata vermeyecektir.
//			System.out.println(weather[i]);
//		}
//	}

//	F
//	static private void print(int[] weather) {
//		for (int i = 0; ++i < 10 && i < weather.length;) { // tek elemanli bir dizi olursa birsey yazmayacaktir.
//			System.out.println(weather[i]);
//		}
//	}

}
