package chapter02.applying_unary_operators;

public class NegationOperators {

	public static void main(String[] args) {
		boolean isAnimalAsleep = false;
		System.out.println(isAnimalAsleep); // false

		// ! operatoru false ise true, true ise false yapar.
		isAnimalAsleep = !isAnimalAsleep;
		System.out.println(isAnimalAsleep); // true

		// ~ operatoru
		int value = 3;
		int complement = ~value;
		System.out.println(value); // 3 (00000000 00000000 00000000 0000000011)
		System.out.println(complement); // -4 (~ operatoru 0'lari 1 , 1'leri 0 yapacak. 11111111 11111111 11111111
										// 11111100) ilk bit sayinin negatif oldugunu gosteririr

		// Kural -1 ile carp sonra 1 cikar
		System.out.println(-1 * value - 1);
		System.out.println(-1 * complement - 1);

		// - operatoru
		double zooTemperature = 1.21;
		System.out.println(zooTemperature); // 1.21
		zooTemperature = -zooTemperature;
		System.out.println(zooTemperature); // -1.21
		zooTemperature = -(-zooTemperature);
		System.out.println(zooTemperature); // -1.21

		// ! boolean ifadelerde kullanilir. - boolean ifadelerde kullanamayiz . 
//		int pelican = !5; // DOES NOT COMPILE
//		boolean penguin = -true;// DOES NOT COMPILE
//		boolean peacock = !0; // DOES NOT COMPILE

	}

}
