package chapter06.creating_immutable_objects.example01;

import java.util.ArrayList;
import java.util.List;

public final class Animal { // Not an immutable object declaration
	private final ArrayList<String> favoriteFoods;

	public Animal() {
		this.favoriteFoods = new ArrayList<>();
		this.favoriteFoods.add("Apples");
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}

}

// İmmutable objeler bir kez olusturulduktan sonra degeri degistirilemeyen objelerdir.

// Declaring an immutable Class
// 1- class final olmali ve bütün constructor'lar private olmali
// 2- instance variables private and final olmali.
// 3- setter metodlar tanimlanmamali. (getter metodlar olabilir)
// 4-