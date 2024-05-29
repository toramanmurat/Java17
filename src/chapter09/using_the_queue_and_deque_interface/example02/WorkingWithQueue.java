package chapter09.using_the_queue_and_deque_interface.example02;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class WorkingWithQueue {
	
	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<Integer>();
		queue.add(10);
		queue.add(4);
		queue.offer(5);
		
//		System.out.println(queue.element()); 
//		System.out.println(queue.peek());
//		(FIFO) 10 , 4 , 5
		System.out.println(queue.remove()); //10 (first in, first out)
		System.out.println(queue.peek()); //4
		
		System.out.println(queue.poll()); //4
		System.out.println(queue.element());//5
		
		
		
	}

}


//Queue metods

//Add
//public boolean add(E e)
//public boolean offer(E e)

//Read
//public E element ()
//public E peek()

//Get and Remove
//public E remove()
//public E poll()