package chapter07.implementing_interfaces.example11;

public interface Walk {

	public default int getSpeed(){
		return 5;
	}


}
