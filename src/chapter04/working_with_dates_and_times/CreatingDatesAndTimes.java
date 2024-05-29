package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class CreatingDatesAndTimes {

	public static void main(String[] args) {
		System.out.println(LocalDate.now()); //yil-ay-gun bilgisini tutacaktir.
		System.out.println(LocalTime.now()); //saat-dakika-saniye
		System.out.println(LocalDateTime.now());// yil-ay-gun ve saat-dakika-saniye
		System.out.println(ZonedDateTime.now());// yil-ay-gun ve saat-dakika-saniye Zone bilgisi
	}

}
