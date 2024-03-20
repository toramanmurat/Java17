package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitForDifferences {
	
	public static void main(String[] args) {
		var one = LocalTime.of(5, 15);
		var two = LocalTime.of(6, 30);
		var date = LocalDate.of(2016, 1, 20);
		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//		System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
	}

}
