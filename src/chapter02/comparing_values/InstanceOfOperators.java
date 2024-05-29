package chapter02.comparing_values;

public class InstanceOfOperators {

	public static void main(String[] args) {
		Integer zooTime = Integer.valueOf(9);
		Number num = zooTime;
		Object obj = zooTime;
		openZoo(num);


	}

	public static void openZoo(Number time) {
		if (time instanceof Integer) {
			System.out.print(time + " O'clock");
		} else {
			System.out.print(time);
		}
	}
}
