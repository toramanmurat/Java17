package chapter09.working_with_generics.example16;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundedWildcards4 {

	public static void main(String[] args) {
		List<?> x1=new ArrayList<>();
		var x2=new ArrayList<>(); //var tipi ArrayList
	}
}
