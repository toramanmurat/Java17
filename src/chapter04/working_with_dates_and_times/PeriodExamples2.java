package chapter04.working_with_dates_and_times;

import java.time.Period;

public class PeriodExamples2 {

	public static void main(String[] args) {
		var annually=Period.ofYears(1); // P1Y -->1 Year
		var quarterly=Period.ofMonths(3); // P3M -->3 Month
		var everyThreeWeeks=Period.ofWeeks(3); // P21D --> 21 Day
		var everyOtherDay=Period.ofDays(2);
		var everyYearAndWeek=Period.of(1, 0, 7);
		
		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(everyThreeWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndWeek);
		
		var wrong=Period.ofYears(3).ofWeeks(1); //en sonda ki aktif olur
		
		System.out.println(wrong);
	}
}
