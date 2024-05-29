package chapter09.using_common_collection_api_using_the_list_interface.example02;

import java.util.Arrays;
import java.util.List;

public class CreatingAListWithAFactory {

	public static void main(String[] args) {
		String [] array=new String[] {"a","b","c"};
		
		List<String> asList=Arrays.asList(array); //[a, b, c]
		List<String> of=List.of(array); //[a, b, c]
		List<String> copy=List.copyOf(asList); //[a, b, c]
		
		array[0]="z";
		
		System.out.println(asList); //[z, b, c]
		System.out.println(of); //[a, b, c]
		System.out.println(copy); //[a, b, c]
		
		asList.set(0, "x");
		System.out.println(Arrays.toString(array)); //[x, b, c]
		
		copy.add("y"); //java.lang.UnsupportedOperationException
	}
}


//								add ?	Replace?	Delete?
// Arrays.asList(varargs)       No		Yes			No
// List.of(varargs)				No		No			No
// List.copyOf(Collection)      No		No			No
