package chapter08.working_with_variables_in_lambdas.example04;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class UsingLocalVariablesInsideALambdaBody {
	 public static void main(String[] args) {

	    }

	    private static void localVariables() {
	        BinaryOperator<Integer> bo = (a, b) -> {
	            int c = 0;
	            return 5;
	        };

	        bo.apply(1, 2);

	        BinaryOperator<Integer> bo2 = (a, b) -> {
	            //int a = 0; // DOES NOT COMPILE
	            // We tried to redeclare a, which is not allowed.
	            return 5;
	        };

	        bo2.apply(1, 2);
	    }

	    public void variables(int a) {
	        int b = 1;
//	        Predicate<Integer> p1 = a -> {
//	            int b = 0;
//	            int c = 0;
//	            return b == c;
//	        }
	    }

	

	    public void sample() {

	        Predicate<Integer> p1 = a -> returnSame(a);
	        Predicate<Integer> p2 = this::returnSame;
	        Predicate<Integer> p3 = new UsingLocalVariablesInsideALambdaBody()::returnSame;
	    }

	    private boolean returnSame(int number) {
	        return number > 100;
	    }
}
