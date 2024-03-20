package chapter06.creating_immutable_objects.example03;

public class AnimalTest {

	public static void main(String[] args) {
		var zebra = new Animal();
        System.out.println(zebra.getFavoriteFoods()); // [Apples]

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoods()); // [Apples]
	}

}
