package chapter08.questions.question03;

public class Question03 {

//	A functional interface can contain default and private methods. Ok
//	B. A functional interface can be defined as a class or an interface. false.
//	C. Abstract methods with signatures that are contained in public methods of
//	java.lang.Object do not count toward the abstract method count for a functional
//	interface. //Ok
//	D. A functional interface cannot contain static or private static methods. //false
//	E. A functional interface must be marked with the @FunctionalInterface annotation. //false
}


@FunctionalInterface
interface TestB{
	abstract boolean testMethodB();
	 class A{}
	 interface B{}

}

@FunctionalInterface
interface TestD{
	abstract boolean testMethodD();
//	static void methodD();
//	private static void methodD();

}