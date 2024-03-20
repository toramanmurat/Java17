package chapter04.using_the_stringbuilder_class;

public class StringBuilderInsertingData {

	public static void main(String[] args) {
		var sb = new StringBuilder("animals");
		sb.insert(7, "-"); // sb = animals-
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals-
		System.out.println(sb);
	}

}
