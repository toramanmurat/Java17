package chapter04.using_the_stringbuilder_class;

public class StringBuilderDeleteContents {

	public static void main(String[] args) {
		var sb = new StringBuilder("abcdef");
		sb.delete(1, 3);
		System.out.println(sb); //adef
		
		System.out.println("#Example2");
		var sb2 = new StringBuilder("abcdef");
		sb2.delete(1, 100); // sb = a
		System.out.println(sb2);
	}
}
