package chapter04.working_with_dates_and_times;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationsExample {

	public static void main(String[] args) {
		var daily = Duration.ofDays(1); // PT24H -->24 Hours
		var hourly = Duration.ofHours(1); // PT1H -->1 Hours
		var everyMinute = Duration.ofMinutes(1); // PT1M -->1 Minute
		var everyTenSeconds = Duration.ofSeconds(10); // PT10S
		var everyMilli = Duration.ofMillis(1); // PT0.001S
		var everyNano = Duration.ofNanos(1); // PT0.000000001S

		System.out.println(daily);
		System.out.println(hourly);
		System.out.println(everyMinute);
		System.out.println(everyTenSeconds);
		System.out.println(everyMilli);
		System.out.println(everyNano);

		durationsExamples2();

	}

	private static void durationsExamples2() {
		var daily = Duration.of(1, ChronoUnit.DAYS);
		var hourly = Duration.of(1, ChronoUnit.HOURS);
		var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
		var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
		var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
		var everyNano = Duration.of(1, ChronoUnit.NANOS);

		System.out.println("#ChronoUnit");
		System.out.println(daily);
		System.out.println(hourly);
		System.out.println(everyMinute);
		System.out.println(everyTenSeconds);
		System.out.println(everyMilli);
		System.out.println(everyNano);
	}
}
