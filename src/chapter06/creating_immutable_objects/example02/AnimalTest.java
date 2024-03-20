package chapter06.creating_immutable_objects.example02;

public class AnimalTest {

	public static void main(String[] args) {
		var zebra = new Animal();
		
		System.out.println(zebra.getFavoriteFoodsCount());
		System.out.println(zebra.getFavoriteFoodsItem(0));
		
		
	}
}
