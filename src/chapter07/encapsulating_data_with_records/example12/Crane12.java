package chapter07.encapsulating_data_with_records.example12;

public record Crane12(int numberEggs, String name) {

	
	public Crane12(String firstName,String lastname){
		this(0,firstName+" "+lastname);
		
	}
	
	
}
