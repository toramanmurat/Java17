package chapter09.working_with_generics.example21;

import java.util.ArrayList;
import java.util.List;

public class CombiningGenericDeclarations {

	public static void main(String[] args) {
		
		List<?> list1=new ArrayList<A>();
		List<? extends A> list2=new ArrayList<A>();
		List<? super A> list3=new ArrayList<A>();
		
		list3.add(new A());
		list3.add(new B());
		list3.add(new C());
		
//		List<? extends B> list4=new ArrayList<A>(); //Does Not Compiler
		List<? super B> list5=new ArrayList<A>();
//		List<?> list6=new ArrayList<? extends A>(); //Does Not Compiler
	}
	
}


class A{}

class B extends A{}

class C extends B{}