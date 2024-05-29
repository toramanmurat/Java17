package chapter09.using_common_collection_api.example01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsingTheDiamondOperator {

	private void longFormat() {
		List<String> list=new ArrayList<>();
		Map<Long, List<Integer>> mapLists=new HashMap<>();
	}

	private void shortFormat() {
		List<String> list=new ArrayList<>();
		Map<Long, List<Integer>> mapLists=new HashMap<>();
	}

	private void invalidFormat() {
//		List<> list=new ArrayList<String>();  //Does Not Compile

	}

	class InvalidUse {
//		void use(List<> data) {} //Does Not Compile
	}

}
