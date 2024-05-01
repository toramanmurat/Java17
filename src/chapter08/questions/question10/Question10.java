package chapter08.questions.question10;

import java.util.List;
import java.util.function.Predicate;

public class Question10 {
	public void remove(List<Character> chars) {
		char end = 'z';
//		char start = 'a'; //Does Not Compile
//		char c = 'x'; //Does Not Compile
		chars = null; //Ok
		
		Predicate<Character> predicate = c -> {
			char start = 'a';
			return start <= c && c <= end;
		};
		// INSERT LINE HERE
		
		char start = 'a'; //Ok
		char c = 'x'; //Ok
		chars = null; //Ok
//		end = '1'; //Does Not Compile
		
		
		
	}
}
