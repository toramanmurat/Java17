package chapter04.working_with_dates_and_times;

import java.time.Year;

public class LeapYearCheck {

	public static void main(String[] args) {
		System.out.println("1980: " + Year.isLeap(1980));//true
		System.out.println("2000: " + Year.isLeap(2000));//true
		System.out.println("2016: " + Year.isLeap(2016));//true
		System.out.println("2020: " + Year.isLeap(2020));//true
		System.out.println("2304: " + Year.isLeap(2304));//true
		System.out.println("2304: " + Year.isLeap(2100));//false

	}
}
