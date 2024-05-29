package chapter09.using_the_map_interface.example04;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		System.out.println(food); //bamboo
		
		for (String key: map.keySet())
			System.out.print(key + ","); //giraffe,koala,lion,
		
		System.out.println();
		for(String value:map.values())
			System.err.print(value+","); //leaf,bamboo,meat,
		
		System.out.println();
//		System.out.println(map.contains("lion")); //Does Not Compile
		System.out.println(map.containsKey("lion")); //true
		System.out.println(map.containsValue("lion")); //false
		System.err.println(map.containsValue("leaf")); //true
		System.out.println(map.size()); // 3
		map.clear();
		System.out.println(map.size());//0
		System.out.println(map.isEmpty()); // true
		
		
	}
}


// TreeMap'te key'e gore siralama yapilir ve boyle tutulur.
//The contains() method is on the Collection interface but not the Map interface