package chapter06.creating_immutable_objects.example02;

import java.util.ArrayList;
import java.util.List;

public final class Animal { // An immutable object declaration

	private final List<String> favoriteFoods;

	public Animal() {
		this.favoriteFoods = new ArrayList<String>();
		this.favoriteFoods.add("Apples");
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFoodsItem(int index) {
		return favoriteFoods.get(index);
	}

}
