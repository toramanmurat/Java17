package chapter09.using_common_collection_api.example06;

import java.util.ArrayDeque;
import java.util.Collection;

public class CheckContets {

	public static void main(String[] args) {
		Collection<String> birds=new ArrayDeque<>();
		birds.add("hawk");
		System.out.println(birds.contains("hawk")); //true
		System.out.println(birds.contains("robin")); //false
	}
}


// public boolean contains(Object object)