package chapter04.questions.question16;

public class Question16 {
	
	public static void main(String[] args) {
		var base = "ewe\nsheep\\t";
		int length = base.length();
		int indent = base.indent(2).length();
		int translate = base.translateEscapes().length();
		var formatted = "%s %s %s".formatted(length, indent, translate);
		System.out.format(formatted);
	}

}
