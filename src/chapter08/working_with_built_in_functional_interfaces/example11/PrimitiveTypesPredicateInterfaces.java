package chapter08.working_with_built_in_functional_interfaces.example11;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class PrimitiveTypesPredicateInterfaces {

	public static void main(String[] args) {

        doublePredicateExample();
        intPredicateExample();
	}
	
	private static void doublePredicateExample() {

        System.out.println("Predicate-Double ###");

        DoublePredicate doubleP1 = (d) -> d > 1.5;
       

        DoublePredicate doubleP2 = Double::isInfinite;
        DoublePredicate doubleP3 = Double::isNaN;
        DoublePredicate doubleP4 = Double::isFinite;

        System.out.println(doubleP1.test(0.5));
      

        System.out.println(doubleP2.test(Double.POSITIVE_INFINITY));
        System.out.println(doubleP3.test(Double.NaN));
        System.out.println(doubleP4.test(Double.MAX_VALUE));
    }
	
	   private static void intPredicateExample() {

	        System.out.println("Predicate-Int");

	        IntPredicate doubleP1 = (d) -> d > 1.5;
	      

	        System.out.println(doubleP1.test(5));
	      
	    }
}
