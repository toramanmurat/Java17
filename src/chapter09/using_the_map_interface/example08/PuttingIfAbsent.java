package chapter09.using_the_map_interface.example08;

import java.util.HashMap;
import java.util.Map;

public class PuttingIfAbsent {

	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites); //{Tom=Tram, Jenny=Bus Tour, Sam=Tram}
	}
}


// Key-value ciftinde value deger atanmissa putIfAbsent() metodu bunu atlar.
// eger value null ise degeri ekler.