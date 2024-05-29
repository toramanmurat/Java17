package chapter05.accessing_static_data;

public class SnakeTester {

	public static void main(String[] args) {

		System.out.println(Snake.hiss); //2

		Snake s=new Snake();
		System.out.println(Snake.hiss); //2
		s=null;
		System.out.println(Snake.hiss); //2

		Snake.hiss=4;
		Snake snake1=new Snake();
		Snake snake2=new Snake();
		Snake.hiss=6;
		Snake.hiss=5;

		System.out.println(Snake.hiss); //5
	}
}
