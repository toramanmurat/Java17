package chapter06.initializing_objects;

public class MouseHouse3 {

	private final int volume;
	private final String type;

	{
		this.volume=10;
	}

	public MouseHouse3(String type) {
		this.type=type;
	}

//	public MouseHouse3() { //Does Not Compile
//		type="B";
//		this.volume=2; // Does Not COmpile
//	}
}
