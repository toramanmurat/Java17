package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulatingImmutable {

	public static void main(String[] args) {
		var date = LocalDate.of(2024, Month.JANUARY, 20);
		date.plusDays(10); //immutable oldugu icin bir degere atamamiz lazim
		System.out.println(date); //2024-01-20
		
		var date2=date.plusDays(10);
		System.out.println(date2);//2024-01-30
	}
}
