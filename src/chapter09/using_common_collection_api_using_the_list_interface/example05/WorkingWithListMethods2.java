package chapter09.using_common_collection_api_using_the_list_interface.example05;

import java.util.Arrays;

public class WorkingWithListMethods2 {

	public static void main(String[] args) {
		var numbers = Arrays.asList(1, 2, 3);
		numbers.replaceAll(x -> x * 2);
		System.out.println(numbers); // [2, 4, 6]

	}
}

//public E get(int index)
//public E remove(int index)
//public default void replaceAll(UnaryOperator<E> op)
//public E set(int index, E e)
//public default void sort(Comparator<? super E> c)