package chapter09.working_with_generics.example03;

import chapter09.working_with_generics.example02.Crate;

public class NamingConventionsForGenerics {

	public static void main(String[] args) {
		Elephant elephant=new Elephant();
		Crate<Elephant> crateForElephant=new Crate<Elephant>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome=crateForElephant.lookInCrate();
		
		Crate<Zebra> crateForZebra = new Crate<>(); 
//		Now we couldn’t have simply hard-coded Elephant in the Crate class since a Zebra is not an Elephant.
		Robot joeBot = new Robot();
		Crate<Robot> robotCrate = new Crate<>();
		robotCrate.packCrate(joeBot);
		
		// ship to Houston
		Robot atDestination = robotCrate.lookInCrate();
	}
}


//E for an element
//K for a map key
//V for a map value
//N for a number
//T for a generic data type
//S, U, V, and so forth for multiple generic types
