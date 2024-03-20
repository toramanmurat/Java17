package chapter02.questions.question10;

public class Question10 {

	public static void main(String[] args) {
		short height = 1, weight = 3;
//		short zebra = (byte) weight * (byte) height; Does Not Compile. int literali zebra int yaparsak calisir.
		int zebra = (byte) weight * (byte) height;
		double ox = 1 + height * 2 + weight; // int degiskeni double atayabiliriz.
		long giraffe = 1 + 9 % height + 1; // long degiskeni double atayabiliriz.
		System.out.println(zebra);
		System.out.println(ox);
		System.out.println(giraffe);
	}
}
