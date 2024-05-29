package chapter07.encapsulating_data_with_records.example13;

public record Crane13(int numberEggs, String name) {


	public Crane13(int numberEggs,String firstName,String lastname){
		this(numberEggs+1,firstName+" "+lastname);
		numberEggs=10; // No Effect
//		this.numberEggs=20; //Does Not Compile

	}


}
