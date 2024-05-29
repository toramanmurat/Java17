package chapter06.creating_immutable_objects.example03;

import java.util.ArrayList;

public final class Animal { // Not an immutable object declaration
	private final ArrayList<String> favoriteFoods;

	public Animal() {
		this.favoriteFoods = new ArrayList<>();
		this.favoriteFoods.add("Apples");
	}

	 public int getFavoriteFoodsCount() {
	        return favoriteFoods.size();
	    }

	public ArrayList<String> getFavoriteFoods() {
		return new ArrayList<>(this.favoriteFoods);
	}

}
