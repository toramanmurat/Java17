package chapter10.questions.question03;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Quesiton03 {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 3;
		var stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
		var b1 = stream.noneMatch(predicate);
		var b2 = stream.anyMatch(predicate);
		System.out.println(b1 + " " + b2);
	}
}

// java.lang.IllegalStateException: stream has already been operated upon or closed
//If two different streams were  used, the result would be option B.
// nonMatch ve anyMatch terminal operation'dır aynı stream üzerinde ikisini cagıramayız.

//A. false false
//B. false true
//C. java.util.stream.ReferencePipeline$3@4517d9a3
//D. The code does not compile.
//E. An exception is thrown. ++
//F. The code hangs.
