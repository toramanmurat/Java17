package chapter09.working_with_generics.example16;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundedWildcards {

	public static void printList(List<Object> list) {
		for (Object x : list)
			System.out.println(x);
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<String>();
		keywords.add("java");
//		printList(keywords); //Does Not Compile
		// A String is a subclass of an Object. This is true. However,List<String>
		// cannot be assigned to List<Object>
		
		List<Object> obj=new ArrayList<Object>();
		obj.add("java");
		printList(obj);
	}
}
