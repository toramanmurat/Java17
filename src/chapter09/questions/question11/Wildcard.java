package chapter09.questions.question11;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Wildcard {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		Wildcard card=new Wildcard();
//		List<?> list = new HashSet <String>(); //Does Not Compile
		ArrayList<? super Date> list1 = new ArrayList<Date>();
//		List<?> list2 = new ArrayList<?>(); //Does Not Compile
//		List<Exception> list3 = new LinkedList<java.io.IOException>(); //Does Not Compile
		ArrayList <? extends Number> list4= new ArrayList <Integer>();
		card.showSize(list1);
		card.showSize(list4);
	}
}
