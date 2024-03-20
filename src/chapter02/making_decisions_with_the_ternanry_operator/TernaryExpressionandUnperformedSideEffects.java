package chapter02.making_decisions_with_the_ternanry_operator;

public class TernaryExpressionandUnperformedSideEffects {

	public static void main(String[] args) {
		int sheep = 1;
		int zzz = 1;
		int sleep = zzz<10 ? sheep++ : zzz++;
		System.out.println(sheep + "," + zzz); // 2,1
		
		
		int sheep1 = 1;
		int zzz1 = 1;
		int sleep1 = zzz>=10 ? sheep1++ : zzz1++;
		System.out.print(sheep1 + "," + zzz1); // 2,1
		
	}
}
