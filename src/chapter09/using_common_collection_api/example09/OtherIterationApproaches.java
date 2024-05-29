package chapter09.using_common_collection_api.example09;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class OtherIterationApproaches {

	public static void main(String[] args) {
		Collection<String> cats = List.of("Annie", "Ripley","Dummy");
		
		Iterator<String> iter=cats.iterator();
		while(iter.hasNext()) {
			String string=iter.next();
			System.out.println(string); // Annie Ripley Dummy
		}
		
	}
}
