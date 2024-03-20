package chapter04.questions.question11;

import java.time.LocalDate;

public class Question11 {

	public static void main(String[] args) {
		var date = LocalDate.of(2022, 4, 3);
		date.plusDays(2);
//		date.plusHours(3); Does Not Compile
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
