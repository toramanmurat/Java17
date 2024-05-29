package chapter09.using_common_collection_api_using_the_list_interface.example03;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreatingaListWithaConstructor {

	public static void main(String[] args) {
		var linked1 = new LinkedList<String>();
		linked1.add("#dumyy1");
		linked1.add("#dumyy2");
		var linked2 = new LinkedList<String>(linked1);
		System.out.println(linked1);
		System.out.println(linked2);
		
		var list1 = new ArrayList<String>();
		list1.add("#value1");
		list1.add("#value2");
		list1.add("#value3");
		list1.add("#value4");
		var list2 = new ArrayList<String>(list1);
		var list3 = new ArrayList<String>(10);
		list3.add("#Valuee");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}
