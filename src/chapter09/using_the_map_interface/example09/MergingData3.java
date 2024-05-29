package chapter09.using_the_map_interface.example09;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergingData3 {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> null;

		Map<String, String> favorites = new HashMap<String, String>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Bus Tour");

		favorites.merge("Jenny", "Skyride", mapper);
		favorites.merge("Sam", "Skyride", mapper);
		System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}

// metod null dondugu icin map'ten cikarildi.
	}
}
