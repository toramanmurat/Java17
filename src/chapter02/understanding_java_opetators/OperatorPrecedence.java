package chapter02.understanding_java_opetators;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int height=20, lenght=10;
		
		// ilk once carpma islemi yapilacaktir. 
		// carpma islemi toplama isleminden daha onceliklidir.
		var perimete= 2*height+2*lenght;
		
		var perimete2=((2*height)+(2*lenght));
		
		System.out.println(perimete);
		System.out.println(perimete2);
	}
}
