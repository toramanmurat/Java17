package chapter04.understanding_arrays;

public class CreatingAnArrayWithReferenceVariables {

	public static void main(String[] args) {
		String[] bugs= {"cricket","beetle","ladybug"};
		String[] alias=bugs;

		System.out.println(bugs.equals(alias)); //true
		System.out.println(bugs.toString()); //[Ljava.lang.String;@452b3a41

	}
}
