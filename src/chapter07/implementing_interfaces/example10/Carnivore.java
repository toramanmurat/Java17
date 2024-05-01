package chapter07.implementing_interfaces.example10;

public interface Carnivore {
	
//	public default void eatMeat(); //Does Not Compile
	
	public default void eatMeat() {}
	
	public default int getRequiredFoodAmount() { //Does Not Compile
		return 13;
	}
	
//	public int getRequiredFoodAmount() { //Does Not Compile
//		return 13;
//	}

}
