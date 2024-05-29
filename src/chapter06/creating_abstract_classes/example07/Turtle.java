package chapter06.creating_abstract_classes.example07;

public abstract class Turtle {

//	public abstract long eat() //Does Not Compile
	public abstract long eat();

//	public abstract void swim() {}; //Does Not Compile . abstract classlarda govde olmaz.
	public abstract void swim();

//	public abstract int getAge() { //Does Not Compile
//		return 10;
//	}
//
//	public abstract void sleep; //Does Not Compile
	public abstract void sleep();

//	public void goInShell(); //Does Not Compile
	public int goInShell() {
		return 10;
	}



}
