package chapter07.understanding_polymorphism.example03;

public class BadCasts {
	
	public static void main(String[] args) {
		Wolf wolfy=new Wolf();

		Dog badWolf=(Dog)wolfy; //runtime zamaninda exception verecektir.
	}

}
