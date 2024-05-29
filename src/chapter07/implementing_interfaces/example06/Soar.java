package chapter07.implementing_interfaces.example06;

public interface Soar {

	int MAX_HEIGHT = 10;

	final static boolean UNDERWATER = true;

	void fly(int speed);

	abstract void takeoff();

	public abstract double dive();

//	public static final int MAX_HEIGHT = 10;
//	public final static boolean UNDERWATER = true;
//	public abstract void fly(int speed);
//	public abstract void takeoff();
//	public abstract double dive();

}
