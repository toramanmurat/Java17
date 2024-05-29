package chapter04.calculating_wiht_math_apis;

import java.util.Random;

public class GeneratingRandomNumbers {

	public static void main(String[] args) {
		System.out.println(Math.random()); // 0-1 arasinda bir deger uretir
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());


		// java.util.Random sinifi
		Random random=new Random();
		System.out.println("java.util.Random sinifi");
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10)); //0 ile 10 arasinda sayi uretir.

	}

}

//public static double random()