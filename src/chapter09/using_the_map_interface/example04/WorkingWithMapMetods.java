package chapter09.using_the_map_interface.example04;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMapMetods {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		
		String food=map.get("koala");
		System.out.println(food); //bamboo

		for(String key: map.keySet())
			System.out.print(key+","); //koala,giraffe,lion,
		System.out.println();
		for(String value:map.values())
			System.err.print(value+","); //bamboo,leaf,meat,
	}
}


//public void clear()	
//public boolean containsKey(Object key)  -->Returns whether key is in map. 
//public boolean containsValue(Object value)
//public Set<Map.Entry<K,V>> entrySet()
//public void forEach(BiConsumer<K key, V value>)
//public V get(Object key)
//public V getOrDefault(Object key,V defaultValue)
//public boolean isEmpty()
//public Set<K> keySet()
//public V merge(K key, V value,Function(<V, V, V> func))
//public V put(K key, V value)
//public V putIfAbsent(K key, V value)
//public V remove(Object key)
//public V replace(K key, V value)
//public void replaceAll(BiFunction<K, V, V> func)
//public int size()
//public Collection<V> values()