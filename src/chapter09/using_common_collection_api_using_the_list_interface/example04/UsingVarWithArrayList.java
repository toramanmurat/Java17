package chapter09.using_common_collection_api_using_the_list_interface.example04;

import java.util.ArrayList;

public class UsingVarWithArrayList {

	public static void main(String[] args) {
		var strings = new ArrayList<String>();
		strings.add("a");
		for (String s: strings) {
			System.out.println(s);
		}
		
		
		var list = new ArrayList<>(); // ArrayList<Object>
		list.add("a");
//		for (String s: list) { } // DOES NOT COMPILE
		for(Object s:list) {
			System.out.println(s);
		}
	}
}
