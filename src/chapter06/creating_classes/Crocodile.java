package chapter06.creating_classes;

public class Crocodile extends Reptile{
	protected int speed = 20;
	public int getSpeed() {
//		 return speed; //20
		return super.speed; //print 10
	 }
	
	public static void main(String[] args) {
		var croc=new Crocodile();
		System.out.println(croc.getSpeed()); //20
	}

}
