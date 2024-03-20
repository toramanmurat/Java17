package chapter02.working_binary_aritmetic_operators;

public class NumericPromotion {

	public static void main(String[] args) {
		PromotionV1();
		PromotionV2();
		PromotionV3();
	}

	private static void PromotionV1() {
		int x = 1;
		long y = 33;
		var z = x * y;

		System.out.println(z + " veri tipi: " + ((Object) z).getClass().getName());
	}

	private static void PromotionV2() {
		double x = 39.21;
		float y = 2.1f;
		var z = x + y;

		System.out.println(z + " veri tipi: " + ((Object) z).getClass().getName());

	}

	private static void PromotionV3() {
		short w = 14;
		float x = 13;
		double y = 30;
		var z = w * x / y;
		System.out.println(z + " veri tipi: " + ((Object) z).getClass().getName());
	}

}
