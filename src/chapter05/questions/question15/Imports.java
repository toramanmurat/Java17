package chapter05.questions.question15;

//import static java.util.Collections; //Does Not Compile
//OK
import static java.util.Collections.sort;

import java.util.ArrayList;
//import static java.util.Collections.sort(ArrayList<String>); Does Not Compile
//static import java.util.Collections;  //Does Not Compile import olmasi gerekir.
//static import java.util.Collections.*;  //Does Not Compile
//static import java.util.Collections.sort(ArrayList<String>);  //Does Not Compile
public class Imports {
	public void method(ArrayList<String> list) {
		sort(list);
	}
}
