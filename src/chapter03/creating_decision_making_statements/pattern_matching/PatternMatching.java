package chapter03.creating_decision_making_statements.pattern_matching;

public class PatternMatching {

	public static void main(String[] args) {
		Number number;
		compareIntegersV1(number=100);
		compareIntegersV2(number=200);
		
		
	}
	
	static void compareIntegersV1(Number number) {
		if(number instanceof Integer) {
			Integer data=(Integer) number;
			System.out.println(data.compareTo(10));
		}
	}
	
	static void compareIntegersV2(Number number) {
		if(number instanceof Integer data) {
			System.out.println(data.compareTo(10));
		}
	}
}

// JAva 16 ile eklenmistir.
