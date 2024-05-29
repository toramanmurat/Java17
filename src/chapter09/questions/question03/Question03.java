package chapter09.questions.question03;

import java.util.ArrayDeque;

public class Question03 {

	public static void main(String[] args) {
		var greetings = new ArrayDeque<String>();
		greetings.offerLast("hello");
		System.out.println("#first OfferLast "+greetings); //hello
		greetings.offerLast("hi"); 
		System.out.println("#second OfferLast "+greetings); // hello hi
		greetings.offerFirst("ola"); 
		System.out.println("#first OfferFirst "+greetings); //ola hello hi
		greetings.pop(); //remove first
		System.out.println("#Pop "+greetings); //hello, hi
		greetings.peek(); // elemanı getirir ancak cikartmaz.
		System.out.println("#Peek "+greetings); //[hello, hi]
		
		
		while(greetings.peek()!=null)
			System.out.print(greetings.pop()); //hellohi
	}
}
