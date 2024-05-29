package chapter02.making_decisions_with_the_ternanry_operator;

public class TernanyOperator2 {

	public static void main(String[] args) {

		int owl=5;

		int food1=owl < 4 ? owl > 2 ? 3 : 4 : 5;
		int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);
		// ilk once own<4 kontrolu yapiliyor. bu sart uymadıgı icin direk 5 ataniyor.


		System.out.println(food1);
		System.out.println(food2);
		// Yukarida ki gibi ilk once own2<3 kontrolu yapiliyor. Dogru bir ifade oldugu icin 2. ifadeye bakilacak.
		//(own2>2 ? 3:4) own2 >2 oldugundan ekrana 3 yazdiriyor. Kucuk olmasi halinde 4 yazdiracakti.
		int owl2=3;
		int food3 = (owl2 < 4 ? ((owl2 > 2) ? 3 : 4) : 5);
		System.out.println(food3);


	}
}
