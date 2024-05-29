package chapter03.creating_decision_making_statements.pattern_matching;

public class ReassigningPatternVariables {
	public static void main(String[] args) {
		Number number;
		compareIntegersV1(number=100);
		compareIntegersV2(number=200);

	}

	static void compareIntegersV1(Number number) {
		if(number instanceof Integer data) {
			data=10;
			System.out.println(data); //10
		}
	}

	static void compareIntegersV2(Number number) {
		if(number instanceof final Integer data) {
//			data=10; Does Not Compile. final degiskenlerin degeri degistirilemez.
			System.out.println(data); //200
		}
	}

}
