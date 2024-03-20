package chapter06.declaring_constructors;

public class Turtle {
	

	private String name;
	private int age;
	
	// contructor overloading
	public Turtle() {
		name="John Doe";
		System.out.println("#Default Constructor ="+name);
	}
	
	public Turtle(int age) {
		System.out.println("#int Constructor ="+age);
	}
	
	public Turtle(long age) {}
	
	public Turtle(String newName,String... favoriteFoods) {
		name=newName;
	}
	
	public static void main(String[] args) {
		new Turtle();
		new Turtle(15);
	}
	
	
	

}
