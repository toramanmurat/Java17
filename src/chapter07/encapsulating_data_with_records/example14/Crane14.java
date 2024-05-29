package chapter07.encapsulating_data_with_records.example14;

public record Crane14(int numberEggs, String name) {

	@Override
	public int numberEggs() {
		return 10;
	}
	@Override
	public String toString() {
		return name;
	}


}
