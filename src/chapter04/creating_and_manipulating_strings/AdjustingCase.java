package chapter04.creating_and_manipulating_strings;

import java.util.Locale;

public class AdjustingCase {

	public static void main(String[] args) {

		var name="animals";
		System.out.println(name.toUpperCase()); //ANİMALS
		System.out.println(name.toUpperCase(Locale.UK)); //ANIMALS
		System.out.println(name.toUpperCase(Locale.US));//ANIMALS
		System.out.println("TesT12TeSST".toLowerCase()); //test12tesst
	}

//	public String toUpperCase(Locale locale)
}
