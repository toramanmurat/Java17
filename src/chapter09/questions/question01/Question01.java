package chapter09.questions.question01;

import java.util.TreeMap;

public class Question01 {
//	Suppose you need to display a collection of products for sale, which may contain duplicates.
//	Additionally, you have a collection of sales that you need to track, sorted by the natural order
//	of the sale ID, and you need to retrieve the text of each. Which two of the following from the
//	java.util package best suit your needs for this scenario? (Choose two.)
	
//	A. ArrayList +
//	B. HashMap
//	C. HashSet
//	D. LinkedList
//	E. TreeMap +
//	F. TreeSet 
	
	// treeMap ve treeSet sirali bir sekilde tutulur.
	// ArrayList duplicate elemana izin verir
	
	public static void main(String[] args) {
		TreeMap<String, String> treeMap=new TreeMap<String, String>();
		treeMap.put("A", "1");
		treeMap.put("C", "2");
		treeMap.put("D", "3");
		treeMap.put("B", "4");
		
		System.out.println(treeMap);
	}
}
