package chapter09.using_the_map_interface.example02;

import java.util.Map;

public class MaoOfAndMapCopyOfMethod {
	
	public static void main(String[] args) {
		
		Map.of("key1","value1","key2","value2");
		
		Map.ofEntries(Map.entry("key1","value1"),
				Map.entry("key2","value2"));
	}

}


//Map.of ile olusturdugumuz map immutable ozellige sahiptir.