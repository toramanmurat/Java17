package chapter09.using_common_collection_api.example03;

import java.util.ArrayList;
import java.util.Collection;

public class RemovingData {

	public static void main(String[] args) {
		Collection<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal")); //false
		System.out.println(birds.remove("hawk")); //true
		System.out.println(birds); //[hawk]


	}
}

//public boolean remove(Object object)