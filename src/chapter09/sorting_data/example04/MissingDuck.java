package chapter09.sorting_data.example04;

import java.util.ArrayList;
import java.util.Collections;

public class MissingDuck implements Comparable<MissingDuck>{
	private String name;

	@Override
	public int compareTo(MissingDuck quack) {
		if(quack==null)
			throw new IllegalArgumentException("Poorly formed duck!");
		
		if(this.name==null &&quack.name==null)
			return 0;
		else if(this.name==null)
			return -1;
		else if(quack.name==null)
			return 1;
		
		else return name.compareTo(quack.name);
	}
	
	
	public static void main(String[] args) {
		 var missingDuck=new ArrayList<String>();
		 missingDuck.add(null);
		 missingDuck.add("Dummy");
		 missingDuck.add(null);
		 missingDuck.add("MissingDuck");
		 
		 Collections.sort(missingDuck);
		 System.out.println(missingDuck);
		 
	}
	
	
	

}
