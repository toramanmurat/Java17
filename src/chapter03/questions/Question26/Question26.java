package chapter03.questions.Question26;

public class Question26 {

	public static void main(String[] args) {
		int w = 0, r = 1;
		String name = "";
		while (w < 2) {
			name += "A";
			
			do {
				name += "B";
				if (name.length() > 0)
					name += "C";
				else
					break;
				r++;
			} while (r <= 1); // sonsuz donguye girer.
//			r++; R do-while dongusu icerisine alirsak ABCABC yazar.
			w++;
		}
		System.out.println(name);
	}
}
