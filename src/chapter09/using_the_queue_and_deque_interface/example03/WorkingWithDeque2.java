package chapter09.using_the_queue_and_deque_interface.example03;

import java.util.Deque;
import java.util.LinkedList;

public class WorkingWithDeque2 {

	public static void main(String[] args) {
		Deque<Integer> deque=new LinkedList<Integer>();
		deque.addFirst(12); //12
		deque.offer(10); //10-12
		deque.addLast(8); //10-12-8
		deque.offerLast(14); //10-12-8-14
		
		System.out.println(deque.getFirst()); //12
		System.out.println(deque.peekFirst()); //12
		
		System.out.println(deque.getLast());//14
		System.out.println(deque.peekLast()); //14
		
		System.out.println(deque.removeFirst()); //12
		System.out.println(deque.peekFirst()); //10
		System.out.println(deque.pollFirst()); //10
		System.out.println(deque.getFirst());  //8
		
		System.out.println(deque.removeLast()); //14
		System.out.println(deque.pollLast()); //8
		
		
		
	}
}
