package chapter03.creating_decision_making_statements.if_statement;

public class IfStatement {

	public static void main(String[] args) {
		int morningGreetingCount=5;
		int hourOfDay = 10;
		if (hourOfDay < 11)
			System.out.println("Good Morning");
		
		if(hourOfDay < 11)
			System.out.println("Good Morning v2");
		    morningGreetingCount++; // if bloguna girmez her sekilde calisir
		System.out.println(morningGreetingCount);
		    
		if(hourOfDay < 10) {
			System.out.println("Good Morning v2");
		    morningGreetingCount++; // if blogunda sart saglanmadigi icin morningGreetingCount arttirilmadi.
		}
		System.out.println(morningGreetingCount);
		
		
	}
}
