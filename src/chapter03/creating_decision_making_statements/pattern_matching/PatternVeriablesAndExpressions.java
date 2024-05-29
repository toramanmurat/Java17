package chapter03.creating_decision_making_statements.pattern_matching;

public class PatternVeriablesAndExpressions {

	static void printIntegersGreater(Number number) {
		if(number instanceof Integer data && data.compareTo(5)>0) {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		Number number;
		printIntegersGreater(number=10);
		printIntegersGreater(number=15);
		printIntegersGreater(number=3);

	}

}
