package chapter07.implementing_interfaces.example11;

public class CatV2 implements Walk,Run{
	
	public int getSpeed() {
		return 1;
	}
	
	public int getWalkSpeed() {
		return Run.super.getSpeed();
//		return Walk.super.getSpeed();
	}

}
