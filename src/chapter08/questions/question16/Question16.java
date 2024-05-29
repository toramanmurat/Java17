package chapter08.questions.question16;

import java.util.List;
import java.util.function.Predicate;

public class Question16 {

	public void remove(List<Character> chars) {
		char end = 'z';

//		char start = 'a'; //Does Not Compile
//		char c = 'x'; //Does Not Compile
		chars = null;
//		end = '1';  //Does Not Compile

		Predicate<Character> predicate = c -> {
			char start = 'a';
			return start <= c && c <= end;
		};
	}
}
