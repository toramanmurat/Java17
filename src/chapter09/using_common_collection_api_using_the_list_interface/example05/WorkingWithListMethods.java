package chapter09.using_common_collection_api_using_the_list_interface.example05;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListMethods {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SD"); // [SD]
		list.add(0, "NY"); // [NY,SD]
		list.set(1, "FL"); // [NY,FL]
		System.out.println(list.get(0)); // NY
		
		list.remove("NY"); // [FL]
		list.remove(0); // []
		list.set(0, "?"); // IndexOutOfBoundsException
		
		
	}
}

// public boolean add(E element)
//public void add(int index,E element)
//public E get(int index)
//public E remove(int index)
//public default void replaceAll(UnaryOperator<E> op)
//public E set(int index, E e)
//public default void sort(Comparator<? super E> c)