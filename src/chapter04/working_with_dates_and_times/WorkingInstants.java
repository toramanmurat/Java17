package chapter04.working_with_dates_and_times;

import java.time.Instant;

public class WorkingInstants {

	public static void main(String[] args) throws InterruptedException {

		var now=Instant.now();

		 Thread.sleep(1000);
		var later=Instant.now();

		System.out.println(now);
		System.out.println(later);


	}
}


//  GMT saat diliminde belirli bir ani temsil eder