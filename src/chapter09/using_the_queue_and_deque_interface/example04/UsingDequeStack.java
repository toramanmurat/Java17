package chapter09.using_the_queue_and_deque_interface.example04;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingDequeStack {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(10); //10
		stack.push(4); //4-10
		stack.push(2); // 2-4-10
		
		System.out.println(stack.peek()); //2
		
		System.out.println(stack.poll());//2
		System.out.println(stack.peek()); //4
		System.out.println(stack.poll()); //4
		
		System.out.println(stack.peek()); //10
		System.out.println(stack.poll()); //10
		
		System.out.println(stack.peek()); //null
		System.out.println(stack.poll()); //null
		System.out.println(stack.poll()); //null
		
		
		
	}
}


//FIFO
//Add to the front/top 
//public void push(E e)
//
//Remove from the front/top 
//public E pop()
//
//Get first element
//public E peek()