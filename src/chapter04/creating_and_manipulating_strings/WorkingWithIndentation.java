package chapter04.creating_and_manipulating_strings;

public class WorkingWithIndentation {

	public static void main(String[] args) {
		var block = """
				a
				 b
				c""";
		var concat = " a\n" 
				+ "  b\n" 
				+ " c";
		System.out.println(block.length()); // 6
		System.out.println(concat.length()); // 9
		System.out.println(block.indent(1).length()); // 10 indent her bir satirin basina 1 tane bosluk ekleyecek.1 tane de en sona \n karakteri ekleyecek.
		System.out.println(concat.indent(-1).length()); // 7 her bir satirin basindan 1 tane bosluk silmeye calisacak.1 tane de en sonra \n ekleyecek.
		System.out.println(concat.indent(-4).length()); // 6 -4 her bir satirin basindan 4 bosluk sil demek. 4 bosluk yoksa silebildigi kadar bosluk siler
		System.out.println(concat.stripIndent().length()); // 6
	}

}
