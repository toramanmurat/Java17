package chapter07.questions.question09;

public class SnakeHandler {

	private Snake snakey;
	public void setSnake(Snake mySnake) { this.snakey = mySnake; }
	
	public static void main(String[] args) {
		new SnakeHandler().setSnake(new Cobra());
//		new SnakeHandler().setSnake(new Snake());
//		new SnakeHandler().setSnake(new Object());
//		new SnakeHandler().setSnake(new String("Snake"));
		new SnakeHandler().setSnake(new GardenSnake());
		new SnakeHandler().setSnake(null);
		
		
		
		
	}
}

abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}