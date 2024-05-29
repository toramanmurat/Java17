package chapter06.initializing_objects.example3;

public class Cuttlefish {
	private String name = "swimmy";

	{
		System.out.println(name);
	}

	private static int COUNT = 0;

	static {
		System.out.println(COUNT);
	}

	{
		COUNT++;
		System.out.println(COUNT);
	}

	public Cuttlefish() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Ready");
		new Cuttlefish();

	}
}

//0
//Ready
//swimmy
//1
//Constructor
