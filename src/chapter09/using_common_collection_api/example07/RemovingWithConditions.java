package chapter09.using_common_collection_api.example07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemovingWithConditions {

	public static void main(String[] args) {
		Collection<String> list=new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s->s.startsWith("A"));
		System.out.println(list);
		
		
		Collection<String> set = new HashSet<>();
		set.add("Wand");
		set.add("");
		set.removeIf(String::isEmpty); // s ->s.isEmpty()
		System.out.println(set); //Wand
	}
}

// public boolean removeIf(Predicate<? super E> filter)