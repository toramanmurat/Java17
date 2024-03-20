package chapter02.questions.question09;

public class Question09 {

	public static void main(String[] args) {
		int a = 2, b = 4, c = 2;
		System.out.println(a > 2 ? --c : b++); // 4
		// a > 2 ifadesi false oldugundan dolayi b++ calisacak. post-increment 4 yazar ve b yi 1 arttirir
		System.out.println(b= (a != c ? a : b++)); //5 yazar
		// a !=c false oldugundan b++ calisacak. b nin degeri 5 once ki satirda 5 olmustu.b ye 5 atayacak.
		//b nin yeni degeri 5.
		System.out.println((a != c ? a : b++)); //5 yazar ve b yi alti yapar.
		// Peki System.out.println(b= (a != c ? a : b++)); b= ifadesini kaldirirsak ne degisir.
		System.out.println(b); // b nin degeri 6 olur
		System.out.println(a > b ? b < c ? b : 2 : 1);
		// a > b false oldugundan 1 yazacak.
	}

}
