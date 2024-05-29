package chapter09.using_common_collection_api_using_the_list_interface.example06;

import java.util.LinkedList;

public class OverloadedRemoveMetods {

	public static void main(String[] args) {
		var list = new LinkedList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.remove(2); //index 2.. [3,2]
		list.remove(Integer.valueOf(2)); //value 2 .. [3]
		System.out.println(list); //3
		
		list.remove(100); //java.lang.IndexOutOfBoundsException
	}
}
