package chapter04.using_the_stringbuilder_class;

public class WorkingWithtoString {

	public static void main(String[] args) {
		var sb=new StringBuilder("ABC");
		String s=sb.toString();
		System.out.println(s);
	}
}
