package chapter01.main_method;

import java.util.Random;

public class NumberPicker {

	public static void main(String[] args) {
//		Random sinifi java.util sinifinda yer almaktadir. import etmemiz gerekmektedir.
		Random r =new Random();
		System.out.println(r.nextInt(10)); //0-9 arasinda bir sayi uretir
	}
}
