package chapter04.working_with_dates_and_times;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodVsDuration {

	public static void main(String[] args) {
		var date=LocalDate.of(2022, 5, 25);
		var period=Period.ofDays(1);
		var days=Duration.ofDays(1);

		System.out.println(date.plus(period));
		System.out.println(date.plus(days)); //java.time.temporal.UnsupportedTemporalTypeException
	}
}

//Duration LocalDate ile calismaz.
