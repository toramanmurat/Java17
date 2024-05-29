package chapter05.declaring_local_and_instance_veriables;

import chapter01.understanding_theclass_structure.field_and_methods.Animal;

public class LocalVeriableModifiers {

	public void zooAnimalCheckup(boolean isWeekend) {
		final int rest;
		if(isWeekend) {
			rest=5;
		} else {
			rest=20;
		}
		System.out.println(rest);

		final var giraffe=new Animal();
		final int[] friends=new int[5];

//		rest=10; //Does Not Compile ; bir final degiskene iki defa deger atamasi yapamayiz.
//		giraffe=new Animal(); //Does Not Compile
//		friends=null; //Does Not Compile

	}

	public void zooAnimalCheckup2(boolean isWeekend) {
		final int rest;
		if(isWeekend)
		 {
			rest=5; //bir else blogu olsa derleme hatasi ortadan kalkar. (else blogunun icerisinde rest atama yapmaliyiz!)
//		System.out.println(rest); //Does Not Compile
		}
	}

	public void zooAnimalCheckup(){
		final int rest=5;
		final Animal giraffe=new Animal();
		final int[] friends=new int[5];
		giraffe.setName("George");
		friends[2]=2;
	}

}
