package chapter01.creating_objects;

public class ChickOrderOfInitialization3 {

//	{
//		System.out.println(name3); initialization blocklar'da islem sirasi onemli
//		constructor lar da gecerli degil
//	}


	private String name3="Fluffy";

	{
		System.out.println(name3);
	}


	{System.out.println("setting fielad");}

	{System.out.println("setting fielad2");}

	public ChickOrderOfInitialization3() {
		name3="Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		ChickOrderOfInitialization3 chick2=new ChickOrderOfInitialization3();
		System.out.println(chick2.name3);

	}

	{System.out.println("setting fielad3");}
}
