package chapter05.accessing_static_data;

public class Panda {
	final static String name = "Ronda";
	static final int bamboo;
//	static final double height; // DOES NOT COMPILE deger atamaliyiz!
	static {
		bamboo = 5;
	}

}
