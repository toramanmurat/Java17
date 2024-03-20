package chapter06.creating_immutable_objects.example01;

public class AnimalTest {

	public static void main(String[] args) {
		var zebra = new Animal();
		System.out.println(zebra.getFavoriteFoods()); // [Apples]
		
		
		//Favorite Foods degistirdik. Bu durumda immutable özelliğe sahip degil.
		zebra.getFavoriteFoods().clear();
		zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
		System.out.println(zebra.getFavoriteFoods()); // [Chocolate Chip Cookies]
	}

}
