package chapter07.working_with_enums.example05;

public enum OnlyOne {
	ONCE(true);

	private OnlyOne(boolean b) {
		System.out.print("constructing,");
	}
}
