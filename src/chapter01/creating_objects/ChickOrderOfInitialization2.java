package chapter01.creating_objects;

public class ChickOrderOfInitialization2 {

	private String name2="Fluffy";

	{System.out.println("setting fielad");}

	{System.out.println("setting fielad2");}

	public ChickOrderOfInitialization2() {
		name2="Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		ChickOrderOfInitialization2 chick2=new ChickOrderOfInitialization2();
		System.out.println(chick2.name2);

	}

	{System.out.println("setting fielad3");}
}
//ilk once initialization blocklar calisti sonra constructor calisti.

//output:
//	setting fielad
//	setting fielad2
//	setting fielad3
//	setting constructor
//	Tiny
//
