package chapter05.accessing_static_data;

public class ZooInventoryManager {
	private static final String[] treats = new String[10];

	public static void main(String[] args) {
		treats[0] = "popcorn";
	}

}
