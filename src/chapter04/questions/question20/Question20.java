package chapter04.questions.question20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Question20 {

	public static void main(String[] args) {
		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime1 = ZonedDateTime.of(date, time, zone);
		var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		int hour = dateTime2.getHour();
		boolean offset = dateTime1.getOffset()
		== dateTime2.getOffset();
		System.out.println("diff = " + diff);
		System.out.println("hour = " + hour);
		System.out.println("offset = " + offset);
	}
}
