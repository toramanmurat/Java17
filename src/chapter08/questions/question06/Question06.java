package chapter08.questions.question06;

import java.util.function.Predicate;

public class Question06 {

	public static void main(String[] args) {
//		A. s ->s.isEmpty() Ok
//		B. s -->s.isEmpty()
//		C. (String s) ->s.isEmpty() Ok
//		D. (String s) -->s.isEmpty()
//		E. (StringBuilder s) ->s.isEmpty() 
//		F. (StringBuilder s) -->s.isEmpty()
		
		Predicate<String> ps1=s->s.isEmpty();
		Predicate<String> ps2=(String s) ->s.isEmpty();
	}
}
