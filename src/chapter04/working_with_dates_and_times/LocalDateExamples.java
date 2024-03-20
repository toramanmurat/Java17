package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExamples {

	public static void main(String[] args) {
		var today = LocalDate.now();
		var date1 = LocalDate.of(2024, Month.JULY, 3);
		var date2 = LocalDate.of(1992, Month.JULY, 3);

		System.out.println(today);
		System.out.println(date1);
		System.out.println(date2);

	}

}
