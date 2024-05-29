package chapter04.working_with_dates_and_times;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		var now=LocalTime.now();
		var time1=LocalTime.of(20, 38);
		var time2=LocalTime.of(20, 38,25);
		var time3=LocalTime.of(20, 38,25,100);
		System.out.println(now);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);



	}
}
