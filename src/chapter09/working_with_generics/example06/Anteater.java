package chapter09.working_with_generics.example06;

import java.util.ArrayList;
import java.util.List;

public class Anteater extends LongTailAnimal{
	
//	protected void chew(List<Double> input) {} // Does Not Compile
	
	protected void chew(List<Object> input) {}
	protected void chew(ArrayList<Double> input) {}
	
	

}
