package chapter07.working_with_enums.example04;

public enum SeasonV2 {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	private final String expectedVisitors;

	private SeasonV2(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}

//Enum constructor'ları private' tir