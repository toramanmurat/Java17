package chapter09.questions.question04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Question04 {

	public static void main(String[] args) {
//		HashSet<Number> hs = new HashSet<Integer>(); //Does Not Compile
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
//		List<> list = new ArrayList<String>(); // Does Not Compile
//		List<Object> values = new HashSet<Object>();  //Does Not Compile
//		List<Object> objects = new ArrayList<? extends Object>(); //Does Not Compile
		Map<String, ? extends Number> hm = new HashMap<String, Integer>();

	}
}
