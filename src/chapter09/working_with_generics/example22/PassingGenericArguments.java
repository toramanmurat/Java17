package chapter09.working_with_generics.example22;

import java.util.List;

public class PassingGenericArguments {

	public static void main(String[] args) {
		var reference=new PassingGenericArguments();
		
		List<String> strings=List.of("s1","s2");
		List<Integer> integers=List.of(1,2);
		
		System.out.println(reference.first(strings));
		System.out.println(reference.first(integers));
		
	}
	
	<T> T first(List<? extends T> list) {
		return list.get(0);
	}
	
//	<T> <? extends T> second(List<? extends T> list){ //Does Not Compile
//		return list.get(0);
//	 <? extends T> boyle bir donus tipi 
//	}
	
//	<B extends A> B third(List<B> list) {
//		return new B(); //Does Not Compile
//	}
//	
	
	void fourth(List<? super B> list) {}
	
//	<X> void fifth(List<X super B> list) {} //Does Not Compile
	
	
	static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
	
}
