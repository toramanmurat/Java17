package chapter04.questions.question03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question03 {

	public static void main(String[] args) {
		methodA();
//		methodB();
		methodC();
		methodD();
//		methodE();
	}
	
	private static void methodA() {
		var zone = ZoneId.of("US/Eastern");
		var date = LocalDate.of(2022, 3, 13);
		var time = LocalTime.of(2, 15);
		var z = ZonedDateTime.of(date, time, zone);
		System.out.println("#A : "+z);
		
	}
	
	private static void methodB() {
		var zone = ZoneId.of("US/Eastern");
		var date = LocalDate.of(2022, 3, 40); //40 hatali
		var time = LocalTime.of(2, 15);
		var z = ZonedDateTime.of(date, time, zone);
		System.out.println("#B : "+z);
		
	}
	
	private static void methodC() {
		var zone = ZoneId.of("US/Eastern");
		var date = LocalDate.of(2022, 11, 6);
		var time = LocalTime.of(2, 6);
		var z = ZonedDateTime.of(date, time, zone);
		System.out.println("#C : "+z);
		
	}
	
	private static void methodD() {
		var zone = ZoneId.of("US/Eastern");
		var date = LocalDate.of(2022, 11, 7);
		var time = LocalTime.of(2, 6);
		var z = ZonedDateTime.of(date, time, zone);
		System.out.println("#D : "+z);
		
	}
	
	private static void methodE() {
		var zone = ZoneId.of("US/Eastern");
		var date =LocalDate.of(2023, 2, 29); //java.time.DateTimeException 2023 Subat 29 cekmiyor.
		var time = LocalTime.of(2, 6);
		var z = ZonedDateTime.of(date, time, zone);
		System.out.println("#E : "+z);
		
	}
	
	
}
