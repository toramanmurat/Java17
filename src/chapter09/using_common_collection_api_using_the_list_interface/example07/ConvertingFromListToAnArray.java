package chapter09.using_common_collection_api_using_the_list_interface.example07;

import java.util.ArrayList;
import java.util.List;

public class ConvertingFromListToAnArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		list.clear();
		System.out.println(list); //[]
		System.out.println(objectArray.length); //2
		System.out.println(stringArray.length);  //2
	}
}
