package chapter04.using_the_stringbuilder_class;

public class MutabilityAndChaining {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		System.out.println(sb); // start+middle
		StringBuilder same = sb.append("+end");

		System.out.println(same); // start+middle+end

		System.out.println("Example2");
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a); // abcdefg
		System.out.println("b=" + b); // abcdefg
	}

}

// StringBuilder immutable degildir.