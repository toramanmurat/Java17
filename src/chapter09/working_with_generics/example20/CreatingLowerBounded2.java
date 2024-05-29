package chapter09.working_with_generics.example20;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreatingLowerBounded2 {

	public static void main(String[] args) {
	
		List<? super IOException> exceptions=new ArrayList<Exception>();
//		exceptions.add(new Exception()); // DOES NOT COMPILE
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
		
		List<? super IOException> exceptions2=new ArrayList<IOException>();
//		exceptions.add(new Exception()); // DOES NOT COMPILE
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());

		List<? super IOException> exceptions3=new ArrayList<Object>();
//		exceptions.add(new Exception()); // DOES NOT COMPILE
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
		
		
	}
	
	
}
