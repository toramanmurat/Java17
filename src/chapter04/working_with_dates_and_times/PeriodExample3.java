package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodExample3 {
	
	public static void main(String[] args) {
		 var date = LocalDate.of(2022, 1, 20);
		 var time = LocalTime.of(6, 15);
		 var dateTime = LocalDateTime.of(date, time);
		 var period = Period.ofMonths(1);
		 System.out.println(date.plus(period)); // 2022–02–20
		 System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
		 System.out.println(time.plus(period)); // Exception java.time.temporal.UnsupportedTemporalTypeException:
		 //LocalTime --> saat dakika saniye gibi bilgiler tutar !
		 
	}

}
