package chapter01.understanding_theclass_structure.field_and_methods;


public class Animal {
	
// Java class'larinin 2 önemli öğesi vardır. 
// 1- Methods
// 2- Fields
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

class Animal2{}

// JAava'da bir class'ta sadece 1 tane public class olabilir.
// public class Animal3{}