package chapter01.main_method;

import java.util.*;

//java.util.Random yerine wildcard kullanarak java.util.* şeklinde import edebiliriz.util class'inda ki child packages'lar haric import eder. 

public class Wildcards {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));

	}

}
