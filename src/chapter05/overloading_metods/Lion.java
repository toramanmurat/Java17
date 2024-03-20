package chapter05.overloading_metods;

public class Lion {

	public static void walk(int[] ints) {
		System.out.println("int[]");
	}

	public static void walk(Integer[] integers) {
		System.out.println("Integer[]");
	}

	public static void main(String[] args) {
		int[] numbers=new int[] {1,2,6};
		Lion.walk(numbers);
		
		Integer[] sizes= {10,20,60};
		Lion.walk(sizes);
		
	}
}
