package chapter03.questions.question10;

import java.time.DayOfWeek;

public class Question10 {

	public static void main(String[] args) {
		getWeekDay(5, 2);

	}

	static private DayOfWeek getWeekDay(int day, final int thursday) {
		int otherDay = day;
		int Sunday = 0;
		switch (otherDay) {
		default:
//		case 1:
//			continue;  // continue kullanamayiz
//		case thursday:
//			return DayOfWeek.THURSDAY; // final degil!
		case 2, 10:
			break;
//		case Sunday: // degisken final olmadigi icin 
//			return DayOfWeek.SUNDAY;
//		case DayOfWeek.MONDAY: // int tipinde degil 
//			return DayOfWeek.MONDAY;
		}
		return DayOfWeek.FRIDAY;
	}

}
