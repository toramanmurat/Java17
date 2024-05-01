package chapter07.encapsulating_data_with_records.example09;

public record Crane(int numberEggs, String name) {

	// compact constructor.
	public Crane {
		if(numberEggs<0) {
			throw new IllegalArgumentException();
		}
		
		name=name.toUpperCase();
	}
	
	// Long constructor implicitly called at end of compact constructor

}
