package chapter09.questions.question15;

import java.util.LinkedList;
import java.util.List;

public class Question15 {

	public static void main(String[] args) {
//		List<Integer> q=new LinkedList<Integer>(); //10
//		Queue<Integer>q=new LinkedList<>(); //10,12
		var q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.print(q);
	}
}
