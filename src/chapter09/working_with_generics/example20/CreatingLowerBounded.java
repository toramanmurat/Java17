package chapter09.working_with_generics.example20;

import java.util.ArrayList;
import java.util.List;

public class CreatingLowerBounded {

	public static void main(String[] args) {
		List<String> strings=new ArrayList<String>();
		strings.add("tweet");
		
		List<Object> onjects=new ArrayList<Object>(strings);
		
		addSound(strings);
		addSound(onjects);
	}
	
	public static void addSound(List<? super String> list) { //string veya stringin super class'ı
		list.add("quack");
	}
}
