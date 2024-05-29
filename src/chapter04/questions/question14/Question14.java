package chapter04.questions.question14;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question14 {

	public static void main(String[] args) {
		methodA();
//		methodB();
//		methodC();
//		methodD();
//		methodE();
		methodF();


	}

	private static void methodA() {
		var date = LocalDate.now();
		var time = LocalTime.now();
		var dateTime = LocalDateTime.now();
		var zoneId = ZoneId.systemDefault();
		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		Instant instant=Instant.now();
		System.out.println("#A time:"+time);
		System.out.println("#A dateTime:"+dateTime);
		System.out.println("#A zoneId:"+zoneId);
		System.out.println("#A zonedDateTime:"+zonedDateTime);
		System.out.println("#A instant:"+instant);
	}

//	private static void methodB() {
//		var time = LocalTime.now();
//		var dateTime = LocalDateTime.now();
//		var zoneId = ZoneId.systemDefault();
//		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
//		Instant instant=new Instant();
//
//	}

//	private static void methodC() {
//		var time = LocalTime.now();
//		var dateTime = LocalDateTime.now();
//		var zoneId = ZoneId.systemDefault();
//		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
//		Instant instant =date.toInstant();
//		System.out.println("#A time:"+time);
//		System.out.println("#A dateTime:"+dateTime);
//		System.out.println("#A zoneId:"+zoneId);
//		System.out.println("#A zonedDateTime:"+zonedDateTime);
//		System.out.println("#A instant:"+instant);
//
//
//	}

//	private static void methodD() {
//		var time = LocalTime.now();
//		var dateTime = LocalDateTime.now();
//		var zoneId = ZoneId.systemDefault();
//		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
//		Instant instant =dateTime.toInstant();
//		System.out.println("#A time:"+time);
//		System.out.println("#A dateTime:"+dateTime);
//		System.out.println("#A zoneId:"+zoneId);
//		System.out.println("#A zonedDateTime:"+zonedDateTime);
//		System.out.println("#A instant:"+instant);
//	}

//	private static void methodE() {
//	var time = LocalTime.now();
//	var dateTime = LocalDateTime.now();
//	var zoneId = ZoneId.systemDefault();
//	var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
//	Instant instant =time.toInstant();
//	System.out.println("#A time:"+time);
//	System.out.println("#A dateTime:"+dateTime);
//	System.out.println("#A zoneId:"+zoneId);
//	System.out.println("#A zonedDateTime:"+zonedDateTime);
//	System.out.println("#A instant:"+instant);
//}
//


	private static void methodF() {
		var time = LocalTime.now();
		var dateTime = LocalDateTime.now();
		var zoneId = ZoneId.systemDefault();
		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		Instant instant =zonedDateTime.toInstant();
		System.out.println("#F time:"+time);
		System.out.println("#F dateTime:"+dateTime);
		System.out.println("#F zoneId:"+zoneId);
		System.out.println("#F zonedDateTime:"+zonedDateTime);
		System.out.println("#F instant:"+instant);
	}




}
