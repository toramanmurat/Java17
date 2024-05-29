package chapter09.using_common_collection_api.example11;

import java.util.ArrayList;

public class UnboxingNulls {

	public static void main(String[] args) {
		var heights = new ArrayList<Integer>();
		heights.add(null);
		int h = heights.get(0); //java.lang.NullPointerException:
	}
}
