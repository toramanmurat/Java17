package chapter07.encapsulating_data_with_records.example08;

public record Crane(int numberEggs, String name) {

//	public Crane(int numberEggs, String name) {} //Does Not Compile. Constructor icerisinde final oldugu icin deger atamasi yapmaliyiz.
	public Crane(int numberEggs, String name) {
		if (numberEggs < 0) {
			throw new IllegalArgumentException();
		}
		this.numberEggs = numberEggs;
		this.name = name;
	}

}
