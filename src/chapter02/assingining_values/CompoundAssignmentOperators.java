package chapter02.assingining_values;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {

		int a=10;
		a+=5;
		System.out.println(a);

		double b=8;
		b-=0.2;
		System.out.println(b);

		int c=3;
		c*=100;
		System.out.println(c);

		int d=4;
		d/=4;
		System.out.println(d);

		int camel = 2, giraffe = 3;
		camel = camel * giraffe; // Simple assignment operator
		camel *= giraffe; // Compound assignment operator

		System.out.println(camel); //3*2=6 , 6*3=18

//		long goat = 10;
//		int sheep = 5;
//		sheep = sheep * goat; // DOES NOT COMPILE

		long goat = 10;
		int sheep = 5;
		sheep *= goat;
		System.out.println(sheep);
	}
}
