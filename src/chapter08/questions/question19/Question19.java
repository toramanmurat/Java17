package chapter08.questions.question19;

import java.util.Set;
import java.util.function.Consumer;

public class Question19 {

	public static void main(String[] args) {
		Set<?> set = Set.of("lion", "tiger", "bear");
		var s = Set.copyOf(set);
//		Consumer<Object> consumer = () -> System.out.println(s); //Does Not Compile
//		Consumer<Object> consumer = s -> System.out.println(s); //Does Not Compile
//		Consumer<Object> consumer =(s) ->System.out.println(s); //Does Not Compile
//		Consumer<Object> consumer =System.out.println(s); //Does Not Compile
//		Consumer<Object> consumer=System::out::println; //Does Not Compile
		Consumer<Object> consumer=System.out::println;

		s.forEach(consumer);
	}
}
