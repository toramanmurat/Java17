package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExamples {
	
	public static void main(String[] args) {
		var date1 = LocalDate.of(2024, Month.JULY, 3);
		var time1=LocalTime.of(20, 38);
		
		var zone=ZoneId.of("Asia/Kolkata");
		var currentZone=ZonedDateTime.now();
		
		var zoned1=ZonedDateTime.of(2024, 1, 21, 8, 48, 15, 20, zone);
		var zoned2=ZonedDateTime.of(date1, time1,zone);
		
		System.out.println(currentZone);
		System.out.println(zoned1);
		System.out.println(zoned2);
		
	}

}
