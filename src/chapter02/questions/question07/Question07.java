package chapter02.questions.question07;

public class Question07 {

	public static void main(String[] args) {
		int ph = 7, vis = 2, dh = 7;
		boolean clear = vis > 1 & (vis < 9 || ph < 2);
		boolean safe = (vis > 2) && (ph++ > 1);
		boolean tasty = 7 <= --ph; // azaltip donduruyor.
		boolean tasty2 = 7 <= dh--; // orjinalini donduruyor sonra azaltiyor.
		System.out.println(clear + "-" + safe + "-" + tasty + "// bu deneme amacli:" + tasty2);

	}
}
