package chapter10.questions.question02;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question02 {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.startsWith("g");
		var stream1 = Stream.generate(() -> "growl!");
		var stream2 = Stream.generate(() -> "growl!");
		var b1 = stream1.anyMatch(predicate);
		var b2 = stream2.allMatch(predicate); //sonsuz
		System.out.println(b1 + " " + b2);
	}
}

//A. true false
//B. true true
//C. java.util.stream.ReferencePipeline$3@4517d9a3
//D. The code does not compile.
//E. An exception is thrown.
//F. The code hangs. ++