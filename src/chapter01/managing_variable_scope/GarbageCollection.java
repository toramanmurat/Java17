package chapter01.managing_variable_scope;

public class GarbageCollection {

	public static void main(String[] args) {
		String one,two;
		one=new String("a"); // yeni bir nesne olustu ve one bunu gosteriyor.
		two=new String("b"); // yeni bir nesne olustu ve two bunu gosteriyor.
		one=two; // one b nesnesini gosteriyor.
		String three=one; // three b nesnenisi gosteriyor.
		one=null;

	}
}
