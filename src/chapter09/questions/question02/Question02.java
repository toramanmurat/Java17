package chapter09.questions.question02;

import java.util.List;

public class Question02 {

	public static void main(String[] args) {

		List<?> q = List.of("mouse", "parrot"); //List.of ile eklediğimiz zaman immutable ozellige sahip.<?> extends Object anlamına gelir.
		var v = List.of("mouse", "parrot");

//		q.removeIf(String::isEmpty);
//		q.removeIf(s -> s.length() == 4);
		v.removeIf(String::isEmpty); // java.lang.UnsupportedOperationException
		v.removeIf(s -> s.length() == 4);
		
//		A. This code compiles and runs without error.
//		B. Exactly one of these lines contains a compiler error.
//		C. Exactly two of these lines contain a compiler error. +
//		D. Exactly three of these lines contain a compiler error.
//		E. Exactly four of these lines contain a compiler error.
//		F. If any lines with compiler errors are removed, this code runs without throwing an
//		exception. +
//		G. If any lines with compiler errors are removed, this code throws an exception.
	}
}
