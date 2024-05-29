package chapter09.using_common_collection_api.example08;

import java.util.Collection;
import java.util.List;

public class Iterating {

	public static void main(String[] args) {
		Collection<String> cats = List.of("Annie", "Ripley");
		cats.forEach(System.out::println); //Annie Ripley
		cats.forEach(c->System.out.println(c)); //Annie Ripley
		
	}
}

//public void forEach(Consumer<? super T> action)