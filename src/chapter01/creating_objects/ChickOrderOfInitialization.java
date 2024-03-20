package chapter01.creating_objects;

public class ChickOrderOfInitialization {
	
	private String name="Fluffy";
	{System.out.println("setting fielad");}
	
	public ChickOrderOfInitialization() {
		name="Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		ChickOrderOfInitialization chick=new ChickOrderOfInitialization();
		System.out.println(chick.name);
				
	}
//Output:
//	setting fielad
//	setting constructor
//	Tiny

}

// Fields ve instance initializer block Lar hangi sirada yer alirsa o sirada calisirlar
// Constructor fields ve instance initializer calistiktan sonra calisirlar.