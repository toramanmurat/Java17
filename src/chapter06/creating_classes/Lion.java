package chapter06.creating_classes;

public class Lion extends Animal{
	
	protected void setProperties(int age,String n) {
		setAge(age);
		name=n;
	}
	
	public void roar() {
		System.out.println(name+", age"+getAge()+",says: Roar!");
//		System.out.println("Lions age: "+ age);  Does Not Compile. private degiskenler inheritance edilmezler.
	}
	
	public static void main(String[] args) {
		var lion=new Lion();
		lion.setProperties(3, "kion");
		lion.roar();
	}

}
