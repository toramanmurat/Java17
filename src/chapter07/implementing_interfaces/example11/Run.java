package chapter07.implementing_interfaces.example11;

public interface Run {
	
	public default int getSpeed() {
		return 10;
	}

}
