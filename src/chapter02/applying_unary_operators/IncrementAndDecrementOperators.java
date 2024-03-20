package chapter02.applying_unary_operators;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int parkAttendance = 0;
		System.out.println(parkAttendance); // 0
		System.out.println(++parkAttendance); // 1
		
		int i=10, i2=10,i3=20,i4=20;
		System.out.println(++i); //11
		System.out.println(i2++); //10
		
		System.out.println(--i3); //19
		System.out.println(i4--); //20
		
		System.out.println(i2+i4); //30 i2=11 ve i4=19
		
		
		
		
	}
}
// ++w sayiyi 1 artirir ve yeni degerini dondurur.
// w++ sayiyi 1 artitir ve orjinal degerini dondurur.
