package chapter09.using_the_map_interface.example07;

import java.util.HashMap;
import java.util.Map;

public class ReplcaingValues {

	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 4);
		
		Integer orginial=map.replace(2, 10); // 4
		System.out.println(orginial); //4
		System.out.println(map); //{1=2, 2=10}
		
		map.replaceAll((k,v)-> k+v);
		System.out.println(map); //{1=3, 2=12}
		
	}
}
