package chapter01.main_method;

//import java.lang.System; Java'da java.lang.System otomatik olarak import edilmiştir.
//import java.lang.*; Java'da java.lang otomatik olarak import edilmiştir.

import java.util.Random;
//import java.util.*; java.util.Random 
public class NumberPicker2 {
	
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextInt(10));
	}

}
