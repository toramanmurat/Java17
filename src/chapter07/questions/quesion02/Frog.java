package chapter07.questions.quesion02;

public class Frog implements CanHop{
	public static void main(String[] args) {
		Frog frog=new TurtleFrog();
		TurtleFrog frog2=new TurtleFrog();
//		BrazilianHornedFrog frog3=new TurtleFrog();
		CanHop frog4=new TurtleFrog();
		var frog5=new TurtleFrog();
//		Long frog6=new TurtleFrog();
		
		
	}

}

class BrazilianHornedFrog extends Frog{}

class TurtleFrog extends Frog{}