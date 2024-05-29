package chapter06.inheriting_members.example05;

public class Shark extends Fish{

	@Override
	public void swim() {}

//	@Override //Does Not Compile
	public void swim(int speed) {} //Does Not Compile @Override anotation olmadiginda hata vermeyecektir.

}
