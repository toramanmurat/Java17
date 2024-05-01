package chapter07.encapsulating_data_with_records.example11;

public record Crane11(int numberEggs, String name) {

	
	public Crane11 {
		numberEggs=5;
//		this.numberEggs=10; //Does Not Compile
	}
	
	
}
