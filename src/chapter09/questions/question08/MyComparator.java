package chapter09.questions.question08;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.toLowerCase().compareTo(o1.toLowerCase());
	}
	
	public static void main(String[] args) {
		String[] values= {"123","Abb","aab"};
		
		Arrays.sort(values,new MyComparator());
		
		for(var s:values) {
			System.out.println(s+" "); //abb, aab, 123
		}
	}
	

}
