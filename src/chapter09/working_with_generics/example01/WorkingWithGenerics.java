package chapter09.working_with_generics.example01;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenerics {

	static void printNames(List list) {
		for(int i=0;i<list.size();i++) {
			String name=(String) list.get(i); //java.lang.ClassCastException
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		List names = new ArrayList();
//		List<String> names=new ArrayList<String>(); //Does Not Compile
		names.add(new StringBuilder("Webby"));
		printNames(names);
	}
}

//the code throws a ClassCastException that java.lang.StringBuilder cannot be cast to java.lang.String.