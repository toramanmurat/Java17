package chapter07.implementing_interfaces.example05.v01;

public class Bear implements Herbivore,Omnivore {

	@Override
	public void eatPlants() {
		
		System.out.println("Eating plants! ");
		
	}

}
