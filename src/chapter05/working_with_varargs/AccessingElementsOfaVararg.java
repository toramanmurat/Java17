package chapter05.working_with_varargs;

public class AccessingElementsOfaVararg {

	public static void run(int...steps) {
		System.out.println(steps[1]); // 77
	}

	public static void main(String[] args) {
		run(11,77);
	}

}
