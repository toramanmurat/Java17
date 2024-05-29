package chapter07.questions.question21;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {
	public static int MAX_STORAGE = 100;
	public RabbitFood() {
		this(10,"Brand",LocalDate.now());

//		size = MAX_STORAGE;
//		this.size = 10;
//		if(expires.isAfter(LocalDate.now())) throw new
//		RuntimeException();
//		if(brand==null) super.brand = "Unknown";
//		throw new RuntimeException();



	}

}
