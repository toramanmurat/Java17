package chapter05.accessing_static_data;

public class Gorilla {
	public static int count;

	public static void addGorilla() {
		count++;
	}

	public void babyGorilla() {
		count++;
	}

	public void announceBabies() {
		addGorilla();
		babyGorilla();

	}

	public static void announceBabiesToEveryone() {
		addGorilla();
//		babyGorilla(); // DOES NOT COMPILE instance metod!!
	}

	public int total;

//	public static double average= total / count; // DOES NOT COMPILE 

}
