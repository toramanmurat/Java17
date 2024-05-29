package chapter07.encapsulating_data_with_records.example07;

public record Crane(int numberEggs,String name) implements Bird {

	@Override
	public void fly() {
		System.out.println("#Crane fly");

	}

}


//Bir record bir interface implements edebilir.