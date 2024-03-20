package chapter03.creating_decision_making_statements.pattern_matching;

public class PatternMatchingFlowScoping {
	
	static void printIntegerGreaterThan5(Number number) {
		if(number instanceof Integer data && data.compareTo(5)>0)
			System.out.println(data);
	}
	
	void printIntegerOrNumbersGreaterThan5(Number number) {
//		if(number instanceof Integer data || data.compareTo(5)>0) // Does Not Compile. Veya operatoru kullandigimiz icin 
//			// solda ki durum false olabilir. sagdaki undifend olabilir.
//			System.out.println(data);
	}

}
