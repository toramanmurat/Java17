package chapter09.using_the_queue_and_deque_interface.example03;

import java.util.Deque;
import java.util.LinkedList;

public class WorkingWithDeque {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.offerFirst(10); //10
		deque.offerLast(4); // 10-4
		System.out.println(deque.peekFirst()); //10
		System.out.println(deque.pollFirst()); //10
		System.out.println(deque.pollLast()); //4 
		System.out.println(deque.pollFirst()); //null
		System.out.println(deque.peekFirst()); //null
		
		
		
		
	}
}
//LIFO(last-in, first-out)

//Deque methods
//
//Add to front
//public void addFirst(E e)
//public boolean offerFirst(E e)
//
//
//Add to back
//public void addLast(E e)
//public boolean offerLast(E e)
//
//Read from front
//public E getFirst()
//public E peekFirst()
//
//Read from back
//public E getLast()
//public E peekLast()
//
//Get and remove from front 
//public E removeFirst()
//public E pollFirst()
//
//Get and remove from back 
//public E removeLast()